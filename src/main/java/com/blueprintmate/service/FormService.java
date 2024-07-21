package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.FormCreateDTO;
import com.blueprintmate.model.dto.FormFilterDTO;
import com.blueprintmate.model.dto.FormUpdateDTO;
import com.blueprintmate.model.entity.*;
import com.blueprintmate.repository.FormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
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
        Context newContext = contextService.setUpContext(formCreateDTO.getContextCreate());

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
        newAppliancesInKitchenService.createNewAppliancesOnKitchen(
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
        retrievedDescription = descriptionService.setUpDescriptionForUpdate(formUpdateDTO.getDescription());
        Experience retrievedExperience = experienceService.findExperienceByForm(retrievedForm);
        retrievedExperience = experienceService.setUpExperienceForUpdate(formUpdateDTO.getExperience());
        Building retrievedBuilding = buildingService.findBuildingByForm(retrievedForm);
        retrievedBuilding = buildingService.setUpBuildingForUpdate(formUpdateDTO.getBuilding());
        Toilet retrievedToilet = toiletService.findToiletByForm(retrievedForm);
        retrievedToilet = toiletService.setUpToiletForUpdate(formUpdateDTO.getToilet());
        EntranceHall retrievedEntranceHall = entranceHallService.findEntranceHallByForm(retrievedForm);
        retrievedEntranceHall = entranceHallService.setUpEntranceHallForUpdate(formUpdateDTO.getEntranceHall());
        LivingRoom retrievedLivingRoom = livingRoomService.findLivingRoomByForm(retrievedForm);
        retrievedLivingRoom = livingRoomService.setUpLivingRoomForUpdate(formUpdateDTO.getLivingRoom());
        DiningRoom retrievedDiningRoom = diningRoomService.findDiningRoomByForm(retrievedForm);
        retrievedDiningRoom = diningRoomService.setUpDiningRoomForUpdate(formUpdateDTO.getDiningRoom());
        Kitchen retrievedKitchen = kitchenService.findKitchenByForm(retrievedForm);
        retrievedKitchen = kitchenService.setUpKitchenForUpdate(formUpdateDTO.getKitchen());
        Laundry retrievedLaundry = laundryService.findLaundryByForm(retrievedForm);
        retrievedLaundry = laundryService.setUpLaundryForUpdate(formUpdateDTO.getLaundry());
        Bathroom retrievedBathroom = bathroomService.findBathroomByForm(retrievedForm);
        retrievedBathroom = bathroomService.setUpBathroomForUpdate(formUpdateDTO.getBathroom());
        MasterSuite retrievedMasterSuite = masterSuiteService.findMasterSuiteByForm(retrievedForm);
        retrievedMasterSuite = masterSuiteService.setUpMasterSuiteForUpdate(formUpdateDTO.getMasterSuite());
        DescendantsSuite retrievedDescendantsSuite = descendantsSuiteService.findDescendantsSuiteByForm(retrievedForm);
        retrievedDescendantsSuite = descendantsSuiteService.setUpDescendantsSuiteForUpdate(formUpdateDTO.getDescendantsSuite());
        GuestsSuite retrievedGuestsSuite = guestsSuiteService.findGuestsSuiteByForm(retrievedForm);
        retrievedGuestsSuite = guestsSuiteService.setUpGuestsSuiteForUpdate(formUpdateDTO.getGuestsSuite());
        HomeOfficeSuite retrievedHomeOfficeSuite = homeOfficeSuiteService.findHomeOfficeSuiteByForm(retrievedForm);
        retrievedHomeOfficeSuite = homeOfficeSuiteService.setUpHomeOfficeSuiteForUpdate(formUpdateDTO.getHomeOfficeSuite());
        GeneralInfo retrievedGeneralInfo = generalInfoService.findGeneralInfoByForm(retrievedForm);
        retrievedGeneralInfo = generalInfoService.setUpGeneralInfoForUpdate(formUpdateDTO.getGeneralInfo());
        StyleAndMoods retrievedStyleAndMoods = styleAndMoodsService.findStyleAndMoodsByForm(retrievedForm);
        retrievedStyleAndMoods = styleAndMoodsService.setUpStyleAndMoodsForUpdate(formUpdateDTO.getStyleAndMoods());
        Context retrievedContext = contextService.findContextByForm(retrievedForm);
        retrievedContext = contextService.setUpContextForUpdate(formUpdateDTO.getContext());

        retrievedForm = modelMapperHelper.convertFormUpdateDTOToForm(formUpdateDTO);
        retrievedForm.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));
        save(retrievedForm);

        descriptionService.updateDescription();
        experienceService.updateExperience();
        buildingService.updateBuilding();
        toiletService.updateToilet();
        entranceHallService.updateEntranceHall();
        livingRoomService.updateLivingRoom();
        diningRoomService.updateDiningRoom();
        kitchenService.updateKitchen();
        newAppliancesInKitchenService.updateNewAppliancesOnKitchen();
        reuseAppliancesInKitchenService.updateReuseAppliances();
        necessaryAppliancesInKitchenService.updateNecessaryAppliances();
        laundryService.updateLaundry();
        necessaryAppliancesInLaundryService.updateNecessaryAppliances();
        bathroomService.updateBathroom();
        masterSuiteService.updateMasterSuite();
        descendantsSuiteService.updateDescendantsSuite();
        guestsSuiteService.updateGuestsSuite();
        homeOfficeSuiteService.updateHomeOfficeSuite();
        generalInfoService.updateGeneralInfo();
        styleAndMoodsService.updateStyleAndMoods();
        contextService.updateContext();
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

    public List<Form> findFormsByFilter(FormFilterDTO formFilterDTO) {
        Client retrivedClient = clientService.findClientByName(formFilterDTO.getClientName());

        return repository.findByClientNameAndDate(retrivedClient.getName());
    }
}
