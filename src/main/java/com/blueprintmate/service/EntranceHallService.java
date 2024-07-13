package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.EntranceHallCreateDTO;
import com.blueprintmate.model.entity.EntranceHall;
import com.blueprintmate.repository.EntranceHallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntranceHallService {

    @Autowired
    private EntranceHallRepository repository;

    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public EntranceHall setUpEntranceHall(EntranceHallCreateDTO entranceHall) {
        return modelMapperHelper.convertEntranceHallCreateDTOToEntranceHall(entranceHall);
    }

    public void createEntranceHall(EntranceHall newEntranceHall) {
        save(newEntranceHall);
    }

    private EntranceHall save(EntranceHall newEntranceHall) {
        return repository.save(newEntranceHall);
    }
}
