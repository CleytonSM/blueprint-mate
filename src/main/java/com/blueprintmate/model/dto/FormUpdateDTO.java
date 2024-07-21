package com.blueprintmate.model.dto;

public class FormUpdateDTO {
    private String title;
    private DescriptionUpdateDTO description;
    private ExperienceUpdateDTO experience;
    private BuildingUpdateDTO building;
    private ToiletUpdateDTO toilet;
    private EntranceHallUpdateDTO entranceHall;
    private LivingRoomUpdateDTO livingRoom;
    private DiningRoomUpdateDTO diningRoom;
    private KitchenUpdateDTO kitchen;
    private LaundryUpdateDTO laundry;
    private BathroomUpdateDTO bathroom;
    private MasterSuiteUpdateDTO masterSuite;
    private DescendantsSuiteUpdateDTO descendantsSuite;
    private GuestsSuiteUpdateDTO guestsSuite;
    private HomeOfficeSuiteUpdateDTO homeOfficeSuite;
    private GeneralInfoUpdateDTO generalInfo;
    private StyleAndMoodsUpdateDTO styleAndMoods;
    private ContextUpdateDTO context;

    public FormUpdateDTO() {
    }

    public FormUpdateDTO(String title, DescriptionUpdateDTO description, ExperienceUpdateDTO experience,
                         BuildingUpdateDTO building, ToiletUpdateDTO toilet, EntranceHallUpdateDTO entranceHall,
                         LivingRoomUpdateDTO livingRoom, DiningRoomUpdateDTO diningRoom, KitchenUpdateDTO kitchen,
                         LaundryUpdateDTO laundry, BathroomUpdateDTO bathroom, MasterSuiteUpdateDTO masterSuite,
                         DescendantsSuiteUpdateDTO descendantsSuite, GuestsSuiteUpdateDTO guestsSuite,
                         HomeOfficeSuiteUpdateDTO homeOfficeSuite, GeneralInfoUpdateDTO generalInfo,
                         StyleAndMoodsUpdateDTO styleAndMoods, ContextUpdateDTO context) {
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

    public DescriptionUpdateDTO getDescription() {
        return description;
    }

    public void setDescription(DescriptionUpdateDTO description) {
        this.description = description;
    }

    public ExperienceUpdateDTO getExperience() {
        return experience;
    }

    public void setExperience(ExperienceUpdateDTO experience) {
        this.experience = experience;
    }

    public BuildingUpdateDTO getBuilding() {
        return building;
    }

    public void setBuilding(BuildingUpdateDTO building) {
        this.building = building;
    }

    public ToiletUpdateDTO getToilet() {
        return toilet;
    }

    public void setToilet(ToiletUpdateDTO toilet) {
        this.toilet = toilet;
    }

    public EntranceHallUpdateDTO getEntranceHall() {
        return entranceHall;
    }

    public void setEntranceHall(EntranceHallUpdateDTO entranceHall) {
        this.entranceHall = entranceHall;
    }

    public LivingRoomUpdateDTO getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoomUpdateDTO livingRoom) {
        this.livingRoom = livingRoom;
    }

    public DiningRoomUpdateDTO getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoomUpdateDTO diningRoom) {
        this.diningRoom = diningRoom;
    }

    public KitchenUpdateDTO getKitchen() {
        return kitchen;
    }

    public void setKitchen(KitchenUpdateDTO kitchen) {
        this.kitchen = kitchen;
    }

    public LaundryUpdateDTO getLaundry() {
        return laundry;
    }

    public void setLaundry(LaundryUpdateDTO laundry) {
        this.laundry = laundry;
    }

    public BathroomUpdateDTO getBathroom() {
        return bathroom;
    }

    public void setBathroom(BathroomUpdateDTO bathroom) {
        this.bathroom = bathroom;
    }

    public MasterSuiteUpdateDTO getMasterSuite() {
        return masterSuite;
    }

    public void setMasterSuite(MasterSuiteUpdateDTO masterSuite) {
        this.masterSuite = masterSuite;
    }

    public DescendantsSuiteUpdateDTO getDescendantsSuite() {
        return descendantsSuite;
    }

    public void setDescendantsSuite(DescendantsSuiteUpdateDTO descendantsSuite) {
        this.descendantsSuite = descendantsSuite;
    }

    public GuestsSuiteUpdateDTO getGuestsSuite() {
        return guestsSuite;
    }

    public void setGuestsSuite(GuestsSuiteUpdateDTO guestsSuite) {
        this.guestsSuite = guestsSuite;
    }

    public HomeOfficeSuiteUpdateDTO getHomeOfficeSuite() {
        return homeOfficeSuite;
    }

    public void setHomeOfficeSuite(HomeOfficeSuiteUpdateDTO homeOfficeSuite) {
        this.homeOfficeSuite = homeOfficeSuite;
    }

    public GeneralInfoUpdateDTO getGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(GeneralInfoUpdateDTO generalInfo) {
        this.generalInfo = generalInfo;
    }

    public StyleAndMoodsUpdateDTO getStyleAndMoods() {
        return styleAndMoods;
    }

    public void setStyleAndMoods(StyleAndMoodsUpdateDTO styleAndMoods) {
        this.styleAndMoods = styleAndMoods;
    }

    public ContextUpdateDTO getContext() {
        return context;
    }

    public void setContext(ContextUpdateDTO context) {
        this.context = context;
    }
}
