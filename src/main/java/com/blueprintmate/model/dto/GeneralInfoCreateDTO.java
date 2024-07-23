package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotBlank;

public class GeneralInfoCreateDTO {
    @NotBlank(message = "Reuse field can't be null")
    private String reuse;
    @NotBlank(message = "Additional field can't be null")
    private String additional;
    @NotBlank(message = "UnlistedFurnitureOrEquipment field can't be null")
    private String unlistedFurnitureOrEquipment;
    @NotBlank(message = "AvoidanceRequests field can't be null")
    private String avoidanceRequests;
    @NotBlank(message = "PlantRelationship field can't be null")
    private String plantRelationship;

    public GeneralInfoCreateDTO() {
    }

    public GeneralInfoCreateDTO(String reuse, String additional, String unlistedFurnitureOrEquipment,
                                String avoidanceRequests, String plantRelationship) {
        this.reuse = reuse;
        this.additional = additional;
        this.unlistedFurnitureOrEquipment = unlistedFurnitureOrEquipment;
        this.avoidanceRequests = avoidanceRequests;
        this.plantRelationship = plantRelationship;
    }

    public String getReuse() {
        return reuse;
    }

    public void setReuse(String reuse) {
        this.reuse = reuse;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getUnlistedFurnitureOrEquipment() {
        return unlistedFurnitureOrEquipment;
    }

    public void setUnlistedFurnitureOrEquipment(String unlistedFurnitureOrEquipment) {
        this.unlistedFurnitureOrEquipment = unlistedFurnitureOrEquipment;
    }

    public String getAvoidanceRequests() {
        return avoidanceRequests;
    }

    public void setAvoidanceRequests(String avoidanceRequests) {
        this.avoidanceRequests = avoidanceRequests;
    }

    public String getPlantRelationship() {
        return plantRelationship;
    }

    public void setPlantRelationship(String plantRelationship) {
        this.plantRelationship = plantRelationship;
    }
}
