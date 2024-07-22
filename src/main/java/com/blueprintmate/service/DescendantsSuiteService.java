package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.DescendantsSuiteCreateDTO;
import com.blueprintmate.model.dto.DescendantsSuiteUpdateDTO;
import com.blueprintmate.model.entity.DescendantsSuite;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.DescendantsSuiteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

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

    public DescendantsSuite findDescendantsSuiteByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }

    public DescendantsSuite setUpDescendantsSuiteForUpdate(DescendantsSuite retrievedDescendantsSuite,
                                                           DescendantsSuiteUpdateDTO descendantsSuiteUpdateDTO) {
        return modelMapperHelper.convertDescendantsSuiteUpdateDTOToDescendantsSuite(retrievedDescendantsSuite,
                descendantsSuiteUpdateDTO);
    }
}
