package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_bathroom")
@PrimaryKeyJoinColumn(name = "id_bathroom")
public class Bathroom extends Project {

    @ManyToOne
    @JoinColumn(name = "id_bathroom", referencedColumnName = "id_project",
            nullable = false, insertable = false, updatable = false)
    private Project project;

    @Column(name = "bool_all_renovated_bathroom")
    private Boolean hasAllRenovatedBathroom;

    @Column(name = "preferred_sink_shape_bathroom", length = 50)
    private String preferredSinkShapeNathroom;

    @Column(name = "preferred_flush_type_bathroom", length = 20)
    private String preferredFlushTypeBathroom;

    @Column(name = "bool_hygienic_shower_bathroom")
    private Boolean hasHygienicShowerBathroom;

    @Column(name = "bool_bidet_bathroom")
    private Boolean hasBidetBathroom;

    @Column(name = "bool_prefers_mixer_tap_bathroom")
    private Boolean hasPrefersMixerTapBathroom;

    @Column(name = "bool_prefers_single_handle_bathroom")
    private Boolean hasPrefersSingleHandleBathroom;

    @Column(name = "bool_electric_towel_rack_bathroom")
    private Boolean hasElectricTowelRackBathroom;

    @Column(name = "bool_laundry_hamper_in_cabinet_bathroom")
    private Boolean hasLaundryHamperInCabinetBathroom;

    @Column(name = "bool_makeup_in_bathroom_mirror_bathroom")
    private Boolean hasMakeupInBathroomMirrorBathroom;

    @Column(name = "bool_many_products_on_counter_bathroom")
    private Boolean hasManyProductsOnCounterBathroom;

    @Column(name = "bool_daily_use_of_hairdryer_bathroom")
    private Boolean hasDailyUseOfHairdryerBathroom;

    @Column(name = "bool_shower_niche_for_products_bathroom")
    private Boolean hasShowerNicheForProductsBathroom;

    @Column(name = "bool_current_storage_meets_needs_bathroom")
    private Boolean hasCurrentStorageMeetsNeedsBathroom;

    @Column(name = "bool_desire_more_storage_space_bathroom")
    private Boolean hasDesireMoreStorageSpaceBathroom;

    @Column(name = "bool_bathtub_bathroom")
    private Boolean hasBathtubBathroom;

    @Column(name = "bool_immersion_bathroom")
    private Boolean hasImmersionBathroom;

    @Column(name = "bool_hydro_bathroom")
    private Boolean hasHydroBathroom;

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

    public Boolean getHasAllRenovatedBathroom() {
        return hasAllRenovatedBathroom;
    }

    public void setHasAllRenovatedBathroom(Boolean hasAllRenovatedBathroom) {
        this.hasAllRenovatedBathroom = hasAllRenovatedBathroom;
    }

    public String getPreferredSinkShapeNathroom() {
        return preferredSinkShapeNathroom;
    }

    public void setPreferredSinkShapeNathroom(String preferredSinkShapeNathroom) {
        this.preferredSinkShapeNathroom = preferredSinkShapeNathroom;
    }

    public String getPreferredFlushTypeBathroom() {
        return preferredFlushTypeBathroom;
    }

    public void setPreferredFlushTypeBathroom(String preferredFlushTypeBathroom) {
        this.preferredFlushTypeBathroom = preferredFlushTypeBathroom;
    }

    public Boolean getHasHygienicShowerBathroom() {
        return hasHygienicShowerBathroom;
    }

    public void setHasHygienicShowerBathroom(Boolean hasHygienicShowerBathroom) {
        this.hasHygienicShowerBathroom = hasHygienicShowerBathroom;
    }

    public Boolean getHasBidetBathroom() {
        return hasBidetBathroom;
    }

    public void setHasBidetBathroom(Boolean hasBidetBathroom) {
        this.hasBidetBathroom = hasBidetBathroom;
    }

    public Boolean getHasPrefersMixerTapBathroom() {
        return hasPrefersMixerTapBathroom;
    }

