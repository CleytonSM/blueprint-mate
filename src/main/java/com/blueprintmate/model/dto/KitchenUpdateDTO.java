package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.ColorType;
import com.blueprintmate.model.enumerable.MaterialPreference;
import com.blueprintmate.model.enumerable.ShapeType;

public class KitchenUpdateDTO {
    private ColorType colorType;
    private ShapeType shapeType;
    private String counterTopMaterial;
    private MaterialPreference materialPreference;
    private Boolean hasWetGutterOrBuiltInTrashCan;
    private Boolean hasStove;
    private Boolean hasCooktop;
    private Boolean hasInduction;
    private Boolean hasBurners;
    private Boolean hasStoveOnCounterTop;
    private Boolean hasStoveOnTower;
    private String fridgeType;
    private Boolean hasSeparateFreezer;
    private Integer fridgeCapacityLiters;
    private String currentStorageSatisfaction;
    private AppliancesInKitchenUpdateDTO appliances;
    private Integer dinnerCapacity;

    public KitchenUpdateDTO() {
    }

    public KitchenUpdateDTO(ColorType colorType, ShapeType shapeType, String counterTopMaterial,
                            MaterialPreference materialPreference, Boolean hasWetGutterOrBuiltInTrashCan,
                            Boolean hasStove, Boolean hasCooktop, Boolean hasInduction, Boolean hasBurners,
                            Boolean hasStoveOnCounterTop, Boolean hasStoveOnTower, String fridgeType,
                            Boolean hasSeparateFreezer, Integer fridgeCapacityLiters, String currentStorageSatisfaction,
                            AppliancesInKitchenUpdateDTO appliances, Integer dinnerCapacity) {
        this.colorType = colorType;
        this.shapeType = shapeType;
        this.counterTopMaterial = counterTopMaterial;
        this.materialPreference = materialPreference;
        this.hasWetGutterOrBuiltInTrashCan = hasWetGutterOrBuiltInTrashCan;
        this.hasStove = hasStove;
        this.hasCooktop = hasCooktop;
        this.hasInduction = hasInduction;
        this.hasBurners = hasBurners;
        this.hasStoveOnCounterTop = hasStoveOnCounterTop;
        this.hasStoveOnTower = hasStoveOnTower;
        this.fridgeType = fridgeType;
        this.hasSeparateFreezer = hasSeparateFreezer;
        this.fridgeCapacityLiters = fridgeCapacityLiters;
        this.currentStorageSatisfaction = currentStorageSatisfaction;
        this.appliances = appliances;
        this.dinnerCapacity = dinnerCapacity;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public String getCounterTopMaterial() {
        return counterTopMaterial;
    }

    public void setCounterTopMaterial(String counterTopMaterial) {
        this.counterTopMaterial = counterTopMaterial;
    }

    public MaterialPreference getMaterialPreference() {
        return materialPreference;
    }

    public void setMaterialPreference(MaterialPreference materialPreference) {
        this.materialPreference = materialPreference;
    }

    public Boolean getHasWetGutterOrBuiltInTrashCan() {
        return hasWetGutterOrBuiltInTrashCan;
    }

    public void setHasWetGutterOrBuiltInTrashCan(Boolean hasWetGutterOrBuiltInTrashCan) {
        this.hasWetGutterOrBuiltInTrashCan = hasWetGutterOrBuiltInTrashCan;
    }

    public Boolean getHasStove() {
        return hasStove;
    }

    public void setHasStove(Boolean hasStove) {
        this.hasStove = hasStove;
    }

    public Boolean getHasCooktop() {
        return hasCooktop;
    }

    public void setHasCooktop(Boolean hasCooktop) {
        this.hasCooktop = hasCooktop;
    }

    public Boolean getHasInduction() {
        return hasInduction;
    }

    public void setHasInduction(Boolean hasInduction) {
        this.hasInduction = hasInduction;
    }

    public Boolean getHasBurners() {
        return hasBurners;
    }

    public void setHasBurners(Boolean hasBurners) {
        this.hasBurners = hasBurners;
    }

    public Boolean getHasStoveOnCounterTop() {
        return hasStoveOnCounterTop;
    }

    public void setHasStoveOnCounterTop(Boolean hasStoveOnCounterTop) {
        this.hasStoveOnCounterTop = hasStoveOnCounterTop;
    }

    public Boolean getHasStoveOnTower() {
        return hasStoveOnTower;
    }

    public void setHasStoveOnTower(Boolean hasStoveOnTower) {
        this.hasStoveOnTower = hasStoveOnTower;
    }

    public String getFridgeType() {
        return fridgeType;
    }

    public void setFridgeType(String fridgeType) {
        this.fridgeType = fridgeType;
    }

    public Boolean getHasSeparateFreezer() {
        return hasSeparateFreezer;
    }

    public void setHasSeparateFreezer(Boolean hasSeparateFreezer) {
        this.hasSeparateFreezer = hasSeparateFreezer;
    }

    public Integer getFridgeCapacityLiters() {
        return fridgeCapacityLiters;
    }

    public void setFridgeCapacityLiters(Integer fridgeCapacityLiters) {
        this.fridgeCapacityLiters = fridgeCapacityLiters;
    }

    public String getCurrentStorageSatisfaction() {
        return currentStorageSatisfaction;
    }

    public void setCurrentStorageSatisfaction(String currentStorageSatisfaction) {
        this.currentStorageSatisfaction = currentStorageSatisfaction;
    }

    public AppliancesInKitchenUpdateDTO getAppliances() {
        return appliances;
    }

    public void setAppliances(AppliancesInKitchenUpdateDTO appliances) {
        this.appliances = appliances;
    }

    public Integer getDinnerCapacity() {
        return dinnerCapacity;
    }

    public void setDinnerCapacity(Integer dinnerCapacity) {
        this.dinnerCapacity = dinnerCapacity;
    }
}
