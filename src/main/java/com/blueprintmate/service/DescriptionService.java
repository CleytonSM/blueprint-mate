package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.DescriptionCreateDTO;
import com.blueprintmate.model.entity.Description;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.DescriptionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescriptionService {

    @Autowired
    private DescriptionRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;
    @Autowired
    private ClientService clientService;

    public Description setUpDescription(DescriptionCreateDTO descriptionCreateDTO) {
        return modelMapperHelper.convertDescriptionCreateDTOToDescription(descriptionCreateDTO);
    }

    public void createDescription(Description newDescription, Form form) {
        newDescription.setForm(form);

        save(newDescription);
    }

    @Transactional
    private Description save(Description description) {
        return repository.save(description);
    }

}
