package com.blueprintmate.model.dto;

public class ReuseAppliancesCreateDTO {

    private String name;

    public ReuseAppliancesCreateDTO() {
    }

    public ReuseAppliancesCreateDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
