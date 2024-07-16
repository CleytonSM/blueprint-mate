package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DiningRoomCreateDTO {
    @NotNull(message = "DiningTableCapacity field can't be null")
    private Integer diningTableCapacity;
    @NotBlank(message = "DailyMealsLocation field can't be null")
    private String dailyMealsLocation;

    public DiningRoomCreateDTO() {
    }

    public DiningRoomCreateDTO(Integer diningTableCapacity, String dailyMealsLocation) {
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
