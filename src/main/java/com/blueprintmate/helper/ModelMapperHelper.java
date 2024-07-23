package com.blueprintmate.helper;

import com.blueprintmate.model.dto.*;
import com.blueprintmate.model.entity.*;
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
        client.setNickname(clientCreateDTO.getNickname() == null ? null : clientCreateDTO.getNickname());
        client.setBirthday(clientCreateDTO.getBirthday() == null ? null : clientCreateDTO.getBirthday());
        client.setMaritalStatus(clientCreateDTO.getMaritalStatus());
        client.setReligion(clientCreateDTO.getReligion() == null ? null : clientCreateDTO.getReligion());
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
        description.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return description;
    }

    public Experience convertExperienceCreateDTOToExperience(ExperienceCreateDTO experienceCreateDTO) {
        Experience experience = new Experience();

        experience.setNeutralColor(experienceCreateDTO.getNeutralColor().toString());
        experience.setLivelyColor(experienceCreateDTO.getLivelyColor().toString());
        experience.setLikeToFeel(experienceCreateDTO.getLikeToFeel());
        experience.setHouseMeaning(experienceCreateDTO.getHouseMeaning());
        experience.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        experience.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

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
        building.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return building;
    }

    public Form convertFormCreateDTOToForm(FormCreateDTO formCreateDTO) {
        Form form = new Form();

        form.setTitle(formCreateDTO.getTitle());
        form.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        form.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return form;
    }

    public Toilet convertToiletCreateDTOToToilet(ToiletCreateDTO toiletCreateDTO) {
        Toilet toilet = new Toilet();

        toilet.setApartmentPattern(toiletCreateDTO.getApartmentPattern());
        toilet.setDesignToilet(toiletCreateDTO.getDesignToilet());
        toilet.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        toilet.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return toilet;
    }

    public EntranceHall convertEntranceHallCreateDTOToEntranceHall(EntranceHallCreateDTO entranceHallCreateDTO) {
        EntranceHall entranceHall = new EntranceHall();

        entranceHall.setHasShoesHouseWalking(entranceHallCreateDTO.getHasShoesHouseWalking() == null
                ? null : entranceHallCreateDTO.getHasShoesHouseWalking());
        entranceHall.setHasEntranceConsoleTable((entranceHallCreateDTO.getHasEntranceConsoleTable()));
        entranceHall.setHasWantEntranceConsoleTable((entranceHallCreateDTO.getHasWantEntranceConsoleTable()));
        entranceHall.setHasFullLengthMirror((entranceHallCreateDTO.getHasFullLengthMirror()));
        entranceHall.setHasFamiliarWithElectronicLocks((entranceHallCreateDTO.getHasFamiliarWithElectronicLocks()));
        entranceHall.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        entranceHall.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

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
        livingRoom.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return livingRoom;
    }

    public DiningRoom convertDiningRoomCreateDTOToDiningRoom(DiningRoomCreateDTO diningRoomCreateDTO) {
        DiningRoom diningRoom = new DiningRoom();

        diningRoom.setDiningTableCapacity(diningRoomCreateDTO.getDiningTableCapacity());
        diningRoom.setDailyMealsLocation(diningRoomCreateDTO.getDailyMealsLocation());
        diningRoom.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        diningRoom.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

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
        kitchen.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return kitchen;
    }

    public Laundry convertLaundryCreateDTOToLaundry(LaundryCreateDTO laundryCreateDTO) {
        Laundry laundry = new Laundry();

        laundry.setHasBuiltInSink(laundryCreateDTO.getHasBuiltInSink());
        laundry.setHasPorcelainSink(laundryCreateDTO.getHasPorcelainSink());
        laundry.setHasPetFoodAndBowlsStoredHere(laundryCreateDTO.getHasPetFoodAndBowlsStoredHere() == null
                ? null : laundryCreateDTO.getHasPetFoodAndBowlsStoredHere());
        laundry.setHasRecyclesTrash(laundryCreateDTO.getHasRecyclesTrash() == null
                ? null : laundryCreateDTO.getHasPetFoodAndBowlsStoredHere());//
        laundry.setCurrentDryingRackCount(laundryCreateDTO.getCurrentDryingRackCount());
        laundry.setDryingRackSizes(laundryCreateDTO.getDryingRackSizes());
        laundry.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        laundry.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return laundry;
    }

    public Bathroom convertBathroomCreateDTOToBathroom(BathroomCreateDTO bathroomCreateDTO) {
        Bathroom bathroom = new Bathroom();

        bathroom.setHasAllRenovated(bathroomCreateDTO.getHasBathtub());
        bathroom.setPreferredSinkShape(bathroomCreateDTO.getPreferredSinkShape().toString());
        bathroom.setPreferredFlushType(bathroomCreateDTO.getPreferredFlushType().toString());
        bathroom.setHasHygienicShower(bathroomCreateDTO.getHasHygienicShower());
        bathroom.setHasBidet(bathroomCreateDTO.getHasBidet());
        bathroom.setHasPrefersMixerTap(bathroomCreateDTO.getHasPrefersMixerTap());
        bathroom.setHasPrefersSingleHandle(bathroomCreateDTO.getHasPrefersSingleHandle());
        bathroom.setHasElectricTowelRack(bathroomCreateDTO.getHasElectricTowelRack());
        bathroom.setHasLaundryHamperInCabinet(bathroomCreateDTO.getHasLaundryHamperInCabinet());
        bathroom.setHasMakeupInBathroomMirror(bathroomCreateDTO.getHasMakeupInBathroomMirror());
        bathroom.setHasManyProductsOnCounter(bathroomCreateDTO.getHasManyProductsOnCounter());
        bathroom.setHasDailyUseOfHairdryer(bathroomCreateDTO.getHasDailyUseOfHairdryer());
        bathroom.setHasShowerNicheForProducts(bathroomCreateDTO.getHasShowerNicheForProducts());
        bathroom.setHasCurrentStorageMeetsNeeds(bathroomCreateDTO.getHasCurrentStorageMeetsNeeds());
        bathroom.setHasDesireMoreStorageSpace(bathroomCreateDTO.getHasDesireMoreStorageSpace());
        bathroom.setHasSaunaInShower(bathroomCreateDTO.getHasSaunaInShower());
        bathroom.setHasBathtub(bathroomCreateDTO.getHasBathtub());
        bathroom.setHasImmersion(bathroomCreateDTO.getHasImmersion());
        bathroom.setHasHydro(bathroomCreateDTO.getHasHydro());
        bathroom.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        bathroom.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return bathroom;
    }

    public MasterSuite convertMasterSuiteCreateDTOToMasterSuite(MasterSuiteCreateDTO masterSuiteCreateDTO) {
        MasterSuite masterSuite = new MasterSuite();

        masterSuite.setBedType(masterSuiteCreateDTO.getBedType().toString());
        masterSuite.setHasTv(masterSuiteCreateDTO.getHasTv());
        masterSuite.setHasArmchair(masterSuiteCreateDTO.getHasArmchair());
        masterSuite.setHasBench(masterSuiteCreateDTO.getHasBench());
        masterSuite.setReadsInBed(masterSuiteCreateDTO.getReadsInBed());
        masterSuite.setHasNightStandDrawer(masterSuiteCreateDTO.getHasNightStandDrawer());
        masterSuite.setHasWoodHeadboardPreference(masterSuiteCreateDTO.getHasWoodHeadboardPreference());
        masterSuite.setHasFabricHeadboardPreference(masterSuiteCreateDTO.getHasFabricHeadboardPreference());
        masterSuite.setHasFullLengthMirror(masterSuiteCreateDTO.getHasFullLengthMirror());
        masterSuite.setCurrentClosetLength(masterSuiteCreateDTO.getCurrentClosetLength());
        masterSuite.setCurrentClothesRailLength(masterSuiteCreateDTO.getCurrentClothesRailLength());
        masterSuite.setCurrentShoePairsCount(masterSuiteCreateDTO.getCurrentShoePairsCount());
        masterSuite.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        masterSuite.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return masterSuite;
    }

    public DescendantsSuite convertDescendantsSuiteCreateDTOToDescendantsSuite(
            DescendantsSuiteCreateDTO descendantsSuiteCreateDTO) {
        DescendantsSuite descendantsSuite = new DescendantsSuite();

        descendantsSuite.setBedType(descendantsSuiteCreateDTO.getBedType().toString());
        descendantsSuite.setHasTv(descendantsSuiteCreateDTO.getHasTv());
        descendantsSuite.setHasChildStudy(descendantsSuiteCreateDTO.getHasChildStudy());
        descendantsSuite.setHasChildReceivesFriendsToSleep(
                descendantsSuiteCreateDTO.getHasChildReceivesFriendsToSleep() == null
                        ? null : descendantsSuiteCreateDTO.getHasChildReceivesFriendsToSleep());
        descendantsSuite.setTheme(descendantsSuiteCreateDTO.getTheme());
        descendantsSuite.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        descendantsSuite.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return descendantsSuite;
    }

    public GuestsSuite convertGuestsSuiteCreateDTOToGuestsSuite(GuestsSuiteCreateDTO guestsSuiteCreateDTO) {
        GuestsSuite guestsSuite = new GuestsSuite();

        guestsSuite.setBedType(guestsSuiteCreateDTO.getBedType().toString());
        guestsSuite.setClosetUse(guestsSuiteCreateDTO.getClosetUse() == null
                ? null : guestsSuiteCreateDTO.getClosetUse());
        guestsSuite.setFrequencyOfGuests(guestsSuiteCreateDTO.getFrequencyOfGuests() == null
                ? null : guestsSuiteCreateDTO.getFrequencyOfGuests());
        guestsSuite.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        guestsSuite.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return guestsSuite;
    }

    public HomeOfficeSuite convertHomeOfficeSuiteCreateDTOToHomeOfficeSuite(HomeOfficeSuiteCreateDTO homeOfficeSuiteCreateDTO) {
        HomeOfficeSuite homeOfficeSuite = new HomeOfficeSuite();

        homeOfficeSuite.setBedType(homeOfficeSuiteCreateDTO.getBedType().toString());
        homeOfficeSuite.setNeedsPrivacy(homeOfficeSuiteCreateDTO.getNeedsPrivacy() == null
                ? null : homeOfficeSuiteCreateDTO.getNeedsPrivacy());
        homeOfficeSuite.setNeedsSpaceForBooksDocumentsOrPapers(
                homeOfficeSuiteCreateDTO.getNeedsSpaceForBooksDocumentsOrPapers() == null
                        ? null : homeOfficeSuiteCreateDTO.getNeedsSpaceForBooksDocumentsOrPapers());
        homeOfficeSuite.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        homeOfficeSuite.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return homeOfficeSuite;
    }

    public GeneralInfo convertGeneralInfoCreateDTOToGeneralInfo(GeneralInfoCreateDTO generalInfoCreateDTO) {
        GeneralInfo generalInfo = new GeneralInfo();

        generalInfo.setReuse(generalInfoCreateDTO.getReuse());
        generalInfo.setAdditional(generalInfoCreateDTO.getAdditional());
        generalInfo.setUnlistedFurnitureOrEquipment(generalInfoCreateDTO.getUnlistedFurnitureOrEquipment());
        generalInfo.setAvoidanceRequests(generalInfoCreateDTO.getAvoidanceRequests());
        generalInfo.setPlantRelationship(generalInfoCreateDTO.getPlantRelationship());
        generalInfo.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        generalInfo.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return generalInfo;
    }

    public StyleAndMoods convertStyleAndMoodsCreateDTOToStyleAndMoods(StyleAndMoodsCreateDTO styleAndMoodsCreateDTO) {
        StyleAndMoods styleAndMoods = new StyleAndMoods();

        styleAndMoods.setAmbientStyle(styleAndMoodsCreateDTO.getAmbientStyle().toString());
        styleAndMoods.setAmbientStyleDescription(styleAndMoodsCreateDTO.getAmbientStyleDescription());
        styleAndMoods.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        styleAndMoods.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return styleAndMoods;
    }

    public Context convertContextCreateDTOToContext(ContextCreateDTO contextCreateDTO) {
        Context context = new Context();

        context.setProjectLifeStageSignificance(contextCreateDTO.getProjectLifeStageSignificance());
        context.setInvestmentExpectation(contextCreateDTO.getInvestmentExpectation());
        context.setProjectDurationExpectation(contextCreateDTO.getProjectDurationExpectation());
        context.setLocationDuringRenovation(contextCreateDTO.getLocationDuringRenovation());
        context.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        context.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return context;
    }

    public Description convertDescriptionUpdateDTOToDescription(Description retrievedDescription, DescriptionUpdateDTO descriptionUpdateDTO) {
        retrievedDescription.setBestPlace(descriptionUpdateDTO.getBestPlace());
        retrievedDescription.setWeekendBestPlace(descriptionUpdateDTO.getWeekendBestPlace());
        retrievedDescription.setMissActualHouse(descriptionUpdateDTO.getMissActualHouse());
        retrievedDescription.setHasActualHouseSatisfaction(descriptionUpdateDTO.getHasActualHouseSatisfaction());
        retrievedDescription.setActualHouseSatisfaction(descriptionUpdateDTO.getActualHouseSatisfaction());
        retrievedDescription.setJob(descriptionUpdateDTO.getJob());
        retrievedDescription.setWorkRoutine(descriptionUpdateDTO.getWorkRoutine() == null
                ? null : descriptionUpdateDTO.getWorkRoutine());
        retrievedDescription.setHasWorkAtHome(descriptionUpdateDTO.getHasWorkAtHome());
        retrievedDescription.setDaysWorkingAtHome(descriptionUpdateDTO.getDaysWorkingAtHome());
        retrievedDescription.setHasTravelForWork(descriptionUpdateDTO.getHasTravelForWork());
        retrievedDescription.setTravelsForWork(descriptionUpdateDTO.getTravelsForWork() == null
                ? null : descriptionUpdateDTO.getTravelsForWork());
        retrievedDescription.setHasPracticeSports(descriptionUpdateDTO.getHasPracticeSports());
        retrievedDescription.setPracticeSports(descriptionUpdateDTO.getPracticeSports());
        retrievedDescription.setHasTravel(descriptionUpdateDTO.getHasTravel());
        retrievedDescription.setTravel(descriptionUpdateDTO.getTravel() == null
                ? null : descriptionUpdateDTO.getTravel());
        retrievedDescription.setHasWatchTv(descriptionUpdateDTO.getHasWatchTv());
        retrievedDescription.setWatchTv(descriptionUpdateDTO.getWatchTv());
        retrievedDescription.setHasRead(descriptionUpdateDTO.getHasRead() == null
                ? null : descriptionUpdateDTO.getHasRead());
        retrievedDescription.setHasBookRead(descriptionUpdateDTO.getHasBookRead() == null
                ? null : descriptionUpdateDTO.getHasBookRead());
        retrievedDescription.setHasTabletRead(descriptionUpdateDTO.getHasTabletRead() == null
                ? null : descriptionUpdateDTO.getHasTabletRead());
        retrievedDescription.setHasPets(descriptionUpdateDTO.getHasPets());
        retrievedDescription.setPets(descriptionUpdateDTO.getPets());
        retrievedDescription.setHasCook(descriptionUpdateDTO.getHasCook());
        retrievedDescription.setCook(descriptionUpdateDTO.getCook());
        retrievedDescription.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedDescription;
    }

    public Experience convertExperienceUpdateDTOToExperience(Experience retrievedExperience,
                                                             ExperienceUpdateDTO experienceUpdateDTO) {
        retrievedExperience.setNeutralColor(experienceUpdateDTO.getNeutralColor().toString());
        retrievedExperience.setLivelyColor(experienceUpdateDTO.getLivelyColor().toString());
        retrievedExperience.setLikeToFeel(experienceUpdateDTO.getLikeToFeel());
        retrievedExperience.setHouseMeaning(experienceUpdateDTO.getHouseMeaning());
        retrievedExperience.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedExperience;
    }

    public Building convertBuildingUpdateDTOToBuilding(Building retrievedBuilding, BuildingUpdateDTO buildingUpdateDTO) {
        retrievedBuilding.setNeighborhoodRelationship(buildingUpdateDTO.getNeighborhoodRelationship() == null
                ? null : buildingUpdateDTO.getNeighborhoodRelationship());
        retrievedBuilding.setDeterminingFactor(buildingUpdateDTO.getDeterminingFactor());
        retrievedBuilding.setArchitecturalLanguage(buildingUpdateDTO.getArchitecturalLanguage());
        retrievedBuilding.setBalconyIntegration(buildingUpdateDTO.getBalconyIntegration());
        retrievedBuilding.setBuildingManagerContact(buildingUpdateDTO.getBuildingManagerContact() == null
                ? null : buildingUpdateDTO.getBuildingManagerContact());
        retrievedBuilding.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedBuilding;
    }

    public Toilet convertToiletUpdateDTOToToilet(Toilet retrievedToilet, ToiletUpdateDTO toiletUpdateDTO) {
        retrievedToilet.setApartmentPattern(toiletUpdateDTO.getApartmentPattern());
        retrievedToilet.setDesignToilet(toiletUpdateDTO.getDesignToilet());
        retrievedToilet.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedToilet;
    }

    public EntranceHall convertEntranceHallUpdateDTOToEntranceHall(EntranceHall retrievedEntranceHall,
                                                                   EntranceHallUpdateDTO entranceHallUpdateDTO) {
        retrievedEntranceHall.setHasShoesHouseWalking(entranceHallUpdateDTO.getHasShoesHouseWalking() == null
                ? null : entranceHallUpdateDTO.getHasShoesHouseWalking());
        retrievedEntranceHall.setHasEntranceConsoleTable((entranceHallUpdateDTO.getHasEntranceConsoleTable()));
        retrievedEntranceHall.setHasWantEntranceConsoleTable((entranceHallUpdateDTO.getHasWantEntranceConsoleTable()));
        retrievedEntranceHall.setHasFullLengthMirror((entranceHallUpdateDTO.getHasFullLengthMirror()));
        retrievedEntranceHall.setHasFamiliarWithElectronicLocks((entranceHallUpdateDTO.getHasFamiliarWithElectronicLocks()));
        retrievedEntranceHall.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedEntranceHall;
    }

    public LivingRoom convertLivingRoomUpdateDTOToLivingRoom(LivingRoom retrievedLivingRoom,
                                                             LivingRoomUpdateDTO livingRoomUpdateDTO) {
        retrievedLivingRoom.setPeople(livingRoomUpdateDTO.getPeople());
        retrievedLivingRoom.setHasPeople(livingRoomUpdateDTO.getHasPeople());
        retrievedLivingRoom.setTvInch(livingRoomUpdateDTO.getTvInch());
        retrievedLivingRoom.setEquipmentLiving(livingRoomUpdateDTO.getEquipmentLiving());
        retrievedLivingRoom.setHasSofaWithChaise(livingRoomUpdateDTO.getHasSofaWithChaise());
        retrievedLivingRoom.setHasSofaWithRetractableChaise(livingRoomUpdateDTO.getHasSofaWithRetractableChaise());
        retrievedLivingRoom.setHasBooksOrCollection(livingRoomUpdateDTO.getHasBooksOrCollection());
        retrievedLivingRoom.setHasUsedDaily(livingRoomUpdateDTO.getHasUsedDaily());
        retrievedLivingRoom.setReceivesManyPeople(livingRoomUpdateDTO.getReceivesManyPeople());
        retrievedLivingRoom.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedLivingRoom;
    }

    public DiningRoom convertDiningRoomUpdateDTOToDiningRoom(DiningRoom retrievedDiningRoom,
                                                             DiningRoomUpdateDTO diningRoomUpdateDTO) {
        retrievedDiningRoom.setDiningTableCapacity(diningRoomUpdateDTO.getDiningTableCapacity());
        retrievedDiningRoom.setDailyMealsLocation(diningRoomUpdateDTO.getDailyMealsLocation());
        retrievedDiningRoom.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedDiningRoom;
    }

    public Kitchen convertKitchenUpdateDTOToKitchen(Kitchen retrievedKitchen, KitchenUpdateDTO kitchenUpdateDTO) {
        retrievedKitchen.setColorType(kitchenUpdateDTO.getColorType().toString());
        retrievedKitchen.setShapeType(kitchenUpdateDTO.getShapeType().toString());
        retrievedKitchen.setCounterTopMaterial(kitchenUpdateDTO.getCounterTopMaterial());
        retrievedKitchen.setMaterialPreference(kitchenUpdateDTO.getMaterialPreference().toString());
        retrievedKitchen.setHasWetGutterOrBuiltInTrashCan(kitchenUpdateDTO.getHasWetGutterOrBuiltInTrashCan());
        retrievedKitchen.setHasStove(kitchenUpdateDTO.getHasStove());
        retrievedKitchen.setHasCooktop(kitchenUpdateDTO.getHasCooktop());
        retrievedKitchen.setHasInduction(kitchenUpdateDTO.getHasInduction());
        retrievedKitchen.setHasBurners(kitchenUpdateDTO.getHasBurners());
        retrievedKitchen.setHasStoveOnCounterTop(kitchenUpdateDTO.getHasStoveOnCounterTop());
        retrievedKitchen.setHasStoveOnTower(kitchenUpdateDTO.getHasStoveOnTower());
        retrievedKitchen.setFridgeType(kitchenUpdateDTO.getFridgeType() == null
                ? null : kitchenUpdateDTO.getFridgeType());
        retrievedKitchen.setHasSeparateFreezer(kitchenUpdateDTO.getHasSeparateFreezer() == null
                ? null : kitchenUpdateDTO.getHasSeparateFreezer());
        retrievedKitchen.setFridgeCapacityLiters(kitchenUpdateDTO.getFridgeCapacityLiters() == null
                ? null : kitchenUpdateDTO.getFridgeCapacityLiters());
        retrievedKitchen.setCurrentStorageSatisfaction(kitchenUpdateDTO.getCurrentStorageSatisfaction());
        retrievedKitchen.setDinnerCapacity(kitchenUpdateDTO.getDinnerCapacity());
        retrievedKitchen.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedKitchen;
    }

    public Laundry convertLaundryUpdateDTOToLaundry(Laundry retrievedLaundry, LaundryUpdateDTO laundryUpdateDTO) {
        retrievedLaundry.setHasBuiltInSink(laundryUpdateDTO.getHasBuiltInSink());
        retrievedLaundry.setHasPorcelainSink(laundryUpdateDTO.getHasPorcelainSink());
        retrievedLaundry.setHasPetFoodAndBowlsStoredHere(laundryUpdateDTO.getHasPetFoodAndBowlsStoredHere() == null
                ? null : laundryUpdateDTO.getHasPetFoodAndBowlsStoredHere());
        retrievedLaundry.setHasRecyclesTrash(laundryUpdateDTO.getHasRecyclesTrash() == null
                ? null : laundryUpdateDTO.getHasPetFoodAndBowlsStoredHere());//
        retrievedLaundry.setCurrentDryingRackCount(laundryUpdateDTO.getCurrentDryingRackCount());
        retrievedLaundry.setDryingRackSizes(laundryUpdateDTO.getDryingRackSizes());
        retrievedLaundry.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedLaundry;
    }

    public Bathroom convertBathroomUpdateDTOToBathroom(Bathroom retrievedBathroom, BathroomUpdateDTO bathroomUpdateDTO) {
        retrievedBathroom.setHasAllRenovated(bathroomUpdateDTO.getHasBathtub());
        retrievedBathroom.setPreferredSinkShape(bathroomUpdateDTO.getPreferredSinkShape().toString());
        retrievedBathroom.setPreferredFlushType(bathroomUpdateDTO.getPreferredFlushType().toString());
        retrievedBathroom.setHasHygienicShower(bathroomUpdateDTO.getHasHygienicShower());
        retrievedBathroom.setHasBidet(bathroomUpdateDTO.getHasBidet());
        retrievedBathroom.setHasPrefersMixerTap(bathroomUpdateDTO.getHasPrefersMixerTap());
        retrievedBathroom.setHasPrefersSingleHandle(bathroomUpdateDTO.getHasPrefersSingleHandle());
        retrievedBathroom.setHasElectricTowelRack(bathroomUpdateDTO.getHasElectricTowelRack());
        retrievedBathroom.setHasLaundryHamperInCabinet(bathroomUpdateDTO.getHasLaundryHamperInCabinet());
        retrievedBathroom.setHasMakeupInBathroomMirror(bathroomUpdateDTO.getHasMakeupInBathroomMirror());
        retrievedBathroom.setHasManyProductsOnCounter(bathroomUpdateDTO.getHasManyProductsOnCounter());
        retrievedBathroom.setHasDailyUseOfHairdryer(bathroomUpdateDTO.getHasDailyUseOfHairdryer());
        retrievedBathroom.setHasShowerNicheForProducts(bathroomUpdateDTO.getHasShowerNicheForProducts());
        retrievedBathroom.setHasCurrentStorageMeetsNeeds(bathroomUpdateDTO.getHasCurrentStorageMeetsNeeds());
        retrievedBathroom.setHasDesireMoreStorageSpace(bathroomUpdateDTO.getHasDesireMoreStorageSpace());
        retrievedBathroom.setHasSaunaInShower(bathroomUpdateDTO.getHasSaunaInShower());
        retrievedBathroom.setHasBathtub(bathroomUpdateDTO.getHasBathtub());
        retrievedBathroom.setHasImmersion(bathroomUpdateDTO.getHasImmersion());
        retrievedBathroom.setHasHydro(bathroomUpdateDTO.getHasHydro());
        retrievedBathroom.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedBathroom;
    }

    public MasterSuite convertMasterSuiteUpdateDTOToMasterSuite(MasterSuite retrievedMasterSuite, MasterSuiteUpdateDTO masterSuiteUpdateDTO) {
        retrievedMasterSuite.setBedType(masterSuiteUpdateDTO.getBedType().toString());
        retrievedMasterSuite.setHasTv(masterSuiteUpdateDTO.getHasTv());
        retrievedMasterSuite.setHasArmchair(masterSuiteUpdateDTO.getHasArmchair());
        retrievedMasterSuite.setHasBench(masterSuiteUpdateDTO.getHasBench());
        retrievedMasterSuite.setReadsInBed(masterSuiteUpdateDTO.getReadsInBed());
        retrievedMasterSuite.setHasNightStandDrawer(masterSuiteUpdateDTO.getHasNightStandDrawer());
        retrievedMasterSuite.setHasWoodHeadboardPreference(masterSuiteUpdateDTO.getHasWoodHeadboardPreference());
        retrievedMasterSuite.setHasFabricHeadboardPreference(masterSuiteUpdateDTO.getHasFabricHeadboardPreference());
        retrievedMasterSuite.setHasFullLengthMirror(masterSuiteUpdateDTO.getHasFullLengthMirror());
        retrievedMasterSuite.setCurrentClosetLength(masterSuiteUpdateDTO.getCurrentClosetLength());
        retrievedMasterSuite.setCurrentClothesRailLength(masterSuiteUpdateDTO.getCurrentClothesRailLength());
        retrievedMasterSuite.setCurrentShoePairsCount(masterSuiteUpdateDTO.getCurrentShoePairsCount());
        retrievedMasterSuite.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedMasterSuite;
    }

    public DescendantsSuite convertDescendantsSuiteUpdateDTOToDescendantsSuite(
            DescendantsSuite retrievedDescendantsSuite,
            DescendantsSuiteUpdateDTO descendantsSuiteUpdateDTO) {
        retrievedDescendantsSuite.setBedType(descendantsSuiteUpdateDTO.getBedType().toString());
        retrievedDescendantsSuite.setHasTv(descendantsSuiteUpdateDTO.getHasTv());
        retrievedDescendantsSuite.setHasChildStudy(descendantsSuiteUpdateDTO.getHasChildStudy());
        retrievedDescendantsSuite.setHasChildReceivesFriendsToSleep(
                descendantsSuiteUpdateDTO.getHasChildReceivesFriendsToSleep() == null
                        ? null : descendantsSuiteUpdateDTO.getHasChildReceivesFriendsToSleep());
        retrievedDescendantsSuite.setTheme(descendantsSuiteUpdateDTO.getTheme());
        retrievedDescendantsSuite.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedDescendantsSuite;
    }

    public GuestsSuite convertGuestsSuiteUpdateDTOToGuestsSuite(GuestsSuite retrievedGuestsSuite,
                                                                GuestsSuiteUpdateDTO guestsSuiteUpdateDTO) {
        retrievedGuestsSuite.setBedType(guestsSuiteUpdateDTO.getBedType().toString());
        retrievedGuestsSuite.setClosetUse(guestsSuiteUpdateDTO.getClosetUse() == null
                ? null : guestsSuiteUpdateDTO.getClosetUse());
        retrievedGuestsSuite.setFrequencyOfGuests(guestsSuiteUpdateDTO.getFrequencyOfGuests() == null
                ? null : guestsSuiteUpdateDTO.getFrequencyOfGuests());
        retrievedGuestsSuite.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedGuestsSuite;
    }

    public HomeOfficeSuite convertHomeOfficeSuiteUpdateDTOToHomeOfficeSuite(
            HomeOfficeSuite retrievedHomeOfficeSuite,
            HomeOfficeSuiteUpdateDTO homeOfficeSuiteUpdateDTO) {
        retrievedHomeOfficeSuite.setBedType(homeOfficeSuiteUpdateDTO.getBedType().toString());
        retrievedHomeOfficeSuite.setNeedsPrivacy(homeOfficeSuiteUpdateDTO.getNeedsPrivacy() == null
                ? null : homeOfficeSuiteUpdateDTO.getNeedsPrivacy());
        retrievedHomeOfficeSuite.setNeedsSpaceForBooksDocumentsOrPapers(
                homeOfficeSuiteUpdateDTO.getNeedsSpaceForBooksDocumentsOrPapers() == null
                        ? null : homeOfficeSuiteUpdateDTO.getNeedsSpaceForBooksDocumentsOrPapers());
        retrievedHomeOfficeSuite.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedHomeOfficeSuite;
    }

    public GeneralInfo convertGeneralInfoUpdateDTOToGeneralInfo(GeneralInfo retrievedGeneralInfo,
                                                                GeneralInfoUpdateDTO generalInfoUpdateDTO) {
        retrievedGeneralInfo.setReuse(generalInfoUpdateDTO.getReuse());
        retrievedGeneralInfo.setAdditional(generalInfoUpdateDTO.getAdditional());
        retrievedGeneralInfo.setUnlistedFurnitureOrEquipment(generalInfoUpdateDTO.getUnlistedFurnitureOrEquipment());
        retrievedGeneralInfo.setAvoidanceRequests(generalInfoUpdateDTO.getAvoidanceRequests());
        retrievedGeneralInfo.setPlantRelationship(generalInfoUpdateDTO.getPlantRelationship());
        retrievedGeneralInfo.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedGeneralInfo;
    }

    public StyleAndMoods convertStyleAndMoodsUpdateDTOToStyleAndMoods(StyleAndMoods retrievedStyleAndMoods,
                                                                      StyleAndMoodsUpdateDTO styleAndMoodsUpdateDTO) {
        retrievedStyleAndMoods.setAmbientStyle(styleAndMoodsUpdateDTO.getAmbientStyle().toString());
        retrievedStyleAndMoods.setAmbientStyleDescription(styleAndMoodsUpdateDTO.getAmbientStyleDescription());
        retrievedStyleAndMoods.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedStyleAndMoods;
    }

    public Context convertContextUpdateDTOToContext(Context retrievedContext, ContextUpdateDTO contextUpdateDTO) {
        retrievedContext.setProjectLifeStageSignificance(contextUpdateDTO.getProjectLifeStageSignificance());
        retrievedContext.setInvestmentExpectation(contextUpdateDTO.getInvestmentExpectation());
        retrievedContext.setProjectDurationExpectation(contextUpdateDTO.getProjectDurationExpectation());
        retrievedContext.setLocationDuringRenovation(contextUpdateDTO.getLocationDuringRenovation());
        retrievedContext.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedContext;
    }

    public Form convertFormUpdateDTOToForm(Form retrievedForm, FormUpdateDTO formUpdateDTO) {
        retrievedForm.setTitle(formUpdateDTO.getTitle());
        retrievedForm.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));

        return retrievedForm;
    }
}
