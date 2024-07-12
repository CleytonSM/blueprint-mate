package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.FormCreateDTO;
import com.blueprintmate.model.entity.*;
import com.blueprintmate.repository.FormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
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

    public void createForm(FormCreateDTO formCreateDTO) {
        User authenticatedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client retrievedClient = clientService.findClientByUserId(authenticatedUser.getId());

        Description description = descriptionService.setUpDescription(formCreateDTO.getDescription());
        Experience experience = experienceService.setUpExperience(formCreateDTO.getExperience());
        Building building = buildingService.setUpBuilding(formCreateDTO.getBuilding());


        Form newForm = modelMapperHelper.convertFormCreateDTOToForm(formCreateDTO);
        newForm.setClient(retrievedClient);

        Map<String, Object> formData = new HashMap<>();
        formData.put("description", description);
        formData.put("experience", experience);
        formData.put("building", building);
        formData.put("form", newForm);

        saveEntities(formData);
    }

    private void saveEntities(Map<String, Object> formData) {
        save((Form) formData.get("form"));

        Description newDescription = (Description) formData.get("description");
        Experience newExperience = (Experience) formData.get("experience");
        Building newBuilding = (Building) formData.get("building");

        descriptionService.createDescription(newDescription);
        experienceService.createExperience(newExperience);
        buildingService.createBuilding(newBuilding);
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

}
