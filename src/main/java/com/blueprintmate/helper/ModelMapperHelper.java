package com.blueprintmate.helper;

import com.blueprintmate.model.dto.*;
import com.blueprintmate.model.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

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
        client.setNickname(clientCreateDTO.getNickname()); //TODO ver o null disso
        client.setBirthday(clientCreateDTO.getBirthday()); //TODO ver o null disso
        client.setMaritalStatus(clientCreateDTO.getMaritalStatus());
        client.setReligion(clientCreateDTO.getReligion()); //TODO ver o null disso
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
        description.setWorkRoutine(descriptionCreateDTO.getWorkRoutine()); //TODO ver o null disso
        description.setHasWorkAtHome(descriptionCreateDTO.getHasWorkAtHome());
        description.setDaysWorkingAtHome(descriptionCreateDTO.getDaysWorkingAtHome());
        description.setHasTravelForWork(descriptionCreateDTO.getHasTravelForWork());
        description.setTravelsForWork(descriptionCreateDTO.getTravelsForWork()); //TODO ver o null disso
        description.setHasPracticeSports(descriptionCreateDTO.getHasPracticeSports());
        description.setPracticeSports(descriptionCreateDTO.getPracticeSports());
        description.setHasTravel(descriptionCreateDTO.getHasTravel());
        description.setTravel(descriptionCreateDTO.getTravel()); //TODO ver o null disso
        description.setHasWatchTv(descriptionCreateDTO.getHasWatchTv());
        description.setWatchTv(descriptionCreateDTO.getWatchTv());
        description.setHasRead(descriptionCreateDTO.getHasRead()); //TODO ver o default disso
        description.setHasBookRead(descriptionCreateDTO.getHasBookRead()); //TODO ver o default disso
        description.setHasTabletRead(descriptionCreateDTO.getHasTabletRead()); //TODO ver o default disso
        description.setHasPets(descriptionCreateDTO.getHasPets());
        description.setPets(descriptionCreateDTO.getPets());
        description.setHasCook(descriptionCreateDTO.getHasCook());
        description.setCook(descriptionCreateDTO.getCook());
        description.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return description;
    }

    public Experience convertExperienceCreateDTOToExperience(ExperienceCreateDTO experienceCreateDTO) {
        Experience experience = new Experience();

        experience.setNeutralColor(experienceCreateDTO.getNeutralColor().toString());
        experience.setLivelyColor(experienceCreateDTO.getLivelyColor().toString());
        experience.setLikeToFeel(experienceCreateDTO.getLikeToFeel());
        experience.setHouseMeaning(experienceCreateDTO.getHouseMeaning());
        experience.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return experience;
    }

    public Building convertBuildingCreateDTOToBuilding(BuildingCreateDTO buildingCreateDTO) {
        Building building = new Building();

        building.setNeighborhoodRelationship(buildingCreateDTO.getNeighborhoodRelationship()); //TODO ver o null disso
        building.setDeterminingFactor(buildingCreateDTO.getDeterminingFactor());
        building.setArchitecturalLanguage(buildingCreateDTO.getArchitecturalLanguage());
        building.setBalconyIntegration(buildingCreateDTO.getBalconyIntegration());
        building.setBuildingManagerContact(buildingCreateDTO.getBuildingManagerContact());//TODO ver o null disso
        building.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return building;
    }
}
