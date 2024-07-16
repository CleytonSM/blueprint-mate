package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotBlank;

public class ContextCreateDTO {
    @NotBlank(message = "ProjectLifeStageSignificance field can't be null")
    private String projectLifeStageSignificance;
    @NotBlank(message = "InvestmentExpectation field can't be null")
    private String investmentExpectation;
    @NotBlank(message = "ProjectDurationExpectation field can't be null")
    private String projectDurationExpectation;
    @NotBlank(message = "LocationDuringRenovation field can't be null")
    private String locationDuringRenovation;

    public ContextCreateDTO() {
    }

    public ContextCreateDTO(String projectLifeStageSignificance, String investmentExpectation,
                            String projectDurationExpectation, String locationDuringRenovation) {
        this.projectLifeStageSignificance = projectLifeStageSignificance;
        this.investmentExpectation = investmentExpectation;
        this.projectDurationExpectation = projectDurationExpectation;
        this.locationDuringRenovation = locationDuringRenovation;
    }

    public String getProjectLifeStageSignificance() {
        return projectLifeStageSignificance;
    }

    public void setProjectLifeStageSignificance(String projectLifeStageSignificance) {
        this.projectLifeStageSignificance = projectLifeStageSignificance;
    }

    public String getInvestmentExpectation() {
        return investmentExpectation;
    }

    public void setInvestmentExpectation(String investmentExpectation) {
        this.investmentExpectation = investmentExpectation;
    }

    public String getProjectDurationExpectation() {
        return projectDurationExpectation;
    }

    public void setProjectDurationExpectation(String projectDurationExpectation) {
        this.projectDurationExpectation = projectDurationExpectation;
    }

    public String getLocationDuringRenovation() {
        return locationDuringRenovation;
    }

    public void setLocationDuringRenovation(String locationDuringRenovation) {
        this.locationDuringRenovation = locationDuringRenovation;
    }
}
