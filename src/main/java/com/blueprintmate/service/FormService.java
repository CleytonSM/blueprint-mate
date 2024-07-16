package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.*;
import com.blueprintmate.model.entity.*;
import com.blueprintmate.repository.FormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

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
    private NewAppliancesService newAppliancesService;
    @Autowired
    private ReuseAppliancesService reuseAppliancesService;
    @Autowired
    private NecessaryAppliancesService necessaryAppliancesService;
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
        DescendantsSuite newDescendantsSuite = descendantsSuiteService.setUpDescendantsSuite(formCreateDTO.getDescendantsSuite());
        GuestsSuite newGuestsSuite = guestsSuiteService.setUpGuestsSuite(formCreateDTO.getGuestsSuite());
        HomeOfficeSuite newHomeOfficeSuite = homeOfficeSuiteService.setUpHomeOfficeSuite(formCreateDTO.getHomeOfficeSuite());

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
        newAppliancesService.createNewAppliancesOnKitchen(
                formCreateDTO.getKitchen().getNewAppliancesOnKitchenList(),
                newKitchen,
                formCreateDTO.getKitchen().getAppliancesConfig());
        reuseAppliancesService.createReuseAppliancesOnKitchen(
                formCreateDTO.getKitchen().getReuseAppliancesOnKitchenList(),
                newKitchen,
                formCreateDTO.getKitchen().getAppliancesConfig());
        necessaryAppliancesService.createNecessaryAppliancesOnKitchen(
                formCreateDTO.getKitchen().getNecessaryAppliancesOnKitchenList(),
                newKitchen,
                formCreateDTO.getKitchen().getAppliancesConfig());
        laundryService.createLaundry(newLaundry, newForm);
        necessaryAppliancesService.createNecessaryAppliancesOnLaundry(
                formCreateDTO.getLaundry().getNecessaryAppliancesOnLaundryList(),
                newLaundry);
        bathroomService.createBathroom(newBathroom, newForm);
        masterSuiteService.createMasterSuite(newMasterSuite, newForm);
        descendantsSuiteService.createDescendantsSuite(newDescendantsSuite, newForm);
        guestsSuiteService.createGuestsSuite(newGuestsSuite, newForm);
        homeOfficeSuiteService.createHomeOfficeSuite(newHomeOfficeSuite, newForm);
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

}
