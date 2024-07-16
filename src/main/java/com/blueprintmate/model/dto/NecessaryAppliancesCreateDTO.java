package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class NecessaryAppliancesCreateDTO {

    @NotNull(message = "Name field can't be null")
    private String name;
    @NotBlank(message = "HasUsedDaily field can't be null")
    private Boolean hasUsedDaily;

    public NecessaryAppliancesCreateDTO() {
    }

    public NecessaryAppliancesCreateDTO(String name, Boolean hasUsedDaily) {
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
