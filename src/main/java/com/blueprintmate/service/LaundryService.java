package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.LaundryCreateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.Laundry;
import com.blueprintmate.repository.LaundryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaundryService {
    @Autowired
    private LaundryRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public Laundry setUpLaundry(LaundryCreateDTO laundry) {
        return modelMapperHelper.convertLaundryCreateDTOToLaundry(laundry);
    }

    public void createLaundry(Laundry newLaundry, Form form) {
        newLaundry.setForm(form);
        save(newLaundry);
    }

    @Transactional
    private Laundry save(Laundry newLaundry) {
        return repository.save(newLaundry);
    }
}