    public void setHasPrefersMixerTapBathroom(Boolean hasPrefersMixerTapBathroom) {
        this.hasPrefersMixerTapBathroom = hasPrefersMixerTapBathroom;
    }

    public Boolean getHasPrefersSingleHandleBathroom() {
        return hasPrefersSingleHandleBathroom;
    }

    public void setHasPrefersSingleHandleBathroom(Boolean hasPrefersSingleHandleBathroom) {
        this.hasPrefersSingleHandleBathroom = hasPrefersSingleHandleBathroom;
    }

    public Boolean getHasElectricTowelRackBathroom() {
        return hasElectricTowelRackBathroom;
    }

    public void setHasElectricTowelRackBathroom(Boolean hasElectricTowelRackBathroom) {
        this.hasElectricTowelRackBathroom = hasElectricTowelRackBathroom;
    }

    public Boolean getHasLaundryHamperInCabinetBathroom() {
        return hasLaundryHamperInCabinetBathroom;
    }

    public void setHasLaundryHamperInCabinetBathroom(Boolean hasLaundryHamperInCabinetBathroom) {
        this.hasLaundryHamperInCabinetBathroom = hasLaundryHamperInCabinetBathroom;
    }

    public Boolean getHasMakeupInBathroomMirrorBathroom() {
        return hasMakeupInBathroomMirrorBathroom;
    }

    public void setHasMakeupInBathroomMirrorBathroom(Boolean hasMakeupInBathroomMirrorBathroom) {
        this.hasMakeupInBathroomMirrorBathroom = hasMakeupInBathroomMirrorBathroom;
    }

    public Boolean getHasManyProductsOnCounterBathroom() {
        return hasManyProductsOnCounterBathroom;
    }

    public void setHasManyProductsOnCounterBathroom(Boolean hasManyProductsOnCounterBathroom) {
        this.hasManyProductsOnCounterBathroom = hasManyProductsOnCounterBathroom;
    }

    public Boolean getHasDailyUseOfHairdryerBathroom() {
        return hasDailyUseOfHairdryerBathroom;
    }

    public void setHasDailyUseOfHairdryerBathroom(Boolean hasDailyUseOfHairdryerBathroom) {
        this.hasDailyUseOfHairdryerBathroom = hasDailyUseOfHairdryerBathroom;
    }

    public Boolean getHasShowerNicheForProductsBathroom() {
        return hasShowerNicheForProductsBathroom;
    }

    public void setHasShowerNicheForProductsBathroom(Boolean hasShowerNicheForProductsBathroom) {
        this.hasShowerNicheForProductsBathroom = hasShowerNicheForProductsBathroom;
    }

    public Boolean getHasCurrentStorageMeetsNeedsBathroom() {
        return hasCurrentStorageMeetsNeedsBathroom;
    }

    public void setHasCurrentStorageMeetsNeedsBathroom(Boolean hasCurrentStorageMeetsNeedsBathroom) {
        this.hasCurrentStorageMeetsNeedsBathroom = hasCurrentStorageMeetsNeedsBathroom;
    }

    public Boolean getHasDesireMoreStorageSpaceBathroom() {
        return hasDesireMoreStorageSpaceBathroom;
    }

    public void setHasDesireMoreStorageSpaceBathroom(Boolean hasDesireMoreStorageSpaceBathroom) {
        this.hasDesireMoreStorageSpaceBathroom = hasDesireMoreStorageSpaceBathroom;
    }

    public Boolean getHasBathtubBathroom() {
        return hasBathtubBathroom;
    }

    public void setHasBathtubBathroom(Boolean hasBathtubBathroom) {
        this.hasBathtubBathroom = hasBathtubBathroom;
    }

    public Boolean getHasImmersionBathroom() {
        return hasImmersionBathroom;
    }

    public void setHasImmersionBathroom(Boolean hasImmersionBathroom) {
        this.hasImmersionBathroom = hasImmersionBathroom;
    }

    public Boolean getHasHydroBathroom() {
        return hasHydroBathroom;
    }

    public void setHasHydroBathroom(Boolean hasHydroBathroom) {
        this.hasHydroBathroom = hasHydroBathroom;
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
