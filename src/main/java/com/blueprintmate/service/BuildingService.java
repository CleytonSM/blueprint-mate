package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.BuildingCreateDTO;
import com.blueprintmate.model.dto.BuildingUpdateDTO;
import com.blueprintmate.model.entity.Building;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.BuildingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public Building setUpBuilding(BuildingCreateDTO building) {
        return modelMapperHelper.convertBuildingCreateDTOToBuilding(building);
    }

    public void createBuilding(Building newBuilding, Form form) {
        newBuilding.setForm(form);

        save(newBuilding);
    }

    @Transactional
    private Building save(Building newBuilding) {
        return repository.save(newBuilding);
    }

    public Building findBuildingByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }
}
