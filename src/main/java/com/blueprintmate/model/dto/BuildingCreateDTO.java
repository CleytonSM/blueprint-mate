package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotBlank;

public class BuildingCreateDTO {
    private String neighborhoodRelationship;
    @NotBlank(message = "DeterminingFactor can't be null")
    private String determiningFactor;
    @NotBlank(message = "ArchitecturalLanguage can't be null")
    private String architecturalLanguage;
    @NotBlank(message = "BalconyIntegration can't be null")
    private String balconyIntegration;
    private String buildingManagerContact;

    public BuildingCreateDTO() {
    }

    public BuildingCreateDTO(String neighborhoodRelationship, String determiningFactor, String architecturalLanguage,
                             String balconyIntegration, String buildingManagerContact) {
        this.neighborhoodRelationship = neighborhoodRelationship;
        this.determiningFactor = determiningFactor;
        this.architecturalLanguage = architecturalLanguage;
        this.balconyIntegration = balconyIntegration;
        this.buildingManagerContact = buildingManagerContact;
    }

    public String getNeighborhoodRelationship() {
        return neighborhoodRelationship;
    }

    public void setNeighborhoodRelationship(String neighborhoodRelationship) {
        this.neighborhoodRelationship = neighborhoodRelationship;
    }

    public String getDeterminingFactor() {
        return determiningFactor;
    }

    public void setDeterminingFactor(String determiningFactor) {
        this.determiningFactor = determiningFactor;
    }

    public String getArchitecturalLanguage() {
        return architecturalLanguage;
    }

    public void setArchitecturalLanguage(String architecturalLanguage) {
        this.architecturalLanguage = architecturalLanguage;
    }

    public String getBalconyIntegration() {
        return balconyIntegration;
    }

    public void setBalconyIntegration(String balconyIntegration) {
        this.balconyIntegration = balconyIntegration;
    }

    public String getBuildingManagerContact() {
        return buildingManagerContact;
    }

    public void setBuildingManagerContact(String buildingManagerContact) {
        this.buildingManagerContact = buildingManagerContact;
    }
}
