package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.HomeOfficeSuiteCreateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.HomeOfficeSuite;
import com.blueprintmate.repository.HomeOfficeSuiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    private HomeOfficeSuite save(HomeOfficeSuite homeOfficeSuite) {
        return repository.save(homeOfficeSuite);
    }
}
