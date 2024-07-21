package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.EntranceHallCreateDTO;
import com.blueprintmate.model.dto.EntranceHallUpdateDTO;
import com.blueprintmate.model.entity.EntranceHall;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.EntranceHallRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class EntranceHallService {

    @Autowired
    private EntranceHallRepository repository;

    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public EntranceHall setUpEntranceHall(EntranceHallCreateDTO entranceHall) {
        return modelMapperHelper.convertEntranceHallCreateDTOToEntranceHall(entranceHall);
    }

    public void createEntranceHall(EntranceHall newEntranceHall, Form form) {
        newEntranceHall.setForm(form);

        save(newEntranceHall);
    }

    @Transactional
    private EntranceHall save(EntranceHall newEntranceHall) {
        return repository.save(newEntranceHall);
    }

    public EntranceHall findEntranceHallByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }
}
