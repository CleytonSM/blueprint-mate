package com.blueprintmate.service;

import com.blueprintmate.model.dto.AppliancesConfigCreateDTO;
import com.blueprintmate.model.dto.NecessaryAppliancesCreateDTO;
import com.blueprintmate.model.entity.Kitchen;
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

    public void createNecessaryAppliancesOnKitchen(List<NecessaryAppliancesCreateDTO> newNecessaryAppliancesList, Kitchen kitchen, AppliancesConfigCreateDTO appliancesConfig) {
        newNecessaryAppliancesList.forEach(necessaryAppliancesCreateDTO ->
                save(new NecessaryAppliances(
                        kitchen,
                        null,
                        appliancesConfig.getHasStoreSmallVisible(),
                        appliancesConfig.getHasStoreSmallHidden(),
                        necessaryAppliancesCreateDTO.getName(),
                        necessaryAppliancesCreateDTO.getHasUsedDaily(),
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    @Transactional
    private NecessaryAppliances save(NecessaryAppliances necessaryAppliances) {
        return repository.save(necessaryAppliances);
    }
}
