package com.blueprintmate.model.dto;

public class FormCreateDTO {
    private String title;
    private DescriptionCreateDTO description;
    private ExperienceCreateDTO experience;
    private BuildingCreateDTO building;
    private ToiletCreateDTO toilet;
    private EntranceHallCreateDTO entranceHall;
    private LivingRoomCreateDTO livingRoom;
    private DiningRoomCreateDTO diningRoom;
    private KitchenCreateDTO kitchen;
    private LaundryCreateDTO laundry;
    private BathroomCreateDTO bathroom;
    private MasterSuiteCreateDTO masterSuite;
    private DescendantsSuiteCreateDTO descendantsSuite;
    private GuestsSuiteCreateDTO guestsSuite;
    private HomeOfficeSuiteCreateDTO homeOfficeSuite;
    private GeneralInfoCreateDTO generalInfo;
    private StyleAndMoodsCreateDTO styleAndMoods;
    private ContextCreateDTO context;

    public FormCreateDTO() {
    }

    public FormCreateDTO(String title, DescriptionCreateDTO description, ExperienceCreateDTO experience,
                         BuildingCreateDTO building, ToiletCreateDTO toilet, EntranceHallCreateDTO entranceHall,
                         LivingRoomCreateDTO livingRoom, DiningRoomCreateDTO diningRoom, KitchenCreateDTO kitchen,
                         LaundryCreateDTO laundry, BathroomCreateDTO bathroom, MasterSuiteCreateDTO masterSuite,
                         DescendantsSuiteCreateDTO descendantsSuite, GuestsSuiteCreateDTO guestsSuite,
                         HomeOfficeSuiteCreateDTO homeOfficeSuite, GeneralInfoCreateDTO generalInfo,
                         StyleAndMoodsCreateDTO styleAndMoods, ContextCreateDTO context) {
        this.title = title;
        this.description = description;
        this.experience = experience;
        this.building = building;
        this.toilet = toilet;
        this.entranceHall = entranceHall;
        this.livingRoom = livingRoom;
        this.diningRoom = diningRoom;
        this.kitchen = kitchen;
        this.laundry = laundry;
        this.bathroom = bathroom;
        this.masterSuite = masterSuite;
        this.descendantsSuite = descendantsSuite;
        this.guestsSuite = guestsSuite;
        this.homeOfficeSuite = homeOfficeSuite;
        this.generalInfo = generalInfo;
        this.styleAndMoods = styleAndMoods;
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DescriptionCreateDTO getDescription() {
        return description;
    }

    public void setDescription(DescriptionCreateDTO description) {
        this.description = description;
    }

    public ExperienceCreateDTO getExperience() {
        return experience;
    }

    public void setExperience(ExperienceCreateDTO experience) {
        this.experience = experience;
    }

    public BuildingCreateDTO getBuilding() {
        return building;
    }

    public void setBuilding(BuildingCreateDTO building) {
        this.building = building;
    }

    public ToiletCreateDTO getToilet() {
        return toilet;
    }

    public void setToilet(ToiletCreateDTO toilet) {
        this.toilet = toilet;
    }

    public EntranceHallCreateDTO getEntranceHall() {
        return entranceHall;
    }

    public void setEntranceHall(EntranceHallCreateDTO entranceHall) {
        this.entranceHall = entranceHall;
    }

    public LivingRoomCreateDTO getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoomCreateDTO livingRoom) {
        this.livingRoom = livingRoom;
    }

    public DiningRoomCreateDTO getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoomCreateDTO diningRoom) {
        this.diningRoom = diningRoom;
    }

    public KitchenCreateDTO getKitchen() {
        return kitchen;
    }

    public void setKitchen(KitchenCreateDTO kitchen) {
        this.kitchen = kitchen;
    }

    public LaundryCreateDTO getLaundry() {
        return laundry;
    }

    public void setLaundry(LaundryCreateDTO laundry) {
        this.laundry = laundry;
    }

    public BathroomCreateDTO getBathroom() {
        return bathroom;
    }

    public void setBathroom(BathroomCreateDTO bathroom) {
        this.bathroom = bathroom;
    }

    public MasterSuiteCreateDTO getMasterSuite() {
        return masterSuite;
    }

    public void setMasterSuite(MasterSuiteCreateDTO masterSuite) {
        this.masterSuite = masterSuite;
    }

    public DescendantsSuiteCreateDTO getDescendantsSuite() {
        return descendantsSuite;
    }

    public void setDescendantsSuite(DescendantsSuiteCreateDTO descendantsSuite) {
        this.descendantsSuite = descendantsSuite;
    }

    public GuestsSuiteCreateDTO getGuestsSuite() {
        return guestsSuite;
    }

    public void setGuestsSuite(GuestsSuiteCreateDTO guestsSuite) {
        this.guestsSuite = guestsSuite;
    }

    public HomeOfficeSuiteCreateDTO getHomeOfficeSuite() {
        return homeOfficeSuite;
    }

    public void setHomeOfficeSuite(HomeOfficeSuiteCreateDTO homeOfficeSuite) {
        this.homeOfficeSuite = homeOfficeSuite;
    }

    public GeneralInfoCreateDTO getGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(GeneralInfoCreateDTO generalInfo) {
        this.generalInfo = generalInfo;
    }

    public StyleAndMoodsCreateDTO getStyleAndMoods() {
        return styleAndMoods;
    }

    public void setStyleAndMoods(StyleAndMoodsCreateDTO styleAndMoods) {
        this.styleAndMoods = styleAndMoods;
    }

    public ContextCreateDTO getContext() {
        return context;
    }

    public void setContext(ContextCreateDTO context) {
        this.context = context;
    }
}
