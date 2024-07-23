package com.blueprintmate.model.dto;

public class GeneralInfoUpdateDTO {
    private String reuse;
    private String additional;
    private String unlistedFurnitureOrEquipment;
    private String avoidanceRequests;
    private String plantRelationship;

    public GeneralInfoUpdateDTO() {
    }

    public GeneralInfoUpdateDTO(String reuse, String additional, String unlistedFurnitureOrEquipment,
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
