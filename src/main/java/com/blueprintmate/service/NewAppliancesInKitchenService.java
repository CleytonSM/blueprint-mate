package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesInKitchenCreateDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.NewAppliancesInKitchen;
import com.blueprintmate.repository.NewAppliancesInKitchenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class NewAppliancesInKitchenService {
    @Autowired
    private NewAppliancesInKitchenRepository repository;

    public void createNewAppliancesOnKitchen(AppliancesInKitchenCreateDTO appliances, Kitchen kitchen) {
        appliances.getNewAppliancesListInKitchenList().forEach(newAppliancesCreateOnKitchenDTO ->
                save(new NewAppliancesInKitchen(
                        kitchen,
                        appliances.getHasStoreSmallVisible(),
                        appliances.getHasStoreSmallHidden(),
                        newAppliancesCreateOnKitchenDTO.getLink(),
                        Timestamp.valueOf(LocalDateTime.now()),
                        Timestamp.valueOf(LocalDateTime.now()))));
    }

    @Transactional
    private NewAppliancesInKitchen save(NewAppliancesInKitchen newAppliancesInKitchen) {
        return repository.save(newAppliancesInKitchen);
    }
}
