package com.blueprintmate.model.dto;

public class ContextUpdateDTO {
    private String projectLifeStageSignificance;
    private String investmentExpectation;
    private String projectDurationExpectation;
    private String locationDuringRenovation;

    public ContextUpdateDTO() {
    }

    public ContextUpdateDTO(String projectLifeStageSignificance, String investmentExpectation,
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
