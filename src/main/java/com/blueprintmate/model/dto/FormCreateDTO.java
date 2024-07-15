package com.blueprintmate.model.dto;

import com.blueprintmate.model.entity.Kitchen;

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
}
