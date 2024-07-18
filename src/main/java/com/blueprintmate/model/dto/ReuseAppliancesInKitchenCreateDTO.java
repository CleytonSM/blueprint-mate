package com.blueprintmate.model.dto;

public class ReuseAppliancesInKitchenCreateDTO {
    private String name;

    public ReuseAppliancesInKitchenCreateDTO() {
    }

    public ReuseAppliancesInKitchenCreateDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
