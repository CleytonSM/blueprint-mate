package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_living_room")
@PrimaryKeyJoinColumn(name = "id_living_room")
public class LivingRoom extends Project {

    @ManyToOne
    @JoinColumn(name = "id_living_room", referencedColumnName = "id_project",
            nullable = false, insertable = false, updatable = false)
    private Project project;

    @Column(name = "people_in_living_room")
    private Integer peopleInLivingRoom;

    @Column(name = "bool_tv_is_important_living_room")
    private Boolean hasPeopleInLivingRoom;

    @Column(name = "tv_inch_living_room")
    private Integer tvInchLivingRoom;

    @Column(name = "equipment_living_dining_room", length = 160)
    private String equipmentLivingDiningRoom;

    @Column(name = "bool_sofa_with_chaise_living_room")
    private Boolean hasSofaWithChaiseLivingRoom;

    @Column(name = "bool_sofa_with_retractable_chaise_living_room")
    private Boolean hasSofaWithRetractableChaiseLivingRoom;

    @Column(name = "bool_books_or_collection_living_room")
    private Boolean hasBooksOrCollectionLivingRoom;

    @Column(name = "bool_used_daily_living_room")
    private Boolean hasUsedDailyLivingRoom;

    @Column(name = "bool_receives_many_people_living_room")
    private Boolean hasReceivesManyPeopleLivingRoom;

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

    public Integer getPeopleInLivingRoom() {
        return peopleInLivingRoom;
    }

    public void setPeopleInLivingRoom(Integer peopleInLivingRoom) {
        this.peopleInLivingRoom = peopleInLivingRoom;
    }

    public Boolean getHasPeopleInLivingRoom() {
        return hasPeopleInLivingRoom;
    }

    public void setHasPeopleInLivingRoom(Boolean hasPeopleInLivingRoom) {
        this.hasPeopleInLivingRoom = hasPeopleInLivingRoom;
    }

    public Integer getTvInchLivingRoom() {
        return tvInchLivingRoom;
    }

    public void setTvInchLivingRoom(Integer tvInchLivingRoom) {
        this.tvInchLivingRoom = tvInchLivingRoom;
    }

    public String getEquipmentLivingDiningRoom() {
        return equipmentLivingDiningRoom;
    }

    public void setEquipmentLivingDiningRoom(String equipmentLivingDiningRoom) {
        this.equipmentLivingDiningRoom = equipmentLivingDiningRoom;
    }

    public Boolean getHasSofaWithChaiseLivingRoom() {
        return hasSofaWithChaiseLivingRoom;
    }

    public void setHasSofaWithChaiseLivingRoom(Boolean hasSofaWithChaiseLivingRoom) {
        this.hasSofaWithChaiseLivingRoom = hasSofaWithChaiseLivingRoom;
    }

    public Boolean getHasSofaWithRetractableChaiseLivingRoom() {
        return hasSofaWithRetractableChaiseLivingRoom;
    }

    public void setHasSofaWithRetractableChaiseLivingRoom(Boolean hasSofaWithRetractableChaiseLivingRoom) {
        this.hasSofaWithRetractableChaiseLivingRoom = hasSofaWithRetractableChaiseLivingRoom;
    }

    public Boolean getHasBooksOrCollectionLivingRoom() {
        return hasBooksOrCollectionLivingRoom;
    }

    public void setHasBooksOrCollectionLivingRoom(Boolean hasBooksOrCollectionLivingRoom) {
        this.hasBooksOrCollectionLivingRoom = hasBooksOrCollectionLivingRoom;
    }

    public Boolean getHasUsedDailyLivingRoom() {
        return hasUsedDailyLivingRoom;
    }

    public void setHasUsedDailyLivingRoom(Boolean hasUsedDailyLivingRoom) {
        this.hasUsedDailyLivingRoom = hasUsedDailyLivingRoom;
    }

    public Boolean getHasReceivesManyPeopleLivingRoom() {
        return hasReceivesManyPeopleLivingRoom;
    }

    public void setHasReceivesManyPeopleLivingRoom(Boolean hasReceivesManyPeopleLivingRoom) {
        this.hasReceivesManyPeopleLivingRoom = hasReceivesManyPeopleLivingRoom;
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
