package com.blueprintmate.model.dto;

public class ReuseAppliancesCreateOnKitchenDTO {

    private String name;

    public ReuseAppliancesCreateOnKitchenDTO() {
    }

    public ReuseAppliancesCreateOnKitchenDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
