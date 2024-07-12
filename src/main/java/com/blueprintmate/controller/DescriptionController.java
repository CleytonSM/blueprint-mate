package com.blueprintmate.controller;

import com.blueprintmate.model.dto.DescriptionCreateDTO;
import com.blueprintmate.service.DescriptionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/description")
public class DescriptionController {

    @Autowired
    private DescriptionService service;

    @PostMapping
    public ResponseEntity<Void> createDescription(@Valid @RequestBody DescriptionCreateDTO descriptionCreateDTO) {
        service.setUpDescription(descriptionCreateDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
