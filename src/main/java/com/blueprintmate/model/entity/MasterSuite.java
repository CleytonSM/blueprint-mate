package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_master_suite")
public class MasterSuite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_master_suite")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
    @Column(name = "bed_type_suite", length = 30)
    private String bedType;
    @Column(name = "bool_tv_in_master_suite")
    private Boolean hasTv;
    @Column(name = "bool_armchair_master_suite")
    private Boolean hasArmchair;
    @Column(name = "bool_bench_master_suite")
    private Boolean hasBench;
    @Column(name = "bool_reads_in_bed_master_suite")
    private Boolean readsInBed;
    @Column(name = "bool_nightstand_drawer_master_suite")
    private Boolean hasNightStandDrawer;
    @Column(name = "bool_wood_headboard_preference_master_suite")
    private Boolean hasWoodHeadboardPreference;
    @Column(name = "bool_fabric_headboard_preference_master_suite")
    private Boolean hasFabricHeadboardPreference;
    @Column(name = "bool_full_length_mirror_in_master_suite")
    private Boolean hasFullLengthMirror;
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

    public MasterSuite(Form form, String bedType, Boolean hasTv, Boolean hasArmchair, Boolean readsInBed,
                       Boolean hasNightStandDrawer, Boolean hasWoodHeadboardPreference,
                       Boolean hasFabricHeadboardPreference, Boolean hasFullLengthMirror, float currentClosetLength,
                       float currentClothesRailLength, int currentShoePairsCount, Timestamp createdAt,
                       Timestamp updatedAt, Timestamp deletedAt) {
        this.form = form;
        this.bedType = bedType;
        this.hasTv = hasTv;
        this.hasArmchair = hasArmchair;
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

    public int getId() {
        return id;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
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
