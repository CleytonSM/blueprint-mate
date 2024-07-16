package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.FormCreateDTO;
import com.blueprintmate.model.dto.StyleAndMoodsCreateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.StyleAndMoods;
import com.blueprintmate.repository.StyleAndMoodsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StyleAndMoodsService {
    @Autowired
    private StyleAndMoodsRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public StyleAndMoods setUpStyleAndMoods(StyleAndMoodsCreateDTO styleAndMoods) {
        return modelMapperHelper.convertStyleAndMoodsCreateDTOToStyleAndMoods(styleAndMoods);
    }

    public void createStyleAndMoods(StyleAndMoods newStyleAndMoods, Form form) {
        newStyleAndMoods.setForm(form);

        save(newStyleAndMoods);
    }

    @Transactional
    private StyleAndMoods save(StyleAndMoods newStyleAndMoods) {
        return repository.save(newStyleAndMoods);
    }
}
