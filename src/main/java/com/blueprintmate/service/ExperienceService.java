package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.ExperienceCreateDTO;
import com.blueprintmate.model.dto.ExperienceUpdateDTO;
import com.blueprintmate.model.entity.Experience;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.ExperienceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public Experience setUpExperience(ExperienceCreateDTO experience) {
        return modelMapperHelper.convertExperienceCreateDTOToExperience(experience);
    }

    public void createExperience(Experience newExperience, Form form) {
        newExperience.setForm(form);

        save(newExperience);
    }

    @Transactional
    private Experience save(Experience experience) {
        return repository.save(experience);
    }

    public Experience findExperienceByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }
}
