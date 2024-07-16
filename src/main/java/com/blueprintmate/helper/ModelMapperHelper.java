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
        description.setWorkRoutine(descriptionCreateDTO.getWorkRoutine() == null
                ? null : descriptionCreateDTO.getWorkRoutine());
        description.setHasWorkAtHome(descriptionCreateDTO.getHasWorkAtHome());
        description.setDaysWorkingAtHome(descriptionCreateDTO.getDaysWorkingAtHome());
        description.setHasTravelForWork(descriptionCreateDTO.getHasTravelForWork());
        description.setTravelsForWork(descriptionCreateDTO.getTravelsForWork() == null
                ? null : descriptionCreateDTO.getTravelsForWork());
        description.setHasPracticeSports(descriptionCreateDTO.getHasPracticeSports());
        description.setPracticeSports(descriptionCreateDTO.getPracticeSports());
        description.setHasTravel(descriptionCreateDTO.getHasTravel());
        description.setTravel(descriptionCreateDTO.getTravel() == null
                ? null : descriptionCreateDTO.getTravel());
        description.setHasWatchTv(descriptionCreateDTO.getHasWatchTv());
        description.setWatchTv(descriptionCreateDTO.getWatchTv());
        description.setHasRead(descriptionCreateDTO.getHasRead() == null
                ? null : descriptionCreateDTO.getHasRead());
        description.setHasBookRead(descriptionCreateDTO.getHasBookRead() == null
                ? null : descriptionCreateDTO.getHasBookRead());
        description.setHasTabletRead(descriptionCreateDTO.getHasTabletRead() == null
                ? null : descriptionCreateDTO.getHasTabletRead());
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

        building.setNeighborhoodRelationship(buildingCreateDTO.getNeighborhoodRelationship() == null
                ? null : buildingCreateDTO.getNeighborhoodRelationship());
        building.setDeterminingFactor(buildingCreateDTO.getDeterminingFactor());
        building.setArchitecturalLanguage(buildingCreateDTO.getArchitecturalLanguage());
        building.setBalconyIntegration(buildingCreateDTO.getBalconyIntegration());
        building.setBuildingManagerContact(buildingCreateDTO.getBuildingManagerContact() == null
                ? null : buildingCreateDTO.getBuildingManagerContact());
        building.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return building;
    }

    public Form convertFormCreateDTOToForm(FormCreateDTO formCreateDTO) {
        Form form = new Form();

        form.setTitle(formCreateDTO.getTitle());
        form.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return form;
    }

    public Toilet convertToiletCreateDTOToToilet(ToiletCreateDTO toiletCreateDTO) {
        Toilet toilet = new Toilet();

        toilet.setApartmentPattern(toiletCreateDTO.getApartmentPattern());
        toilet.setDesignToilet(toiletCreateDTO.getDesignToilet());
        toilet.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return toilet;
    }

    public EntranceHall convertEntranceHallCreateDTOToEntranceHall(EntranceHallCreateDTO entranceHallCreateDTO) {
        EntranceHall entranceHall = new EntranceHall();

        entranceHall.setHasShoesHouseWalking(entranceHallCreateDTO.getHasShoesHouseWalking() == null
                ? null : entranceHall.getHasShoesHouseWalking());
        entranceHall.setHasEntranceConsoleTable((entranceHallCreateDTO.getHasEntranceConsoleTable()));
        entranceHall.setHasWantEntranceConsoleTable((entranceHallCreateDTO.getHasWantEntranceConsoleTable()));
        entranceHall.setHasFullLengthMirror((entranceHallCreateDTO.getHasFullLengthMirror()));
        entranceHall.setHasFamiliarWithElectronicLocks((entranceHallCreateDTO.getHasFamiliarWithElectronicLocks()));

        return entranceHall;
    }

    public LivingRoom convertLivingRoomCreateDTOToLivingRoom(LivingRoomCreateDTO livingRoomCreateDTO) {
        LivingRoom livingRoom = new LivingRoom();

        livingRoom.setPeople(livingRoomCreateDTO.getPeople());
        livingRoom.setHasPeople(livingRoomCreateDTO.getHasPeople());
        livingRoom.setTvInch(livingRoomCreateDTO.getTvInch());
        livingRoom.setEquipmentLiving(livingRoomCreateDTO.getEquipmentLiving());
        livingRoom.setHasSofaWithChaise(livingRoomCreateDTO.getHasSofaWithChaise());
        livingRoom.setHasSofaWithRetractableChaise(livingRoomCreateDTO.getHasSofaWithRetractableChaise());
        livingRoom.setHasBooksOrCollection(livingRoomCreateDTO.getHasBooksOrCollection());
        livingRoom.setHasUsedDaily(livingRoomCreateDTO.getHasUsedDaily());
        livingRoom.setReceivesManyPeople(livingRoomCreateDTO.getReceivesManyPeople());
        livingRoom.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return livingRoom;
    }

    public DiningRoom convertDiningRoomCreateDTOToDiningRoom(DiningRoomCreateDTO diningRoomCreateDTO) {
        DiningRoom diningRoom = new DiningRoom();

        diningRoom.setDiningTableCapacity(diningRoomCreateDTO.getDiningTableCapacity());
        diningRoom.setDailyMealsLocation(diningRoomCreateDTO.getDailyMealsLocation());
        diningRoom.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return diningRoom;
    }

    public Kitchen convertKitchenCreateDTOToKitchen(KitchenCreateDTO kitchenCreateDTO) {
        Kitchen kitchen = new Kitchen();

        kitchen.setColorType(kitchenCreateDTO.getColorType().toString());
        kitchen.setShapeType(kitchenCreateDTO.getShapeType().toString());
        kitchen.setCounterTopMaterial(kitchenCreateDTO.getCounterTopMaterial());
        kitchen.setMaterialPreference(kitchenCreateDTO.getMaterialPreference().toString());
        kitchen.setHasWetGutterOrBuiltInTrashCan(kitchenCreateDTO.getHasWetGutterOrBuiltInTrashCan());
        kitchen.setHasStove(kitchenCreateDTO.getHasStove());
        kitchen.setHasCooktop(kitchenCreateDTO.getHasCooktop());
        kitchen.setHasInduction(kitchenCreateDTO.getHasInduction());
        kitchen.setHasBurners(kitchenCreateDTO.getHasBurners());
        kitchen.setHasStoveOnCounterTop(kitchenCreateDTO.getHasStoveOnCounterTop());
        kitchen.setHasStoveOnTower(kitchenCreateDTO.getHasStoveOnTower());
        kitchen.setFridgeType(kitchenCreateDTO.getFridgeType() == null
                ? null : kitchenCreateDTO.getFridgeType());
        kitchen.setHasSeparateFreezer(kitchenCreateDTO.getHasSeparateFreezer() == null
                ? null : kitchenCreateDTO.getHasSeparateFreezer());
        kitchen.setFridgeCapacityLiters(kitchenCreateDTO.getFridgeCapacityLiters() == null
                ? null : kitchenCreateDTO.getFridgeCapacityLiters());
        kitchen.setCurrentStorageSatisfaction(kitchenCreateDTO.getCurrentStorageSatisfaction());
        kitchen.setDinnerCapacity(kitchenCreateDTO.getDinnerCapacity());
        kitchen.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return kitchen;
    }
}
