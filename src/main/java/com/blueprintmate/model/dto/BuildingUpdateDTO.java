package com.blueprintmate.model.dto;

public class BuildingUpdateDTO {
    private String neighborhoodRelationship;
    private String determiningFactor;
    private String architecturalLanguage;
    private String balconyIntegration;
    private String buildingManagerContact;

    public BuildingUpdateDTO() {
    }

    public BuildingUpdateDTO(String neighborhoodRelationship, String determiningFactor, String architecturalLanguage,
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
