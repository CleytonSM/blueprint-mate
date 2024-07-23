package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.StyleAndMoodsCreateDTO;
import com.blueprintmate.model.dto.StyleAndMoodsUpdateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.StyleAndMoods;
import com.blueprintmate.repository.StyleAndMoodsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

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

    public void updateStyleAndMoods(StyleAndMoods retrievedStyleAndMoods, Form form) {
        retrievedStyleAndMoods.setForm(form);

        save(retrievedStyleAndMoods);
    }

    @Transactional
    private StyleAndMoods save(StyleAndMoods newStyleAndMoods) {
        return repository.save(newStyleAndMoods);
    }

    public StyleAndMoods findStyleAndMoodsByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }

    public StyleAndMoods setUpStyleAndMoodsForUpdate(StyleAndMoods retrievedStyleAndMoods,
                                                     StyleAndMoodsUpdateDTO styleAndMoodsUpdateDTO) {
        return modelMapperHelper.convertStyleAndMoodsUpdateDTOToStyleAndMoods(retrievedStyleAndMoods,
                styleAndMoodsUpdateDTO);
    }
}
