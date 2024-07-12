package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.ExperienceCreateDTO;
import com.blueprintmate.model.entity.Experience;
import com.blueprintmate.repository.ExperienceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public Experience setUpExperience(ExperienceCreateDTO experience) {
        return modelMapperHelper.convertExperienceCreateDTOToExperience(experience);
    }

    public void createExperience(Experience newExperience) {
        save(newExperience);
    }

    @Transactional
    private Experience save(Experience experience) {
        return repository.save(experience);
    }
}
