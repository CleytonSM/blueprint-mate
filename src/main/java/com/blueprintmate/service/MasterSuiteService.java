package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.MasterSuiteCreateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.MasterSuite;
import com.blueprintmate.repository.MasterSuiteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterSuiteService {
    @Autowired
    private MasterSuiteRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public MasterSuite setUpMasterSuite(MasterSuiteCreateDTO masterSuite) {
        return modelMapperHelper.convertMasterSuiteCreateDTOToMasterSuite(masterSuite);
    }

    public void createMasterSuite(MasterSuite newMasterSuite, Form form) {
        newMasterSuite.setForm(form);

        save(newMasterSuite);
    }

    @Transactional
    private MasterSuite save(MasterSuite newMasterSuite) {
        return repository.save(newMasterSuite);
    }
}
