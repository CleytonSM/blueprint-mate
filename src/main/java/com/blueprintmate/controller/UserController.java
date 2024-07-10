package com.blueprintmate.controller;

import com.blueprintmate.model.dto.RegisterDTO;
import com.blueprintmate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    private ResponseEntity<Void> registerUser(@RequestBody RegisterDTO registerDTO) {
        service.registerUser(registerDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
