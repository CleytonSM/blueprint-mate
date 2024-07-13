package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.FormCreateDTO;
import com.blueprintmate.model.entity.*;
import com.blueprintmate.repository.FormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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

        descriptionService.createDescription(newDescription, newForm);
        experienceService.createExperience(newExperience, newForm);
        buildingService.createBuilding(newBuilding, newForm);
        toiletService.createToilet(newToilet, newForm);
        entranceHallService.createEntranceHall(newEntranceHall, newForm);
        livingRoomService.createLivingRoom(newLivingRoom, newForm);
        diningRoomService.createDiningRoom(newDiningRoom, newForm);
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

}
