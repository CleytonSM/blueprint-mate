package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.ColorType;
import com.blueprintmate.model.enumerable.MaterialPreference;
import com.blueprintmate.model.enumerable.ShapeType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class KitchenCreateDTO {
    @NotBlank(message = "ColorType field can't be null")
    private ColorType colorType;
    @NotBlank(message = "ShapeType field can't be null")
    private ShapeType shapeType;
    @NotBlank(message = "CounterTopMaterial field can't be null")
    private String counterTopMaterial;
    @NotBlank(message = "MaterialPreference field can't be null")
    private MaterialPreference materialPreference;
    @NotNull(message = "HasWetGutterOrBuiltInTrashCan field can't be null")
    private Boolean hasWetGutterOrBuiltInTrashCan;
    private List<NewAppliancesCreateOnKitchenDTO> newAppliancesOnKitchenList;
    private List<ReuseAppliancesCreateOnKitchenDTO> reuseAppliancesOnKitchenList;
    @NotNull(message = "HasStove field can't be null")
    private Boolean hasStove;
    @NotNull(message = "HasCooktop field can't be null")
    private Boolean hasCooktop;
    @NotNull(message = "HasInduction field can't be null")
    private Boolean hasInduction;
    @NotNull(message = "HasBurners field can't be null")
    private Boolean hasBurners;
    @NotNull(message = "HasStoveOnCounterTop field can't be null")
    private Boolean hasStoveOnCounterTop;
    @NotNull(message = "HasStoveOnTower field can't be null")
    private Boolean hasStoveOnTower;
    private String fridgeType;
    private Boolean hasSeparateFreezer;
    private Integer fridgeCapacityLiters;
    @NotBlank(message = "CurrentStorageSatisfaction field can't be null")
    private String currentStorageSatisfaction;
    private List<NecessaryAppliancesCreateOnKitchenDTO> necessaryAppliancesOnKitchenList;
    private AppliancesConfigCreateDTO appliancesConfig;
    @NotNull(message = "DinnerCapacity field can't be null")
    private Integer dinnerCapacity;

    public KitchenCreateDTO() {
    }

    public KitchenCreateDTO(ColorType colorType, ShapeType shapeType, String counterTopMaterial,
                            MaterialPreference materialPreference, Boolean hasWetGutterOrBuiltInTrashCan,
                            List<NewAppliancesCreateOnKitchenDTO> newAppliancesOnKitchenList,
                            List<ReuseAppliancesCreateOnKitchenDTO> reuseAppliancesOnKitchenList, Boolean hasStove, Boolean hasCooktop,
                            Boolean hasInduction, Boolean hasBurners, Boolean hasStoveOnCounterTop,
                            Boolean hasStoveOnTower, String fridgeType, Boolean hasSeparateFreezer,
                            Integer fridgeCapacityLiters, String currentStorageSatisfaction,
                            List<NecessaryAppliancesCreateOnKitchenDTO> necessaryAppliancesOnKitchenList,
                            AppliancesConfigCreateDTO appliancesConfig, Integer dinnerCapacity) {
        this.colorType = colorType;
        this.shapeType = shapeType;
        this.counterTopMaterial = counterTopMaterial;
        this.materialPreference = materialPreference;
        this.hasWetGutterOrBuiltInTrashCan = hasWetGutterOrBuiltInTrashCan;
        this.newAppliancesOnKitchenList = newAppliancesOnKitchenList;
        this.reuseAppliancesOnKitchenList = reuseAppliancesOnKitchenList;
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
        this.necessaryAppliancesOnKitchenList = necessaryAppliancesOnKitchenList;
        this.appliancesConfig = appliancesConfig;
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

    public List<NewAppliancesCreateOnKitchenDTO> getNewAppliancesOnKitchenList() {
        return newAppliancesOnKitchenList;
    }

    public void setNewAppliancesOnKitchenList(List<NewAppliancesCreateOnKitchenDTO> newAppliancesOnKitchenList) {
        this.newAppliancesOnKitchenList = newAppliancesOnKitchenList;
    }

    public List<ReuseAppliancesCreateOnKitchenDTO> getReuseAppliancesOnKitchenList() {
        return reuseAppliancesOnKitchenList;
    }

    public void setReuseAppliancesOnKitchenList(List<ReuseAppliancesCreateOnKitchenDTO> reuseAppliancesOnKitchenList) {
        this.reuseAppliancesOnKitchenList = reuseAppliancesOnKitchenList;
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

    public List<NecessaryAppliancesCreateOnKitchenDTO> getNecessaryAppliancesOnKitchenList() {
        return necessaryAppliancesOnKitchenList;
    }

    public void setNecessaryAppliancesOnKitchenList(List<NecessaryAppliancesCreateOnKitchenDTO> necessaryAppliancesOnKitchenList) {
        this.necessaryAppliancesOnKitchenList = necessaryAppliancesOnKitchenList;
    }

    public AppliancesConfigCreateDTO getAppliancesConfig() {
        return appliancesConfig;
    }

    public void setAppliancesConfig(AppliancesConfigCreateDTO appliancesConfig) {
        this.appliancesConfig = appliancesConfig;
    }

    public Integer getDinnerCapacity() {
        return dinnerCapacity;
    }

    public void setDinnerCapacity(Integer dinnerCapacity) {
        this.dinnerCapacity = dinnerCapacity;
    }
}