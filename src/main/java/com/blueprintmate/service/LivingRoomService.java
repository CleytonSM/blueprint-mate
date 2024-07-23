package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.LivingRoomCreateDTO;
import com.blueprintmate.model.dto.LivingRoomUpdateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.LivingRoom;
import com.blueprintmate.repository.LivingRoomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

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

    public void updateLivingRoom(LivingRoom retrievedLivingRoom, Form form) {
        retrievedLivingRoom.setForm(form);

        save(retrievedLivingRoom);
    }

    @Transactional
    private LivingRoom save(LivingRoom newLivingRoom) {
        return repository.save(newLivingRoom);
    }

    public LivingRoom findLivingRoomByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }

    public LivingRoom setUpLivingRoomForUpdate(LivingRoom retrievedLivingRoom, LivingRoomUpdateDTO livingRoomUpdateDTO) {
        return modelMapperHelper.convertLivingRoomUpdateDTOToLivingRoom(retrievedLivingRoom, livingRoomUpdateDTO);
    }

}
