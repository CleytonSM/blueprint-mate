package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.LivingRoomCreateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.LivingRoom;
import com.blueprintmate.repository.LivingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivingRoomService {

    @Autowired
    private LivingRoomRepository repository;

    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public LivingRoom setUpLivingRoom(LivingRoomCreateDTO livingRoom) {
        return modelMapperHelper.convertLivingRoomCreateDTOToLivingRoom(livingRoom);
    }

    public void createLivingRoom(LivingRoom newLivingRoom, Form form) {
        newLivingRoom.setForm(form);

        save(newLivingRoom);
    }

    private LivingRoom save(LivingRoom newLivingRoom) {
        return repository.save(newLivingRoom);
    }
}
