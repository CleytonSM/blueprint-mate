package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.DescriptionCreateDTO;
import com.blueprintmate.model.entity.Description;
import com.blueprintmate.model.entity.User;
import com.blueprintmate.repository.DescriptionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class DescriptionService {

    @Autowired
    private DescriptionRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;
    @Autowired
    private ClientService clientService;

    public void createDescription(DescriptionCreateDTO descriptionCreateDTO) {
        User authenticatedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        Description newDescription = modelMapperHelper.convertDescriptionCreateDTOToDescription(descriptionCreateDTO);
        newDescription.setClient(clientService.findClientByUserId(authenticatedUser.getId()));

        save(newDescription);
    }


    @Transactional
    private Description save(Description description) {
        return repository.save(description);
    }

}
