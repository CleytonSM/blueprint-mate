package com.blueprintmate.controller;

import com.blueprintmate.model.dto.FormCreateDTO;
import com.blueprintmate.model.dto.FormFilterDTO;
import com.blueprintmate.model.dto.FormUpdateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.service.FormService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateFormById(@PathVariable int id, @Valid @RequestBody FormUpdateDTO formUpdateDTO) {
        service.updateFormById(id, formUpdateDTO);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/all")
    public ResponseEntity<List<Form>> findFormsByClient() {
        return new ResponseEntity<>(service.findFormsByClient(), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteFormByFormId(@RequestParam int formId) {
        service.deleteFormByFormId(formId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/admin/delete")
    public ResponseEntity<Void> deleteFormByFormId(@RequestParam int clientId, @RequestParam int formId) {
        service.deleteFormByClientIdAndFormId(clientId, formId);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
