package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotNull;

public class NecessaryAppliancesCreateOnLaundryDTO {
//    @NotNull(message = "Name field can't be null")
    private String name;

    public NecessaryAppliancesCreateOnLaundryDTO() {
    }

    public NecessaryAppliancesCreateOnLaundryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
