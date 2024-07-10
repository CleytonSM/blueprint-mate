package com.blueprintmate.controller;

import com.blueprintmate.model.dto.LoginDTO;
import com.blueprintmate.model.dto.LoginResponseDTO;
import com.blueprintmate.model.dto.RegisterDTO;
import com.blueprintmate.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterDTO registerDTO) {
        service.registerUser(registerDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginDTO loginDTO) {
        return new ResponseEntity<>(service.loginUser(loginDTO), HttpStatus.OK);
    }
}
