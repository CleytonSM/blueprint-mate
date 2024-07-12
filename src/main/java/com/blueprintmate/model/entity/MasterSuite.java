package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@PrimaryKeyJoinColumn(name = "id_master_suite")
public class MasterSuite extends Suite {

    @ManyToOne
    @JoinColumn(name = "id_master_suite", referencedColumnName = "id_suite", nullable = false, insertable = false, updatable = false)
    private Suite suite;

    @Column(name = "bool_tv_in_master_suite")
    private boolean hasTv;

    @Column(name = "bool_armchair_or_bench_master_suite")
    private boolean hasArmchairOrBench;

    @Column(name = "bool_reads_in_bed_master_suite")
    private boolean readsInBed;

    @Column(name = "bool_nightstand_drawer_master_suite")
    private boolean hasNightStandDrawer;

    @Column(name = "bool_wood_headboard_preference_master_suite")
    private boolean hasWoodHeadboardPreference;

    @Column(name = "bool_fabric_headboard_preference_master_suite")
    private boolean hasFabricHeadboardPreference;

    @Column(name = "bool_full_length_mirror_in_master_suite")
    private boolean hasFullLengthMirror;

    @Column(name = "current_closet_length_master_suite")
    private float currentClosetLength;

    @Column(name = "current_clothes_rail_length_master_suite")
    private float currentClothesRailLength;

    @Column(name = "current_shoe_pairs_count_master_suite")
    private int currentShoePairsCount;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public MasterSuite() {
    }

    public MasterSuite(Form form, String bedType, boolean hasTv, boolean hasArmchairOrBench, boolean readsInBed,
                       boolean hasNightStandDrawer, boolean hasWoodHeadboardPreference,
                       boolean hasFabricHeadboardPreference, boolean hasFullLengthMirror, float currentClosetLength,
                       float currentClothesRailLength, int currentShoePairsCount, Timestamp createdAt,
                       Timestamp updatedAt, Timestamp deletedAt) {
        super(form, bedType);
        this.hasTv = hasTv;
        this.hasArmchairOrBench = hasArmchairOrBench;
        this.readsInBed = readsInBed;
        this.hasNightStandDrawer = hasNightStandDrawer;
        this.hasWoodHeadboardPreference = hasWoodHeadboardPreference;
        this.hasFabricHeadboardPreference = hasFabricHeadboardPreference;
        this.hasFullLengthMirror = hasFullLengthMirror;
        this.currentClosetLength = currentClosetLength;
        this.currentClothesRailLength = currentClothesRailLength;
        this.currentShoePairsCount = currentShoePairsCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Suite getSuite() {
        return suite;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }

    public boolean isHasArmchairOrBench() {
        return hasArmchairOrBench;
    }

    public void setHasArmchairOrBench(boolean hasArmchairOrBench) {
        this.hasArmchairOrBench = hasArmchairOrBench;
    }

    public boolean isReadsInBed() {
        return readsInBed;
    }

    public void setReadsInBed(boolean readsInBed) {
        this.readsInBed = readsInBed;
    }

    public boolean isHasNightStandDrawer() {
        return hasNightStandDrawer;
    }

    public void setHasNightStandDrawer(boolean hasNightStandDrawer) {
        this.hasNightStandDrawer = hasNightStandDrawer;
    }

    public boolean isHasWoodHeadboardPreference() {
        return hasWoodHeadboardPreference;
    }

    public void setHasWoodHeadboardPreference(boolean hasWoodHeadboardPreference) {
        this.hasWoodHeadboardPreference = hasWoodHeadboardPreference;
    }

    public boolean isHasFabricHeadboardPreference() {
        return hasFabricHeadboardPreference;
    }

    public void setHasFabricHeadboardPreference(boolean hasFabricHeadboardPreference) {
        this.hasFabricHeadboardPreference = hasFabricHeadboardPreference;
    }

    public boolean isHasFullLengthMirror() {
        return hasFullLengthMirror;
    }

    public void setHasFullLengthMirror(boolean hasFullLengthMirror) {
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
