package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesInKitchenCreateDTO;
import com.blueprintmate.model.dto.AppliancesInKitchenUpdateDTO;
import com.blueprintmate.model.dto.NecessaryAppliancesInKitchenUpdateDTO;
import com.blueprintmate.model.dto.ReuseAppliancesInKitchenUpdateDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.NecessaryAppliancesInKitchen;
import com.blueprintmate.model.entity.ReuseAppliancesInKitchen;
import com.blueprintmate.repository.NecessaryAppliancesInKitchenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

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
                        Timestamp.valueOf(LocalDateTime.now()),
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    public void updateNecessaryAppliances(Kitchen kitchen, AppliancesInKitchenUpdateDTO appliances) {
        List<NecessaryAppliancesInKitchen> necessaryAppliancesInKitchenList = repository.findAllByKitchenId(kitchen.getId());
        List<NecessaryAppliancesInKitchenUpdateDTO> necessaryAppliancesInKitchenUpdateDTOList =
                appliances.getNecessaryAppliancesInKitchenList();

        necessaryAppliancesInKitchenList.forEach(reuseAppliancesInKitchen -> {
            necessaryAppliancesInKitchenUpdateDTOList.forEach(reuseAppliancesInKitchenUpdateDTO -> {
                reuseAppliancesInKitchen.setKitchen(kitchen);
                reuseAppliancesInKitchen.setHasStoreSmallHidden(appliances.getHasStoreSmallHidden());
                reuseAppliancesInKitchen.setHasStoreSmallVisible(appliances.getHasStoreSmallVisible());
                reuseAppliancesInKitchen.setName(reuseAppliancesInKitchenUpdateDTO.getName());
                reuseAppliancesInKitchen.setHasUsedDaily(reuseAppliancesInKitchenUpdateDTO.getHasUsedDaily());
                reuseAppliancesInKitchen.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

                save(reuseAppliancesInKitchen);
            });
        });
    }

    @Transactional
    private NecessaryAppliancesInKitchen save(NecessaryAppliancesInKitchen necessaryAppliancesInKitchen) {
        return repository.save(necessaryAppliancesInKitchen);
    }
}
