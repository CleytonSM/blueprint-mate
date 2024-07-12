package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.FormCreateDTO;
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

    public void createForm(FormCreateDTO formCreateDTO) {
        User authenticatedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client retrievedClient = clientService.findClientByUserId(authenticatedUser.getId());

        Description newDescription = descriptionService.setUpDescription(formCreateDTO.getDescription());
        Experience newExperience = experienceService.setUpExperience(formCreateDTO.getExperience());
        Building newBuilding = buildingService.setUpBuilding(formCreateDTO.getBuilding());
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

}
