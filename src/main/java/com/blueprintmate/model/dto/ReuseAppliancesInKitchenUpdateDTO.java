package com.blueprintmate.model.dto;

public class ReuseAppliancesInKitchenUpdateDTO {
    private String name;

    public ReuseAppliancesInKitchenUpdateDTO() {
    }

    public ReuseAppliancesInKitchenUpdateDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
