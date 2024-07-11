package com.blueprintmate.helper;

import com.blueprintmate.model.dto.ClientCreateDTO;
import com.blueprintmate.model.dto.RegisterDTO;
import com.blueprintmate.model.entity.Authority;
import com.blueprintmate.model.entity.Client;
import com.blueprintmate.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class ModelMapperHelper {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User convertRegisterDTOtoUser (RegisterDTO registerDTO) {
        User user = new User();

        user.setEmail(registerDTO.getEmail());
        user.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        user.setActive(true);
        user.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return user;
    }

    public Client convertClientCreateDTOToClient(ClientCreateDTO clientCreateDTO) {
        Client client = new Client();

        client.setName(clientCreateDTO.getName());
        client.setNickname(clientCreateDTO.getNickname());
        client.setBirthday(clientCreateDTO.getBirthday());
        client.setMaritalStatus(clientCreateDTO.getMaritalStatus());
        client.setReligion(clientCreateDTO.getReligion());
        client.setVeganOrVegetarian(clientCreateDTO.isVeganOrVegetarian());
        client.setIndividualNeeds(clientCreateDTO.getIndividualNeeds());
        client.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return client;
    }
}
