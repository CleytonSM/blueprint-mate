package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.GuestsSuiteCreateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.GuestsSuite;
import com.blueprintmate.repository.GuestsSuiteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestsSuiteService {
    @Autowired
    private GuestsSuiteRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public GuestsSuite setUpGuestsSuite(GuestsSuiteCreateDTO guestsSuite) {
        return modelMapperHelper.convertGuestsSuiteCreateDTOToGuestsSuite(guestsSuite);
    }

    public void createGuestsSuite(GuestsSuite newGuestsSuite, Form form) {
        newGuestsSuite.setForm(form);

        save(newGuestsSuite);
    }

    @Transactional
    private GuestsSuite save(GuestsSuite guestsSuite) {
        return repository.save(guestsSuite);
    }
}
