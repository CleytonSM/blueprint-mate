package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.DiningRoomCreateDTO;
import com.blueprintmate.model.dto.DiningRoomUpdateDTO;
import com.blueprintmate.model.entity.DiningRoom;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.DiningRoomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class DiningRoomService {

    @Autowired
    private DiningRoomRepository repository;

    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public DiningRoom setUpDiningRoom(DiningRoomCreateDTO diningRoom) {
        return modelMapperHelper.convertDiningRoomCreateDTOToDiningRoom(diningRoom);
    }

    public void createDiningRoom(DiningRoom newDiningRoom, Form form) {
        newDiningRoom.setForm(form);

        save(newDiningRoom);
    }

    @Transactional
    private DiningRoom save(DiningRoom newDiningRoom) {
        return repository.save(newDiningRoom);
    }

    public DiningRoom findDiningRoomByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }
}
