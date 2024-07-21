package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.FlushType;
import com.blueprintmate.model.enumerable.SinkShape;

public class BathroomUpdateDTO {
    private Boolean hasAllRenovated;
    private SinkShape preferredSinkShape;
    private FlushType preferredFlushType;
    private Boolean hasHygienicShower;
    private Boolean hasBidet;
    private Boolean hasPrefersMixerTap;
    private Boolean hasPrefersSingleHandle;
    private Boolean hasElectricTowelRack;
    private Boolean hasLaundryHamperInCabinet;
    private Boolean hasMakeupInBathroomMirror;
    private Boolean hasManyProductsOnCounter;
    private Boolean hasDailyUseOfHairdryer;
    private Boolean hasShowerNicheForProducts;
    private Boolean hasCurrentStorageMeetsNeeds;
    private Boolean hasDesireMoreStorageSpace;
    private Boolean hasSaunaInShower;
    private Boolean hasBathtub;
    private Boolean hasImmersion;
    private Boolean hasHydro;

    public BathroomUpdateDTO() {
    }

    public BathroomUpdateDTO(Boolean hasAllRenovated, SinkShape preferredSinkShape, FlushType preferredFlushType,
                             Boolean hasHygienicShower, Boolean hasBidet, Boolean hasPrefersMixerTap,
                             Boolean hasPrefersSingleHandle, Boolean hasElectricTowelRack,
                             Boolean hasLaundryHamperInCabinet, Boolean hasMakeupInBathroomMirror,
                             Boolean hasManyProductsOnCounter, Boolean hasDailyUseOfHairdryer,
                             Boolean hasShowerNicheForProducts, Boolean hasCurrentStorageMeetsNeeds,
                             Boolean hasDesireMoreStorageSpace, Boolean hasSaunaInShower, Boolean hasBathtub,
                             Boolean hasImmersion, Boolean hasHydro) {
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
    }

    public Boolean getHasAllRenovated() {
        return hasAllRenovated;
    }

    public void setHasAllRenovated(Boolean hasAllRenovated) {
        this.hasAllRenovated = hasAllRenovated;
    }

    public SinkShape getPreferredSinkShape() {
        return preferredSinkShape;
    }

    public void setPreferredSinkShape(SinkShape preferredSinkShape) {
        this.preferredSinkShape = preferredSinkShape;
    }

    public FlushType getPreferredFlushType() {
        return preferredFlushType;
    }

    public void setPreferredFlushType(FlushType preferredFlushType) {
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
}
