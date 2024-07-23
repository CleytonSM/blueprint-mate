package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesInKitchenCreateDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.ReuseAppliancesInKitchen;
import com.blueprintmate.repository.ReuseAppliancesInKitchenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class ReuseAppliancesInKitchenService {
    @Autowired
    private ReuseAppliancesInKitchenRepository repository;

    public void createReuseAppliances(AppliancesInKitchenCreateDTO appliances, Kitchen kitchen) {
        appliances.getReuseAppliancesListInKitchenList().forEach(reuseAppliancesCreateOnKitchenDTO ->
                save(new ReuseAppliancesInKitchen(
                        kitchen,
                        appliances.getHasStoreSmallVisible(),
                        appliances.getHasStoreSmallHidden(),
                        reuseAppliancesCreateOnKitchenDTO.getName(),
                        Timestamp.valueOf(LocalDateTime.now()),
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    @Transactional
    private ReuseAppliancesInKitchen save(ReuseAppliancesInKitchen reuseAppliancesInKitchen) {
        return repository.save(reuseAppliancesInKitchen);
    }
}
