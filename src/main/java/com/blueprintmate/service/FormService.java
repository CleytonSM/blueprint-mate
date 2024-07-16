package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.*;
import com.blueprintmate.model.entity.*;
import com.blueprintmate.repository.FormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void createForm(FormCreateDTO formCreateDTO) {
        User authenticatedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client retrievedClient = clientService.findClientByUserId(authenticatedUser.getId());

        Description description = descriptionService.setUpDescription(formCreateDTO.getDescription());
        Experience experience = experienceService.setUpExperience(formCreateDTO.getExperience());
        Building building = buildingService.setUpBuilding(formCreateDTO.getBuilding());
        Toilet toilet = toiletService.setUpToilet(formCreateDTO.getToilet());
        EntranceHall entranceHall = entranceHallService.setUpEntranceHall(formCreateDTO.getEntranceHall());
        LivingRoom livingRoom = livingRoomService.setUpLivingRoom(formCreateDTO.getLivingRoom());
        DiningRoom diningRoom = diningRoomService.setUpDiningRoom(formCreateDTO.getDiningRoom());
        Kitchen kitchen = kitchenService.setUpKitchen(formCreateDTO.getKitchen());
        List<NewAppliancesCreateDTO> newAppliancesList = formCreateDTO.getKitchen().getNewAppliancesList();
        List<ReuseAppliancesCreateDTO> reuseAppliancesList = formCreateDTO.getKitchen().getReuseAppliancesList();
        List<NecessaryAppliancesCreateDTO> necessaryAppliancesList = formCreateDTO.getKitchen()
                .getNecessaryAppliancesList();

        Form newForm = modelMapperHelper.convertFormCreateDTOToForm(formCreateDTO);
        newForm.setClient(retrievedClient);

        Map<String, Object> formData = new HashMap<>();
        formData.put("description", description);
        formData.put("experience", experience);
        formData.put("building", building);
        formData.put("toilet", toilet);
        formData.put("entranceHall", entranceHall);
        formData.put("livingRoom", livingRoom);
        formData.put("diningRoom", diningRoom);
        formData.put("kitchen", kitchen);
        formData.put("newAppliancesList", newAppliancesList);
        formData.put("reuseAppliancesList", reuseAppliancesList);
        formData.put("necessaryAppliancesList", necessaryAppliancesList);
        formData.put("appliancesConfig", formCreateDTO.getKitchen().getAppliancesConfig());
        formData.put("form", newForm);

        saveEntities(formData);
    }

    private void saveEntities(Map<String, Object> formData) {
        Form newForm = (Form) formData.get("form");
        save(newForm);

        Description newDescription = (Description) formData.get("description");
        Experience newExperience = (Experience) formData.get("experience");
        Building newBuilding = (Building) formData.get("building");
        Toilet newToilet = (Toilet) formData.get("toilet");
        EntranceHall newEntranceHall = (EntranceHall) formData.get("entranceHall");
        LivingRoom newLivingRoom = (LivingRoom) formData.get("livingRoom");
        DiningRoom newDiningRoom = (DiningRoom) formData.get("diningRoom");
        Kitchen newKitchen = (Kitchen) formData.get("kitchen");
        List<NewAppliancesCreateDTO> newNewAppliancesList = Collections
                .singletonList((NewAppliancesCreateDTO) formData.get("newAppliancesList"));
        List<ReuseAppliancesCreateDTO> newReuseAppliancesList = Collections
                .singletonList((ReuseAppliancesCreateDTO) formData.get("reuseAppliancesList"));
        List<NecessaryAppliancesCreateDTO> newNecessaryAppliancesList = Collections
                .singletonList((NecessaryAppliancesCreateDTO) formData.get("necessaryAppliancesList"));
        AppliancesConfigCreateDTO appliancesConfig = (AppliancesConfigCreateDTO) formData.get("appliancesConfig");

        descriptionService.createDescription(newDescription, newForm);
        experienceService.createExperience(newExperience, newForm);
        buildingService.createBuilding(newBuilding, newForm);
        toiletService.createToilet(newToilet, newForm);
        entranceHallService.createEntranceHall(newEntranceHall, newForm);
        livingRoomService.createLivingRoom(newLivingRoom, newForm);
        diningRoomService.createDiningRoom(newDiningRoom, newForm);
        kitchenService.createKitchen(newKitchen, newForm);
        newAppliancesService.createNewAppliancesOnKitchen(newNewAppliancesList, newKitchen, appliancesConfig);
        reuseAppliancesService.createReuseAppliancesOnKitchen(newReuseAppliancesList, newKitchen, appliancesConfig);
        necessaryAppliancesService.createNecessaryAppliancesOnKitchen(newNecessaryAppliancesList, newKitchen, appliancesConfig);
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

}
