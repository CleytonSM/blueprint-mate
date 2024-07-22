package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.LaundryCreateDTO;
import com.blueprintmate.model.dto.LaundryUpdateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.Laundry;
import com.blueprintmate.repository.LaundryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

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

    public void updateLaundry(Laundry retrievedLaundry, Form form) {
        retrievedLaundry.setForm(form);

        save(retrievedLaundry);
    }

    @Transactional
    private Laundry save(Laundry newLaundry) {
        return repository.save(newLaundry);
    }

    public Laundry findLaundryByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }

    public Laundry setUpLaundryForUpdate(Laundry retrievedLaundry, LaundryUpdateDTO laundryUpdateDTO) {
        return modelMapperHelper.convertLaundryUpdateDTOToLaundry(retrievedLaundry, laundryUpdateDTO);
    }

}
