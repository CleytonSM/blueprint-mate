package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesConfigCreateDTO;
import com.blueprintmate.model.dto.NecessaryAppliancesCreateOnKitchenDTO;
import com.blueprintmate.model.dto.NecessaryAppliancesCreateOnLaundryDTO;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.model.entity.Laundry;
import com.blueprintmate.model.entity.NecessaryAppliances;
import com.blueprintmate.repository.NecessaryAppliancesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class NecessaryAppliancesService {
    @Autowired
    private NecessaryAppliancesRepository repository;

    public void createNecessaryAppliancesOnKitchen(
            List<NecessaryAppliancesCreateOnKitchenDTO> necessaryAppliancesOnKitchenList, Kitchen kitchen,
            AppliancesConfigCreateDTO appliancesConfig) {
        necessaryAppliancesOnKitchenList.forEach(necessaryAppliancesCreateOnKitchenDTO ->
                save(new NecessaryAppliances(
                        kitchen,
                        null,
                        appliancesConfig.getHasStoreSmallVisible(),
                        appliancesConfig.getHasStoreSmallHidden(),
                        necessaryAppliancesCreateOnKitchenDTO.getName(),
                        necessaryAppliancesCreateOnKitchenDTO.getHasUsedDaily(),
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    public void createNecessaryAppliancesOnLaundry(
            List<NecessaryAppliancesCreateOnLaundryDTO> necessaryAppliancesOnLaundryList, Laundry newLaundry) {
        necessaryAppliancesOnLaundryList.forEach(necessaryAppliancesCreateDTO ->
                save(new NecessaryAppliances(
                        null,
                        newLaundry,
                        null,
                        null,
                        necessaryAppliancesCreateDTO.getName(),
                        null,
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    @Transactional
    private NecessaryAppliances save(NecessaryAppliances necessaryAppliances) {
        return repository.save(necessaryAppliances);
    }

}
