package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.*;
import com.blueprintmate.model.entity.*;
import com.blueprintmate.repository.FormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class FormService {
    @Autowired
    private FormRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;
    @Autowired
    private ClientService clientService;
    @Autowired
    private DescriptionService descriptionService;
    @Autowired
    private ExperienceService experienceService;
    @Autowired
    private BuildingService buildingService;
    @Autowired
    private ToiletService toiletService;
    @Autowired
    private EntranceHallService entranceHallService;
    @Autowired
    private LivingRoomService livingRoomService;
    @Autowired
    private DiningRoomService diningRoomService;
    @Autowired
    private KitchenService kitchenService;
    @Autowired
    private NewAppliancesInKitchenService newAppliancesInKitchenService;
    @Autowired
    private ReuseAppliancesInKitchenService reuseAppliancesInKitchenService;
    @Autowired
    private NecessaryAppliancesInKitchenService necessaryAppliancesInKitchenService;
    @Autowired
    private NecessaryAppliancesInLaundryService necessaryAppliancesInLaundryService;
    @Autowired
    private LaundryService laundryService;
    @Autowired
    private BathroomService bathroomService;
    @Autowired
    private MasterSuiteService masterSuiteService;
    @Autowired
    private DescendantsSuiteService descendantsSuiteService;
    @Autowired
    private GuestsSuiteService guestsSuiteService;
    @Autowired
    private HomeOfficeSuiteService homeOfficeSuiteService;
    @Autowired
    private GeneralInfoService generalInfoService;
    @Autowired
    private StyleAndMoodsService styleAndMoodsService;
    @Autowired
    private ContextService contextService;

    public void createForm(FormCreateDTO formCreateDTO) {
        User authenticatedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client retrievedClient = clientService.findClientByUserId(authenticatedUser.getId());

        Description newDescription = descriptionService.setUpDescription(formCreateDTO.getDescription());
        Experience newExperience = experienceService.setUpExperience(formCreateDTO.getExperience());
        Building newBuilding = buildingService.setUpBuilding(formCreateDTO.getBuilding());
        Toilet newToilet = toiletService.setUpToilet(formCreateDTO.getToilet());
        EntranceHall newEntranceHall = entranceHallService.setUpEntranceHall(formCreateDTO.getEntranceHall());
        LivingRoom newLivingRoom = livingRoomService.setUpLivingRoom(formCreateDTO.getLivingRoom());
        DiningRoom newDiningRoom = diningRoomService.setUpDiningRoom(formCreateDTO.getDiningRoom());
        Kitchen newKitchen = kitchenService.setUpKitchen(formCreateDTO.getKitchen());
        Laundry newLaundry = laundryService.setUpLaundry(formCreateDTO.getLaundry());
        Bathroom newBathroom = bathroomService.setUpBathroom(formCreateDTO.getBathroom());
        MasterSuite newMasterSuite = masterSuiteService.setUpMasterSuite(formCreateDTO.getMasterSuite());
        DescendantsSuite newDescendantsSuite = descendantsSuiteService.setUpDescendantsSuite(formCreateDTO
                .getDescendantsSuite());
        GuestsSuite newGuestsSuite = guestsSuiteService.setUpGuestsSuite(formCreateDTO.getGuestsSuite());
        HomeOfficeSuite newHomeOfficeSuite = homeOfficeSuiteService.setUpHomeOfficeSuite(formCreateDTO
                .getHomeOfficeSuite());
        GeneralInfo newGeneralInfo = generalInfoService.setUpGeneralInfo(formCreateDTO.getGeneralInfo());
        StyleAndMoods newStyleAndMoods = styleAndMoodsService.setUpStyleAndMoods(formCreateDTO.getStyleAndMoods());
        Context newContext = contextService.setUpContext(formCreateDTO.getContext());

        Form newForm = modelMapperHelper.convertFormCreateDTOToForm(formCreateDTO);
        newForm.setClient(retrievedClient);
        save(newForm);

        descriptionService.createDescription(newDescription, newForm);
        experienceService.createExperience(newExperience, newForm);
        buildingService.createBuilding(newBuilding, newForm);
        toiletService.createToilet(newToilet, newForm);
        entranceHallService.createEntranceHall(newEntranceHall, newForm);
        livingRoomService.createLivingRoom(newLivingRoom, newForm);
        diningRoomService.createDiningRoom(newDiningRoom, newForm);
        kitchenService.createKitchen(newKitchen, newForm);
        newAppliancesInKitchenService.createNewAppliancesInKitchen(
                formCreateDTO.getKitchen().getAppliances(), newKitchen);
        reuseAppliancesInKitchenService.createReuseAppliances(
                formCreateDTO.getKitchen().getAppliances(), newKitchen);
        necessaryAppliancesInKitchenService.createNecessaryAppliances(
                formCreateDTO.getKitchen().getAppliances(), newKitchen);
        laundryService.createLaundry(newLaundry, newForm);
        necessaryAppliancesInLaundryService.createNecessaryAppliances(
                formCreateDTO.getLaundry().getNecessaryAppliancesOnLaundryList(), newLaundry);
        bathroomService.createBathroom(newBathroom, newForm);
        masterSuiteService.createMasterSuite(newMasterSuite, newForm);
        descendantsSuiteService.createDescendantsSuite(newDescendantsSuite, newForm);
        guestsSuiteService.createGuestsSuite(newGuestsSuite, newForm);
        homeOfficeSuiteService.createHomeOfficeSuite(newHomeOfficeSuite, newForm);
        generalInfoService.createGeneralInfo(newGeneralInfo, newForm);
        styleAndMoodsService.createStyleAndMoods(newStyleAndMoods, newForm);
        contextService.createContext(newContext, newForm);
    }

    public void updateFormById(int id, FormUpdateDTO formUpdateDTO) {
        Form retrievedForm = getOptionalEntity(repository.findById(id));

        Description retrievedDescription = descriptionService.findDescriptionByForm(retrievedForm);
        Experience retrievedExperience = experienceService.findExperienceByForm(retrievedForm);
        Building retrievedBuilding = buildingService.findBuildingByForm(retrievedForm);
        Toilet retrievedToilet = toiletService.findToiletByForm(retrievedForm);
        EntranceHall retrievedEntranceHall = entranceHallService.findEntranceHallByForm(retrievedForm);
        LivingRoom retrievedLivingRoom = livingRoomService.findLivingRoomByForm(retrievedForm);
        DiningRoom retrievedDiningRoom = diningRoomService.findDiningRoomByForm(retrievedForm);
        Kitchen retrievedKitchen = kitchenService.findKitchenByForm(retrievedForm);
        Laundry retrievedLaundry = laundryService.findLaundryByForm(retrievedForm);
        Bathroom retrievedBathroom = bathroomService.findBathroomByForm(retrievedForm);
        MasterSuite retrievedMasterSuite = masterSuiteService.findMasterSuiteByForm(retrievedForm);
        DescendantsSuite retrievedDescendantsSuite = descendantsSuiteService.findDescendantsSuiteByForm(retrievedForm);
        GuestsSuite retrievedGuestsSuite = guestsSuiteService.findGuestsSuiteByForm(retrievedForm);
        HomeOfficeSuite retrievedHomeOfficeSuite = homeOfficeSuiteService.findHomeOfficeSuiteByForm(retrievedForm);
        GeneralInfo retrievedGeneralInfo = generalInfoService.findGeneralInfoByForm(retrievedForm);
        StyleAndMoods retrievedStyleAndMoods = styleAndMoodsService.findStyleAndMoodsByForm(retrievedForm);
        Context retrievedContext = contextService.findContextByForm(retrievedForm);

        retrievedDescription = descriptionService
                .setUpDescriptionForUpdate(retrievedDescription, formUpdateDTO.getDescription());
        retrievedExperience = experienceService
                .setUpExperienceForUpdate(retrievedExperience, formUpdateDTO.getExperience());
        retrievedBuilding = buildingService.setUpBuildingForUpdate(retrievedBuilding, formUpdateDTO.getBuilding());
        retrievedToilet = toiletService.setUpToiletForUpdate(retrievedToilet, formUpdateDTO.getToilet());
        retrievedEntranceHall = entranceHallService.setUpEntranceHallForUpdate(retrievedEntranceHall,
                formUpdateDTO.getEntranceHall());
        retrievedLivingRoom = livingRoomService
                .setUpLivingRoomForUpdate(retrievedLivingRoom, formUpdateDTO.getLivingRoom());
        retrievedDiningRoom = diningRoomService
                .setUpDiningRoomForUpdate(retrievedDiningRoom, formUpdateDTO.getDiningRoom());
        retrievedKitchen = kitchenService.setUpKitchenForUpdate(retrievedKitchen, formUpdateDTO.getKitchen());
        retrievedLaundry = laundryService.setUpLaundryForUpdate(retrievedLaundry, formUpdateDTO.getLaundry());
        retrievedBathroom = bathroomService.setUpBathroomForUpdate(retrievedBathroom, formUpdateDTO.getBathroom());
        retrievedMasterSuite = masterSuiteService
                .setUpMasterSuiteForUpdate(retrievedMasterSuite, formUpdateDTO.getMasterSuite());
        retrievedDescendantsSuite = descendantsSuiteService
                .setUpDescendantsSuiteForUpdate(retrievedDescendantsSuite, formUpdateDTO.getDescendantsSuite());
        retrievedGuestsSuite = guestsSuiteService
                .setUpGuestsSuiteForUpdate(retrievedGuestsSuite, formUpdateDTO.getGuestsSuite());
        retrievedHomeOfficeSuite = homeOfficeSuiteService
                .setUpHomeOfficeSuiteForUpdate(retrievedHomeOfficeSuite, formUpdateDTO.getHomeOfficeSuite());
        retrievedGeneralInfo = generalInfoService
                .setUpGeneralInfoForUpdate(retrievedGeneralInfo, formUpdateDTO.getGeneralInfo());
        retrievedStyleAndMoods = styleAndMoodsService
                .setUpStyleAndMoodsForUpdate(retrievedStyleAndMoods, formUpdateDTO.getStyleAndMoods());
        retrievedContext = contextService.setUpContextForUpdate(retrievedContext, formUpdateDTO.getContext());
        retrievedForm = modelMapperHelper.convertFormUpdateDTOToForm(retrievedForm, formUpdateDTO);

        save(retrievedForm);

        descriptionService.updateDescription(retrievedDescription, retrievedForm);
        experienceService.updateExperience(retrievedExperience, retrievedForm);
        buildingService.updateBuilding(retrievedBuilding, retrievedForm);
        toiletService.updateToilet(retrievedToilet, retrievedForm);
        entranceHallService.updateEntranceHall(retrievedEntranceHall, retrievedForm);
        livingRoomService.updateLivingRoom(retrievedLivingRoom, retrievedForm);
        diningRoomService.updateDiningRoom(retrievedDiningRoom, retrievedForm);
        Kitchen savedKitchen = kitchenService.updateKitchen(retrievedKitchen, retrievedForm);
        Laundry savedLaundry = laundryService.updateLaundry(retrievedLaundry, retrievedForm);
        bathroomService.updateBathroom(retrievedBathroom, retrievedForm);
        masterSuiteService.updateMasterSuite(retrievedMasterSuite, retrievedForm);
        descendantsSuiteService.updateDescendantsSuite(retrievedDescendantsSuite, retrievedForm);
        guestsSuiteService.updateGuestsSuite(retrievedGuestsSuite, retrievedForm);
        homeOfficeSuiteService.updateHomeOfficeSuite(retrievedHomeOfficeSuite, retrievedForm);
        generalInfoService.updateGeneralInfo(retrievedGeneralInfo, retrievedForm);
        styleAndMoodsService.updateStyleAndMoods(retrievedStyleAndMoods, retrievedForm);
        contextService.updateContext(retrievedContext, retrievedForm);

        KitchenUpdateDTO kitchenForUpdate = formUpdateDTO.getKitchen();
        LaundryUpdateDTO laundryForUpdate = formUpdateDTO.getLaundry();

        newAppliancesInKitchenService.updateNewAppliances(savedKitchen, kitchenForUpdate.getAppliances());
        reuseAppliancesInKitchenService.updateReuseAppliances(savedKitchen, kitchenForUpdate.getAppliances());
        necessaryAppliancesInKitchenService.updateNecessaryAppliances(savedKitchen, kitchenForUpdate.getAppliances());
        necessaryAppliancesInLaundryService.updateNecessaryAppliances(savedLaundry,
                laundryForUpdate.getNecessaryAppliancesOnLaundryList());
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

    public List<Form> findFormsByFilter(FormFilterDTO formFilterDTO) {
        Client retrivedClient = clientService.findClientByName(formFilterDTO.getClientName());

        return repository.findByClientName(retrivedClient.getName());
    }
}
