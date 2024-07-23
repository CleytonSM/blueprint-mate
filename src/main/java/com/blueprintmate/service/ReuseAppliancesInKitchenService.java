package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesInKitchenCreateDTO;
import com.blueprintmate.model.dto.AppliancesInKitchenUpdateDTO;
import com.blueprintmate.model.dto.ReuseAppliancesInKitchenUpdateDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.ReuseAppliancesInKitchen;
import com.blueprintmate.repository.ReuseAppliancesInKitchenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReuseAppliancesInKitchenService {
    @Autowired
    private ReuseAppliancesInKitchenRepository repository;

    public void createReuseAppliances(AppliancesInKitchenCreateDTO appliances, Kitchen kitchen) {
        appliances.getReuseAppliancesListInKitchenList().forEach(reuseAppliancesCreateOnKitchenDTO ->
                save(new ReuseAppliancesInKitchen(
                        kitchen,
                        reuseAppliancesCreateOnKitchenDTO.getName(),
                        Timestamp.valueOf(LocalDateTime.now()),
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    public void updateReuseAppliances(Kitchen kitchen, AppliancesInKitchenUpdateDTO appliances) {
        List<ReuseAppliancesInKitchen> reuseAppliancesInKitchenList = repository.findAllByKitchenId(kitchen.getId());
        List<ReuseAppliancesInKitchenUpdateDTO> reuseAppliancesInKitchenUpdateDTOList =
                appliances.getReuseAppliancesListInKitchenList();

        reuseAppliancesInKitchenList.forEach(reuseAppliancesInKitchen -> {
            reuseAppliancesInKitchenUpdateDTOList.forEach(reuseAppliancesInKitchenUpdateDTO -> {
                reuseAppliancesInKitchen.setKitchen(kitchen);
                reuseAppliancesInKitchen.setName(reuseAppliancesInKitchenUpdateDTO.getName());
                reuseAppliancesInKitchen.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

                save(reuseAppliancesInKitchen);
            });
        });
    }

    @Transactional
    private ReuseAppliancesInKitchen save(ReuseAppliancesInKitchen reuseAppliancesInKitchen) {
        return repository.save(reuseAppliancesInKitchen);
    }
}
