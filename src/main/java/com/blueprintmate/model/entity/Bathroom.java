package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_bathroom")
public class Bathroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bathroom")
    private int id;
    @OneToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
    @Column(name = "bool_all_renovated_bathroom")
    private Boolean hasAllRenovated;
    @Column(name = "preferred_sink_shape_bathroom", length = 50)
    private String preferredSinkShape;
    @Column(name = "preferred_flush_type_bathroom", length = 20)
    private String preferredFlushType;
    @Column(name = "bool_hygienic_shower_bathroom")
    private Boolean hasHygienicShower;
    @Column(name = "bool_bidet_bathroom")
    private Boolean hasBidet;
    @Column(name = "bool_prefers_mixer_tap_bathroom")
    private Boolean hasPrefersMixerTap;
    @Column(name = "bool_prefers_single_handle_bathroom")
    private Boolean hasPrefersSingleHandle;
    @Column(name = "bool_electric_towel_rack_bathroom")
    private Boolean hasElectricTowelRack;
    @Column(name = "bool_laundry_hamper_in_cabinet_bathroom")
    private Boolean hasLaundryHamperInCabinet;
    @Column(name = "bool_makeup_in_bathroom_mirror_bathroom")
    private Boolean hasMakeupInBathroomMirror;
    @Column(name = "bool_many_products_on_counter_bathroom")
    private Boolean hasManyProductsOnCounter;
    @Column(name = "bool_daily_use_of_hairdryer_bathroom")
    private Boolean hasDailyUseOfHairdryer;
    @Column(name = "bool_shower_niche_for_products_bathroom")
    private Boolean hasShowerNicheForProducts;
    @Column(name = "bool_current_storage_meets_needs_bathroom")
    private Boolean hasCurrentStorageMeetsNeeds;
    @Column(name = "bool_desire_more_storage_space_bathroom")
    private Boolean hasDesireMoreStorageSpace;
    @Column(name = "bool_sauna_in_shower_bathroom")
    private Boolean hasSaunaInShower;
    @Column(name = "bool_bathtub_bathroom")
    private Boolean hasBathtub;
    @Column(name = "bool_immersion_bathroom")
    private Boolean hasImmersion;
    @Column(name = "bool_hydro_bathroom")
    private Boolean hasHydro;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Bathroom() {
    }

    public Bathroom(Form form, Boolean hasAllRenovated, String preferredSinkShape, String preferredFlushType,
                    Boolean hasHygienicShower, Boolean hasBidet, Boolean hasPrefersMixerTap,
                    Boolean hasPrefersSingleHandle, Boolean hasElectricTowelRack, Boolean hasLaundryHamperInCabinet,
                    Boolean hasMakeupInBathroomMirror, Boolean hasManyProductsOnCounter, Boolean hasDailyUseOfHairdryer,
                    Boolean hasShowerNicheForProducts, Boolean hasCurrentStorageMeetsNeeds,
                    Boolean hasDesireMoreStorageSpace, Boolean hasSaunaInShower, Boolean hasBathtub,
                    Boolean hasImmersion, Boolean hasHydro, Timestamp createdAt, Timestamp updatedAt,
                    Timestamp deletedAt) {
        this.form = form;
        this.hasAllRenovated = hasAllRenovated;
        this.preferredSinkShape = preferredSinkShape;
        this.preferredFlushType = preferredFlushType;
        this.hasHygienicShower = hasHygienicShower;
        this.hasBidet = hasBidet;
        this.hasPrefersMixerTap = hasPrefersMixerTap;
        this.hasPrefersSingleHandle = hasPrefersSingleHandle;
        this.hasElectricTowelRack = hasElectricTowelRack;
        this.hasLaundryHamperInCabinet = hasLaundryHamperInCabinet;
        this.hasMakeupInBathroomMirror = hasMakeupInBathroomMirror;
        this.hasManyProductsOnCounter = hasManyProductsOnCounter;
        this.hasDailyUseOfHairdryer = hasDailyUseOfHairdryer;
        this.hasShowerNicheForProducts = hasShowerNicheForProducts;
        this.hasCurrentStorageMeetsNeeds = hasCurrentStorageMeetsNeeds;
        this.hasDesireMoreStorageSpace = hasDesireMoreStorageSpace;
        this.hasSaunaInShower = hasSaunaInShower;
        this.hasBathtub = hasBathtub;
        this.hasImmersion = hasImmersion;
        this.hasHydro = hasHydro;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public int getId() {
        return id;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Boolean getHasAllRenovated() {
        return hasAllRenovated;
    }

    public void setHasAllRenovated(Boolean hasAllRenovated) {
        this.hasAllRenovated = hasAllRenovated;
    }

    public String getPreferredSinkShape() {
        return preferredSinkShape;
    }

    public void setPreferredSinkShape(String preferredSinkShape) {
        this.preferredSinkShape = preferredSinkShape;
    }

    public String getPreferredFlushType() {
        return preferredFlushType;
    }

    public void setPreferredFlushType(String preferredFlushType) {
        this.preferredFlushType = preferredFlushType;
    }

    public Boolean getHasHygienicShower() {
        return hasHygienicShower;
    }

    public void setHasHygienicShower(Boolean hasHygienicShower) {
        this.hasHygienicShower = hasHygienicShower;
    }

    public Boolean getHasBidet() {
        return hasBidet;
    }

    public void setHasBidet(Boolean hasBidet) {
        this.hasBidet = hasBidet;
    }

    public Boolean getHasPrefersMixerTap() {
        return hasPrefersMixerTap;
    }

    public void setHasPrefersMixerTap(Boolean hasPrefersMixerTap) {
        this.hasPrefersMixerTap = hasPrefersMixerTap;
    }

    public Boolean getHasPrefersSingleHandle() {
        return hasPrefersSingleHandle;
    }

    public void setHasPrefersSingleHandle(Boolean hasPrefersSingleHandle) {
        this.hasPrefersSingleHandle = hasPrefersSingleHandle;
    }

    public Boolean getHasElectricTowelRack() {
        return hasElectricTowelRack;
    }

    public void setHasElectricTowelRack(Boolean hasElectricTowelRack) {
        this.hasElectricTowelRack = hasElectricTowelRack;
    }

    public Boolean getHasLaundryHamperInCabinet() {
        return hasLaundryHamperInCabinet;
    }

    public void setHasLaundryHamperInCabinet(Boolean hasLaundryHamperInCabinet) {
        this.hasLaundryHamperInCabinet = hasLaundryHamperInCabinet;
    }

    public Boolean getHasMakeupInBathroomMirror() {
        return hasMakeupInBathroomMirror;
    }

    public void setHasMakeupInBathroomMirror(Boolean hasMakeupInBathroomMirror) {
        this.hasMakeupInBathroomMirror = hasMakeupInBathroomMirror;
    }

    public Boolean getHasManyProductsOnCounter() {
        return hasManyProductsOnCounter;
    }

    public void setHasManyProductsOnCounter(Boolean hasManyProductsOnCounter) {
        this.hasManyProductsOnCounter = hasManyProductsOnCounter;
    }

    public Boolean getHasDailyUseOfHairdryer() {
        return hasDailyUseOfHairdryer;
    }

    public void setHasDailyUseOfHairdryer(Boolean hasDailyUseOfHairdryer) {
        this.hasDailyUseOfHairdryer = hasDailyUseOfHairdryer;
    }

    public Boolean getHasShowerNicheForProducts() {
        return hasShowerNicheForProducts;
    }

    public void setHasShowerNicheForProducts(Boolean hasShowerNicheForProducts) {
        this.hasShowerNicheForProducts = hasShowerNicheForProducts;
    }

    public Boolean getHasCurrentStorageMeetsNeeds() {
        return hasCurrentStorageMeetsNeeds;
    }

    public void setHasCurrentStorageMeetsNeeds(Boolean hasCurrentStorageMeetsNeeds) {
        this.hasCurrentStorageMeetsNeeds = hasCurrentStorageMeetsNeeds;
    }

    public Boolean getHasDesireMoreStorageSpace() {
        return hasDesireMoreStorageSpace;
    }

    public void setHasDesireMoreStorageSpace(Boolean hasDesireMoreStorageSpace) {
        this.hasDesireMoreStorageSpace = hasDesireMoreStorageSpace;
    }

    public Boolean getHasSaunaInShower() {
        return hasSaunaInShower;
    }

    public void setHasSaunaInShower(Boolean hasSaunaInShower) {
        this.hasSaunaInShower = hasSaunaInShower;
    }

    public Boolean getHasBathtub() {
        return hasBathtub;
    }

    public void setHasBathtub(Boolean hasBathtub) {
        this.hasBathtub = hasBathtub;
    }

    public Boolean getHasImmersion() {
        return hasImmersion;
    }

    public void setHasImmersion(Boolean hasImmersion) {
        this.hasImmersion = hasImmersion;
    }

    public Boolean getHasHydro() {
        return hasHydro;
    }

    public void setHasHydro(Boolean hasHydro) {
        this.hasHydro = hasHydro;
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
