package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.DescendantsSuiteCreateDTO;
import com.blueprintmate.model.entity.DescendantsSuite;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.DescendantsSuiteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescendantsSuiteService {
    @Autowired
    private DescendantsSuiteRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public DescendantsSuite setUpDescendantsSuite(DescendantsSuiteCreateDTO descendantsSuite) {
        return modelMapperHelper.convertDescendantsSuiteCreateDTOToDescendantsSuite(descendantsSuite);
    }

    public void createDescendantsSuite(DescendantsSuite newDescendantsSuite, Form form) {
        newDescendantsSuite.setForm(form);

        save(newDescendantsSuite);
    }

    @Transactional
    private DescendantsSuite save(DescendantsSuite newDescendantsSuite) {
        return repository.save(newDescendantsSuite);
    }
}
