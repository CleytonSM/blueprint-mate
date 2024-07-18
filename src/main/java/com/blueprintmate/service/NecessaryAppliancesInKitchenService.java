package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesInKitchenCreateDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.NecessaryAppliancesInKitchen;
import com.blueprintmate.repository.NecessaryAppliancesInKitchenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class NecessaryAppliancesInKitchenService {
    @Autowired
    private NecessaryAppliancesInKitchenRepository repository;

    public void createNecessaryAppliances(AppliancesInKitchenCreateDTO appliances, Kitchen kitchen) {
        appliances.getNecessaryAppliancesInKitchenList().forEach(necessaryAppliancesInKitchenCreateDTO ->
                save(new NecessaryAppliancesInKitchen(
                        kitchen,
                        appliances.getHasStoreSmallVisible(),
                        appliances.getHasStoreSmallHidden(),
                        necessaryAppliancesInKitchenCreateDTO.getName(),
                        necessaryAppliancesInKitchenCreateDTO.getHasUsedDaily(),
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    @Transactional
    private NecessaryAppliancesInKitchen save(NecessaryAppliancesInKitchen necessaryAppliancesInKitchen) {
        return repository.save(necessaryAppliancesInKitchen);
    }

}
