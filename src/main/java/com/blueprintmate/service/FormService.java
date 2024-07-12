package com.blueprintmate.service;

import com.blueprintmate.model.dto.FormCreateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.FormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    @Autowired
    private FormRepository repository;

    public void createForm(FormCreateDTO formCreateDTO) {
    }

    @Transactional
    private Form save(Form form) {
        return repository.save(form);
    }

}
