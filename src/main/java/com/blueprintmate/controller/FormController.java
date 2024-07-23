package com.blueprintmate.controller;

import com.blueprintmate.model.dto.FormCreateDTO;
import com.blueprintmate.model.dto.FormFilterDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.service.FormService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/form")
public class FormController {

    @Autowired
    private FormService service;

    @PostMapping("/create")
    public ResponseEntity<Void> createForm(@Valid @RequestBody FormCreateDTO formCreateDTO) {
        service.createForm(formCreateDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/filter")
    public ResponseEntity<List<Form>> findFormsByFilter(@RequestBody FormFilterDTO formFilterDTO) {
        return new ResponseEntity<>(service.findFormsByFilter(formFilterDTO), HttpStatus.OK);
    }
}
