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

    public void createForm(FormCreateDTO formCreateDTO) {
        User authenticatedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client retrievedClient = clientService.findClientByUserId(authenticatedUser.getId());

        Description description = descriptionService.setUpDescription(formCreateDTO.getDescription());
        Experience experience = experienceService.setUpExperience(formCreateDTO.getExperience());
        Building building = buildingService.setUpBuilding(formCreateDTO.getBuilding());
        Toilet toilet = toiletService.setUpToilet(formCreateDTO.getToilet());
        EntranceHall entranceHall = entranceHallService.setUpEntranceHall(formCreateDTO.getEntranceHall());

        Form newForm = modelMapperHelper.convertFormCreateDTOToForm(formCreateDTO);
        newForm.setClient(retrievedClient);

        Map<String, Object> formData = new HashMap<>();
        formData.put("description", description);
        formData.put("experience", experience);
        formData.put("building", building);
        formData.put("toilet", toilet);
        formData.put("entranceHall", entranceHall);
        formData.put("form", newForm);

        saveEntities(formData);
    }

    private void saveEntities(Map<String, Object> formData) {
        save((Form) formData.get("form"));

        Description newDescription = (Description) formData.get("description");
        Experience newExperience = (Experience) formData.get("experience");
        Building newBuilding = (Building) formData.get("building");
        Toilet newToilet = (Toilet) formData.get("toilet");
        EntranceHall newEntranceHall = (EntranceHall) formData.get("entranceHall");

        descriptionService.createDescription(newDescription);
        experienceService.createExperience(newExperience);
        buildingService.createBuilding(newBuilding);
        toiletService.createToilet(newToilet);
        entranceHallService.createEntranceHall(newEntranceHall);
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

}
