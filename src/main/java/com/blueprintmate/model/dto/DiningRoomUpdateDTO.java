package com.blueprintmate.model.dto;

public class DiningRoomUpdateDTO {
    private Integer diningTableCapacity;
    private String dailyMealsLocation;

    public DiningRoomUpdateDTO() {
    }

    public DiningRoomUpdateDTO(Integer diningTableCapacity, String dailyMealsLocation) {
        this.diningTableCapacity = diningTableCapacity;
        this.dailyMealsLocation = dailyMealsLocation;
    }

    public Integer getDiningTableCapacity() {
        return diningTableCapacity;
    }

    public void setDiningTableCapacity(Integer diningTableCapacity) {
        this.diningTableCapacity = diningTableCapacity;
    }

    public String getDailyMealsLocation() {
        return dailyMealsLocation;
    }

    public void setDailyMealsLocation(String dailyMealsLocation) {
        this.dailyMealsLocation = dailyMealsLocation;
    }
}
