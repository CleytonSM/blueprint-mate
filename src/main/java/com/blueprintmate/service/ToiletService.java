package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.ToiletCreateDTO;
import com.blueprintmate.model.entity.Toilet;
import com.blueprintmate.repository.ToiletRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToiletService {

    @Autowired
    private ToiletRepository repository;

    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public Toilet setUpToilet(ToiletCreateDTO toilet) {
        return modelMapperHelper.convertToiletCreateDTOToToilet(toilet);
    }

    public void createToilet(Toilet newToilet) {
        save(newToilet);
    }

    @Transactional
    private Toilet save(Toilet newToilet) {
        return repository.save(newToilet);
    }
}
