package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesConfigCreateDTO;
import com.blueprintmate.model.dto.ReuseAppliancesCreateOnKitchenDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.ReuseAppliances;
import com.blueprintmate.repository.ReuseAppliancesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReuseAppliancesService {
    @Autowired
    private ReuseAppliancesRepository repository;

    public void createReuseAppliancesOnKitchen(List<ReuseAppliancesCreateOnKitchenDTO> newReuseAppliancesList, Kitchen kitchen, AppliancesConfigCreateDTO appliancesConfig) {
        newReuseAppliancesList.forEach(reuseAppliancesCreateOnKitchenDTO ->
                save(new ReuseAppliances(
                        kitchen,
                        null,
                        appliancesConfig.getHasStoreSmallVisible(),
                        appliancesConfig.getHasStoreSmallHidden(),
                        reuseAppliancesCreateOnKitchenDTO.getName(),
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    @Transactional
    private ReuseAppliances save(ReuseAppliances reuseAppliances) {
        return repository.save(reuseAppliances);
    }
}
