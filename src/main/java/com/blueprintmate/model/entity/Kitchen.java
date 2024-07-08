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
    private String colorTypeKitchen;

    @Column(name = "shape_type_kitchen", length = 30)
    private String shapeTypeKitchen;

    @Column(name = "counter_top_material_kitchen", length = 30)
    private String counterTopMaterialKitchen;

    @Column(name = "material_preference_kitchen", length = 30)
    private String materialPreferenceKitchen;

    @Column(name = "bool_wet_gutter_kitchen")
    private Boolean hasWetGutterKitchen;

    @Column(name = "bool_built_in_trash_can_kitchen")
    private Boolean hasBuiltInTrashCanKitchen;

    @Column(name = "bool_choose_appliances_kitchen")
    private Boolean hasChooseAppliancesKitchen;

    @Column(name = "bool_stove_kitchen")
    private Boolean hasStoveKitchen;

    @Column(name = "bool_cooktop_kitchen")
    private Boolean hasCooktopKitchen;

    @Column(name = "bool_induction_kitchen")
    private Boolean hasInductionKitchen;

    @Column(name = "bool_burners_kitchen")
    private Boolean hasBurnersKitchen;

    @Column(name = "bool_stove_on_counter_top_kitchen")
    private Boolean hasStoveOnCounterTopKitchen;

    @Column(name = "bool_stove_on_tower_kitchen")
    private Boolean hasStoveOnTowerKitchen;

    @Column(name = "fridge_type_kitchen", length = 60)
    private String fridgeTypeKitchen;

    @Column(name = "bool_separate_freezer_kitchen")
    private Boolean hasSeparateFreezerKitchen;

    @Column(name = "fridge_capacity_liters_kitchen", length = 140)
    private Integer fridgeCapacityLitersKitchen;

    @Column(name = "current_storage_satisfaction_kitchen")
    private String currentStorageSatisfactionKitchen;

    @Column(name = "dinner_capacity_kitchen")
    private Integer dinnerCapacityKitchen;

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

    public String getColorTypeKitchen() {
        return colorTypeKitchen;
    }

    public void setColorTypeKitchen(String colorTypeKitchen) {
        this.colorTypeKitchen = colorTypeKitchen;
    }

    public String getShapeTypeKitchen() {
        return shapeTypeKitchen;
    }

    public void setShapeTypeKitchen(String shapeTypeKitchen) {
        this.shapeTypeKitchen = shapeTypeKitchen;
    }

    public String getCounterTopMaterialKitchen() {
        return counterTopMaterialKitchen;
    }

    public void setCounterTopMaterialKitchen(String counterTopMaterialKitchen) {
        this.counterTopMaterialKitchen = counterTopMaterialKitchen;
    }

    public String getMaterialPreferenceKitchen() {
        return materialPreferenceKitchen;
    }

    public void setMaterialPreferenceKitchen(String materialPreferenceKitchen) {
        this.materialPreferenceKitchen = materialPreferenceKitchen;
    }

    public Boolean getHasWetGutterKitchen() {
        return hasWetGutterKitchen;
    }

    public void setHasWetGutterKitchen(Boolean hasWetGutterKitchen) {
        this.hasWetGutterKitchen = hasWetGutterKitchen;
    }

    public Boolean getHasBuiltInTrashCanKitchen() {
        return hasBuiltInTrashCanKitchen;
    }

    public void setHasBuiltInTrashCanKitchen(Boolean hasBuiltInTrashCanKitchen) {
        this.hasBuiltInTrashCanKitchen = hasBuiltInTrashCanKitchen;
    }

    public Boolean getHasChooseAppliancesKitchen() {
        return hasChooseAppliancesKitchen;
    }

    public void setHasChooseAppliancesKitchen(Boolean hasChooseAppliancesKitchen) {
        this.hasChooseAppliancesKitchen = hasChooseAppliancesKitchen;
    }

    public Boolean getHasStoveKitchen() {
        return hasStoveKitchen;
    }

    public void setHasStoveKitchen(Boolean hasStoveKitchen) {
        this.hasStoveKitchen = hasStoveKitchen;
    }

    public Boolean getHasCooktopKitchen() {
        return hasCooktopKitchen;
    }

    public void setHasCooktopKitchen(Boolean hasCooktopKitchen) {
        this.hasCooktopKitchen = hasCooktopKitchen;
    }

    public Boolean getHasInductionKitchen() {
        return hasInductionKitchen;
    }

    public void setHasInductionKitchen(Boolean hasInductionKitchen) {
        this.hasInductionKitchen = hasInductionKitchen;
    }

    public Boolean getHasBurnersKitchen() {
        return hasBurnersKitchen;
    }

    public void setHasBurnersKitchen(Boolean hasBurnersKitchen) {
        this.hasBurnersKitchen = hasBurnersKitchen;
    }

    public Boolean getHasStoveOnCounterTopKitchen() {
        return hasStoveOnCounterTopKitchen;
    }

    public void setHasStoveOnCounterTopKitchen(Boolean hasStoveOnCounterTopKitchen) {
        this.hasStoveOnCounterTopKitchen = hasStoveOnCounterTopKitchen;
    }

    public Boolean getHasStoveOnTowerKitchen() {
        return hasStoveOnTowerKitchen;
    }

    public void setHasStoveOnTowerKitchen(Boolean hasStoveOnTowerKitchen) {
        this.hasStoveOnTowerKitchen = hasStoveOnTowerKitchen;
    }

    public String getFridgeTypeKitchen() {
        return fridgeTypeKitchen;
    }

    public void setFridgeTypeKitchen(String fridgeTypeKitchen) {
        this.fridgeTypeKitchen = fridgeTypeKitchen;
    }

    public Boolean getHasSeparateFreezerKitchen() {
        return hasSeparateFreezerKitchen;
    }

    public void setHasSeparateFreezerKitchen(Boolean hasSeparateFreezerKitchen) {
        this.hasSeparateFreezerKitchen = hasSeparateFreezerKitchen;
    }

    public Integer getFridgeCapacityLitersKitchen() {
        return fridgeCapacityLitersKitchen;
    }

    public void setFridgeCapacityLitersKitchen(Integer fridgeCapacityLitersKitchen) {
        this.fridgeCapacityLitersKitchen = fridgeCapacityLitersKitchen;
    }

    public String getCurrentStorageSatisfactionKitchen() {
        return currentStorageSatisfactionKitchen;
    }

    public void setCurrentStorageSatisfactionKitchen(String currentStorageSatisfactionKitchen) {
        this.currentStorageSatisfactionKitchen = currentStorageSatisfactionKitchen;
    }

    public Integer getDinnerCapacityKitchen() {
        return dinnerCapacityKitchen;
    }

    public void setDinnerCapacityKitchen(Integer dinnerCapacityKitchen) {
        this.dinnerCapacityKitchen = dinnerCapacityKitchen;
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
