package com.blueprintmate.controller;

import com.blueprintmate.model.dto.ClientCreateDTO;
import com.blueprintmate.model.dto.ClientResponseDTO;
import com.blueprintmate.model.dto.PageFilterDTO;
import com.blueprintmate.model.dto.PageResponseDTO;
import com.blueprintmate.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/find")
    public ResponseEntity<ClientResponseDTO> findByName(@RequestParam String name) {
        return new ResponseEntity<>(service.getClientByName(name), HttpStatus.OK);
    }

    @PostMapping("/find/all")
    public ResponseEntity<PageResponseDTO<ClientResponseDTO>> findAllByPagination(@RequestBody PageFilterDTO pageFilterDTO) {
        return new ResponseEntity<>(service.findAllByPagination(pageFilterDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        service.deleteById(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
