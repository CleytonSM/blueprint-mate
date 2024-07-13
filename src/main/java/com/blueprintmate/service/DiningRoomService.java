package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.DiningRoomCreateDTO;
import com.blueprintmate.model.entity.DiningRoom;
import com.blueprintmate.repository.DiningRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiningRoomService {

    @Autowired
    private DiningRoomRepository repository;

    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public DiningRoom setUpDiningRoom(DiningRoomCreateDTO diningRoom) {
        return modelMapperHelper.convertDiningRoomCreateDTOToDiningRoom(diningRoom);
    }

    public void createDiningRoom(DiningRoom newDiningRoom) {
        save(newDiningRoom);
    }

    private DiningRoom save(DiningRoom newDiningRoom) {
        return repository.save(newDiningRoom);
    }
}
