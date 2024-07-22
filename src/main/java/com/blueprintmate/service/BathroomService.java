package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.BathroomCreateDTO;
import com.blueprintmate.model.dto.BathroomUpdateDTO;
import com.blueprintmate.model.entity.Bathroom;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.Laundry;
import com.blueprintmate.repository.BathroomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

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

    public void updateBathroom(Bathroom retrievedBathroom, Form form) {
        retrievedBathroom.setForm(form);

        save(retrievedBathroom);
    }

    @Transactional
    private Bathroom save(Bathroom bathroom) {
        return repository.save(bathroom);
    }

    public Bathroom findBathroomByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }

    public Bathroom setUpBathroomForUpdate(Bathroom retrievedBathroom, BathroomUpdateDTO bathroomUpdateDTO) {
        return modelMapperHelper.convertBathroomUpdateDTOToBathroom(retrievedBathroom, bathroomUpdateDTO);
    }

}
