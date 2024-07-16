package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.BedType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class MasterSuiteCreateDTO {
    @NotBlank(message = "BedType field can't be null")
    private BedType bedType;
    @NotNull(message = "HasTv field can't be null")
    private Boolean hasTv;
    @NotNull(message = "HasArmchair field can't be null")
    private Boolean hasArmchair;
    @NotNull(message = "HasBench field can't be null")
    private Boolean hasBench;
    @NotNull(message = "TeadsInBed field can't be null")
    private Boolean readsInBed;
    @NotNull(message = "HasNightStandDrawer field can't be null")
    private Boolean hasNightStandDrawer;
    @NotNull(message = "HasWoodHeadboardPreference field can't be null")
    private Boolean hasWoodHeadboardPreference;
    @NotNull(message = "HasFabricHeadboardPreference field can't be null")
    private Boolean hasFabricHeadboardPreference;
    @NotNull(message = "HasFullLengthMirror field can't be null")
    private Boolean hasFullLengthMirror;
    @NotNull(message = "CurrentClosetLength field can't be null")
    private float currentClosetLength;
    private float currentClothesRailLength;
    private int currentShoePairsCount;

    public MasterSuiteCreateDTO() {
    }

    public MasterSuiteCreateDTO(BedType bedType, Boolean hasTv, Boolean hasArmchair, Boolean hasBench,
                                Boolean readsInBed, Boolean hasNightStandDrawer, Boolean hasWoodHeadboardPreference,
                                Boolean hasFabricHeadboardPreference, Boolean hasFullLengthMirror,
                                float currentClosetLength, float currentClothesRailLength, int currentShoePairsCount) {
        this.bedType = bedType;
        this.hasTv = hasTv;
        this.hasArmchair = hasArmchair;
        this.hasBench = hasBench;
        this.readsInBed = readsInBed;
        this.hasNightStandDrawer = hasNightStandDrawer;
        this.hasWoodHeadboardPreference = hasWoodHeadboardPreference;
        this.hasFabricHeadboardPreference = hasFabricHeadboardPreference;
        this.hasFullLengthMirror = hasFullLengthMirror;
        this.currentClosetLength = currentClosetLength;
        this.currentClothesRailLength = currentClothesRailLength;
        this.currentShoePairsCount = currentShoePairsCount;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public Boolean getHasTv() {
        return hasTv;
    }

    public void setHasTv(Boolean hasTv) {
        this.hasTv = hasTv;
    }

    public Boolean getHasArmchair() {
        return hasArmchair;
    }

    public void setHasArmchair(Boolean hasArmchair) {
        this.hasArmchair = hasArmchair;
    }

    public Boolean getHasBench() {
        return hasBench;
    }

    public void setHasBench(Boolean hasBench) {
        this.hasBench = hasBench;
    }

    public Boolean getReadsInBed() {
        return readsInBed;
    }

    public void setReadsInBed(Boolean readsInBed) {
        this.readsInBed = readsInBed;
    }

    public Boolean getHasNightStandDrawer() {
        return hasNightStandDrawer;
    }

    public void setHasNightStandDrawer(Boolean hasNightStandDrawer) {
        this.hasNightStandDrawer = hasNightStandDrawer;
    }

    public Boolean getHasWoodHeadboardPreference() {
        return hasWoodHeadboardPreference;
    }

    public void setHasWoodHeadboardPreference(Boolean hasWoodHeadboardPreference) {
        this.hasWoodHeadboardPreference = hasWoodHeadboardPreference;
    }

    public Boolean getHasFabricHeadboardPreference() {
        return hasFabricHeadboardPreference;
    }

    public void setHasFabricHeadboardPreference(Boolean hasFabricHeadboardPreference) {
        this.hasFabricHeadboardPreference = hasFabricHeadboardPreference;
    }

    public Boolean getHasFullLengthMirror() {
        return hasFullLengthMirror;
    }

    public void setHasFullLengthMirror(Boolean hasFullLengthMirror) {
        this.hasFullLengthMirror = hasFullLengthMirror;
    }

    public float getCurrentClosetLength() {
        return currentClosetLength;
    }

    public void setCurrentClosetLength(float currentClosetLength) {
        this.currentClosetLength = currentClosetLength;
    }

    public float getCurrentClothesRailLength() {
        return currentClothesRailLength;
    }

    public void setCurrentClothesRailLength(float currentClothesRailLength) {
        this.currentClothesRailLength = currentClothesRailLength;
    }

    public int getCurrentShoePairsCount() {
        return currentShoePairsCount;
    }

    public void setCurrentShoePairsCount(int currentShoePairsCount) {
        this.currentShoePairsCount = currentShoePairsCount;
    }
}
