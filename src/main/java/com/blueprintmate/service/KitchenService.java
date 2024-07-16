package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.KitchenCreateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.Kitchen;
import com.blueprintmate.repository.KitchenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KitchenService {
    @Autowired
    private KitchenRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public Kitchen setUpKitchen(KitchenCreateDTO kitchenCreateDTO) {
        return modelMapperHelper.convertKitchenCreateDTOToKitchen(kitchenCreateDTO);
    }

    public void createKitchen(Kitchen newKitchen, Form form) {
        newKitchen.setForm(form);

        save(newKitchen);
    }

    @Transactional
    private Kitchen save(Kitchen newKitchen) {
        return repository.save(newKitchen);
    }
}
