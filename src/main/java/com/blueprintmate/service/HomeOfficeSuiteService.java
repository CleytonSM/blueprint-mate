package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.HomeOfficeSuiteCreateDTO;
import com.blueprintmate.model.dto.HomeOfficeSuiteUpdateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.HomeOfficeSuite;
import com.blueprintmate.repository.HomeOfficeSuiteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class HomeOfficeSuiteService {
    @Autowired
    private HomeOfficeSuiteRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public HomeOfficeSuite setUpHomeOfficeSuite(HomeOfficeSuiteCreateDTO homeOfficeSuite) {
        return modelMapperHelper.convertHomeOfficeSuiteCreateDTOToHomeOfficeSuite(homeOfficeSuite);
    }

    public void createHomeOfficeSuite(HomeOfficeSuite newHomeOfficeSuite, Form form) {
        newHomeOfficeSuite.setForm(form);

        save(newHomeOfficeSuite);
    }

    public void updateHomeOfficeSuite(HomeOfficeSuite retrievedHomeOfficeSuite, Form form) {
        retrievedHomeOfficeSuite.setForm(form);

        save(retrievedHomeOfficeSuite);
    }

    @Transactional
    private HomeOfficeSuite save(HomeOfficeSuite homeOfficeSuite) {
        return repository.save(homeOfficeSuite);
    }

    public HomeOfficeSuite findHomeOfficeSuiteByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }

    public HomeOfficeSuite setUpHomeOfficeSuiteForUpdate(HomeOfficeSuite retrievedHomeOfficeSuite,
                                                         HomeOfficeSuiteUpdateDTO homeOfficeSuiteUpdateDTO) {
        return modelMapperHelper.convertHomeOfficeSuiteUpdateDTOToHomeOfficeSuite(retrievedHomeOfficeSuite,
                homeOfficeSuiteUpdateDTO);
    }
}
