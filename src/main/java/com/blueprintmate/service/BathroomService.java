package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.BathroomCreateDTO;
import com.blueprintmate.model.entity.Bathroom;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.BathroomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BathroomService {
    @Autowired
    private BathroomRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public Bathroom setUpBathroom(BathroomCreateDTO bathroom) {
        return modelMapperHelper.convertBathroomCreateDTOToBathroom(bathroom);
    }

    public void createBathroom(Bathroom newBathroom, Form form) {
        newBathroom.setForm(form);

        save(newBathroom);
    }

    @Transactional
    private Bathroom save(Bathroom bathroom) {
        return repository.save(bathroom);
    }
}
