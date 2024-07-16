package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesConfigCreateDTO;
import com.blueprintmate.model.dto.NewAppliancesCreateDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.NewAppliances;
import com.blueprintmate.repository.NewAppliancesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class NewAppliancesService {
    @Autowired
    private NewAppliancesRepository repository;

    public void createNewAppliancesOnKitchen(List<NewAppliancesCreateDTO> newNewAppliancesList, Kitchen kitchen,
                                             AppliancesConfigCreateDTO appliancesConfig) {
        newNewAppliancesList.forEach(newAppliancesCreateDTO ->
                save(new NewAppliances(
                        kitchen,
                        null,
                        appliancesConfig.getHasStoreSmallVisible(),
                        appliancesConfig.getHasStoreSmallHidden(),
                        newAppliancesCreateDTO.getLink(),
                        Timestamp.valueOf(LocalDateTime.now()))));
    }

    @Transactional
    private NewAppliances save(NewAppliances newAppliances) {
        return repository.save(newAppliances);
    }
}
