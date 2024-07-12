package com.blueprintmate.controller;

import com.blueprintmate.model.dto.FormCreateDTO;
import com.blueprintmate.service.FormService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/form")
public class FormController {

    @Autowired
    private FormService service;

    @PostMapping("/create")
    public ResponseEntity<Void> createForm(@Valid FormCreateDTO formCreateDTO) {
        service.createForm(formCreateDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
