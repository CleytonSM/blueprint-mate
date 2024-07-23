package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.DescriptionCreateDTO;
import com.blueprintmate.model.dto.DescriptionUpdateDTO;
import com.blueprintmate.model.entity.Description;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.DescriptionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class DescriptionService {

    @Autowired
    private DescriptionRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public Description setUpDescription(DescriptionCreateDTO descriptionCreateDTO) {
        return modelMapperHelper.convertDescriptionCreateDTOToDescription(descriptionCreateDTO);
    }

    public void createDescription(Description newDescription, Form form) {
        newDescription.setForm(form);

        save(newDescription);
    }

    public void updateDescription(Description retrievedDescription, Form form) {
        retrievedDescription.setForm(form);

        save(retrievedDescription);
    }

    @Transactional
    private Description save(Description description) {
        return repository.save(description);
    }

    public Description findDescriptionByForm(Form retrievedForm) {
        return getOptionalEntity(repository.findByFormId(retrievedForm.getId()));
    }

    public Description setUpDescriptionForUpdate(Description retrievedDescription, DescriptionUpdateDTO descriptionUpdateDTO) {
        return modelMapperHelper.convertDescriptionUpdateDTOToDescription(retrievedDescription, descriptionUpdateDTO);
    }
}
