package com.blueprintmate.model.dto;

public class NecessaryAppliancesInKitchenUpdateDTO {
    private String name;
    private Boolean hasUsedDaily;

    public NecessaryAppliancesInKitchenUpdateDTO() {
    }

    public NecessaryAppliancesInKitchenUpdateDTO(String name, Boolean hasUsedDaily) {
        this.name = name;
        this.hasUsedDaily = hasUsedDaily;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasUsedDaily() {
        return hasUsedDaily;
    }

    public void setHasUsedDaily(Boolean hasUsedDaily) {
        this.hasUsedDaily = hasUsedDaily;
    }
}
