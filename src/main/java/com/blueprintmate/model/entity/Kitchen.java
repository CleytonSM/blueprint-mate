package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_kitchen")
@PrimaryKeyJoinColumn(name = "id_kitchen")
public class Kitchen extends Project {

    @ManyToOne
    @JoinColumn(name = "id_kitchen", referencedColumnName = "id_project",
            nullable = false, insertable = false, updatable = false)
    private Project project;

    @Column(name = "color_type_kitchen", length = 30)
    private String colorType;

    @Column(name = "shape_type_kitchen", length = 30)
    private String shapeType;

    @Column(name = "counter_top_material_kitchen", length = 30)
    private String counterTopMaterial;

    @Column(name = "material_preference_kitchen", length = 30)
    private String materialPreference;

    @Column(name = "bool_wet_gutter_kitchen")
    private Boolean hasWetGutter;

    @Column(name = "bool_built_in_trash_can_kitchen")
    private Boolean hasBuiltInTrashCan;

    @Column(name = "bool_choose_appliances_kitchen")
    private Boolean hasChooseAppliances;

    @Column(name = "bool_stove_kitchen")
    private Boolean hasStove;

    @Column(name = "bool_cooktop_kitchen")
    private Boolean hasCooktop;

    @Column(name = "bool_induction_kitchen")
    private Boolean hasInduction;

    @Column(name = "bool_burners_kitchen")
    private Boolean hasBurners;

    @Column(name = "bool_stove_on_counter_top_kitchen")
    private Boolean hasStoveOnCounterTop;

    @Column(name = "bool_stove_on_tower_kitchen")
    private Boolean hasStoveOnTower;

    @Column(name = "fridge_type_kitchen", length = 60)
    private String fridgeType;

    @Column(name = "bool_separate_freezer_kitchen")
    private Boolean hasSeparateFreezer;

    @Column(name = "fridge_capacity_liters_kitchen", length = 140)
    private Integer fridgeCapacityLiters;

    @Column(name = "current_storage_satisfaction_kitchen")
    private String currentStorageSatisfaction;

    @Column(name = "dinner_capacity_kitchen")
    private Integer dinnerCapacity;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getCounterTopMaterial() {
        return counterTopMaterial;
    }

    public void setCounterTopMaterial(String counterTopMaterial) {
        this.counterTopMaterial = counterTopMaterial;
    }

    public String getMaterialPreference() {
        return materialPreference;
    }

    public void setMaterialPreference(String materialPreference) {
        this.materialPreference = materialPreference;
    }

    public Boolean getHasWetGutter() {
        return hasWetGutter;
    }

    public void setHasWetGutter(Boolean hasWetGutter) {
        this.hasWetGutter = hasWetGutter;
    }

    public Boolean getHasBuiltInTrashCan() {
        return hasBuiltInTrashCan;
    }

    public void setHasBuiltInTrashCan(Boolean hasBuiltInTrashCan) {
        this.hasBuiltInTrashCan = hasBuiltInTrashCan;
    }

    public Boolean getHasChooseAppliances() {
        return hasChooseAppliances;
    }

    public void setHasChooseAppliances(Boolean hasChooseAppliances) {
        this.hasChooseAppliances = hasChooseAppliances;
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

    public Integer getDinnerCapacity() {
        return dinnerCapacity;
    }

    public void setDinnerCapacity(Integer dinnerCapacity) {
        this.dinnerCapacity = dinnerCapacity;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }
}
