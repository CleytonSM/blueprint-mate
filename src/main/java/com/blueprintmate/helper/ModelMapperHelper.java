package com.blueprintmate.helper;

import com.blueprintmate.model.dto.ClientCreateDTO;
import com.blueprintmate.model.dto.DescriptionCreateDTO;
import com.blueprintmate.model.dto.RegisterDTO;
import com.blueprintmate.model.entity.Authority;
import com.blueprintmate.model.entity.Client;
import com.blueprintmate.model.entity.Description;
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

    public Description convertDescriptionCreateDTOToDescription(DescriptionCreateDTO descriptionCreateDTO) {
        Description description = new Description();

        description.setBestPlace(descriptionCreateDTO.getBestPlace());
        description.setWeekendBestPlace(descriptionCreateDTO.getWeekendBestPlace());
        description.setMissActualHouse(descriptionCreateDTO.getMissActualHouse());
        description.setHasActualHouseSatisfaction(descriptionCreateDTO.getHasActualHouseSatisfaction());
        description.setActualHouseSatisfaction(descriptionCreateDTO.getActualHouseSatisfaction());
        description.setJob(descriptionCreateDTO.getJob());
        description.setWorkRoutine(descriptionCreateDTO.getWorkRoutine());
        description.setHasWorkAtHome(descriptionCreateDTO.getHasWorkAtHome());
        description.setDaysWorkingAtHome(descriptionCreateDTO.getDaysWorkingAtHome());
        description.setHasTravelForWork(descriptionCreateDTO.getHasTravelForWork());
        description.setTravelsForWork(descriptionCreateDTO.getTravelsForWork());
        description.setHasPracticeSports(descriptionCreateDTO.getHasPracticeSports());
        description.setPracticeSports(descriptionCreateDTO.getPracticeSports());
        description.setHasTravel(descriptionCreateDTO.getHasTravel());
        description.setTravel(descriptionCreateDTO.getTravel());
        description.setHasWatchTv(descriptionCreateDTO.getHasWatchTv());
        description.setWatchTv(descriptionCreateDTO.getWatchTv());
        description.setHasRead(descriptionCreateDTO.getHasRead());
        description.setHasBookRead(descriptionCreateDTO.getHasBookRead());
        description.setHasTabletRead(descriptionCreateDTO.getHasTabletRead());
        description.setHasPets(descriptionCreateDTO.getHasPets());
        description.setPets(descriptionCreateDTO.getPets());
        description.setHasCook(descriptionCreateDTO.getHasCook());
        description.setCook(descriptionCreateDTO.getCook());
        description.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return description;
    }
}
