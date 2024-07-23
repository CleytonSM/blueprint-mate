package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.NecessaryAppliancesCreateOnLaundryDTO;
import com.blueprintmate.model.entity.Laundry;
import com.blueprintmate.model.entity.NecessaryAppliancesInLaundry;
import com.blueprintmate.repository.NecessaryAppliancesInLaundryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class NecessaryAppliancesInLaundryService {
    @Autowired
    private NecessaryAppliancesInLaundryRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public void createNecessaryAppliances(
            List<NecessaryAppliancesCreateOnLaundryDTO> necessaryAppliancesOnLaundryList, Laundry laundry) {
        necessaryAppliancesOnLaundryList.forEach(necessaryAppliancesCreateOnLaundryDTO ->
                save(new NecessaryAppliancesInLaundry(
                        laundry,
                        necessaryAppliancesCreateOnLaundryDTO.getName(),
                        Timestamp.valueOf(LocalDateTime.now()),
                        Timestamp.valueOf(LocalDateTime.now())
                )));
    }

    @Transactional
    private NecessaryAppliancesInLaundry save(NecessaryAppliancesInLaundry necessaryAppliancesInLaundry) {
        return repository.save(necessaryAppliancesInLaundry);
    }
}
