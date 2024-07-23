package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.AppliancesInKitchenCreateDTO;
import com.blueprintmate.model.dto.AppliancesInKitchenUpdateDTO;
import com.blueprintmate.model.dto.NewAppliancesInKitchenUpdateDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.NewAppliancesInKitchen;
import com.blueprintmate.repository.NewAppliancesInKitchenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class NewAppliancesInKitchenService {
    @Autowired
    private NewAppliancesInKitchenRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public void createNewAppliancesInKitchen(AppliancesInKitchenCreateDTO appliances, Kitchen kitchen) {
        appliances.getNewAppliancesListInKitchenList().forEach(newAppliancesCreateOnKitchenDTO ->
                save(new NewAppliancesInKitchen(
                        kitchen,
                        newAppliancesCreateOnKitchenDTO.getLink(),
                        Timestamp.valueOf(LocalDateTime.now()),
                        Timestamp.valueOf(LocalDateTime.now()))));
    }

    public void updateNewAppliances(Kitchen kitchen, AppliancesInKitchenUpdateDTO appliances) {
       List<NewAppliancesInKitchen> newAppliancesInKitchenList = repository.findAllByKitchenId(kitchen.getId());
       List<NewAppliancesInKitchenUpdateDTO> newAppliancesInKitchenUpdateDTOList =
               appliances.getNewAppliancesListInKitchenList();

       newAppliancesInKitchenList.forEach(newAppliancesInKitchen -> {
           newAppliancesInKitchenUpdateDTOList.forEach(newAppliancesInKitchenUpdateDTO -> {
               newAppliancesInKitchen.setKitchen(kitchen);
               newAppliancesInKitchen.setLink(newAppliancesInKitchenUpdateDTO.getLink());
               newAppliancesInKitchen.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

               save(newAppliancesInKitchen);
           });
       });
    }

    @Transactional
    private NewAppliancesInKitchen save(NewAppliancesInKitchen newAppliancesInKitchen) {
        return repository.save(newAppliancesInKitchen);
    }
}
