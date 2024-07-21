package com.blueprintmate.model.dto;

public class NecessaryAppliancesUpdateOnLaundryDTO {
    private String name;

    public NecessaryAppliancesUpdateOnLaundryDTO() {
    }

    public NecessaryAppliancesUpdateOnLaundryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
