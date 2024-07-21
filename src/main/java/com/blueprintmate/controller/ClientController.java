package com.blueprintmate.controller;

import com.blueprintmate.model.dto.ClientCreateDTO;
import com.blueprintmate.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping("/create")
    public ResponseEntity<Void> createClient(@Valid @RequestBody ClientCreateDTO clientCreateDTO) {
        service.createClient(clientCreateDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
