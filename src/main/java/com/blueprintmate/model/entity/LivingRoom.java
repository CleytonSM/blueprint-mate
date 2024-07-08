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
    private Integer people;

    @Column(name = "bool_tv_is_important_living_room")
    private Boolean hasPeople;

    @Column(name = "tv_inch_living_room")
    private Integer tvInch;

    @Column(name = "equipment_living_dining_room", length = 160)
    private String equipmentLiving;

    @Column(name = "bool_sofa_with_chaise_living_room")
    private Boolean hasSofaWithChaise;

    @Column(name = "bool_sofa_with_retractable_chaise_living_room")
    private Boolean hasSofaWithRetractableChaise;

    @Column(name = "bool_books_or_collection_living_room")
    private Boolean hasBooksOrCollection;

    @Column(name = "bool_used_daily_living_room")
    private Boolean hasUsedDaily;

    @Column(name = "bool_receives_many_people_living_room")
    private Boolean hasReceivesManyPeople;

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

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Boolean getHasPeople() {
        return hasPeople;
    }

    public void setHasPeople(Boolean hasPeople) {
        this.hasPeople = hasPeople;
    }

    public Integer getTvInch() {
        return tvInch;
    }

    public void setTvInch(Integer tvInch) {
        this.tvInch = tvInch;
    }

    public String getEquipmentLiving() {
        return equipmentLiving;
    }

    public void setEquipmentLiving(String equipmentLiving) {
        this.equipmentLiving = equipmentLiving;
    }

    public Boolean getHasSofaWithChaise() {
        return hasSofaWithChaise;
    }

    public void setHasSofaWithChaise(Boolean hasSofaWithChaise) {
        this.hasSofaWithChaise = hasSofaWithChaise;
    }

    public Boolean getHasSofaWithRetractableChaise() {
        return hasSofaWithRetractableChaise;
    }

    public void setHasSofaWithRetractableChaise(Boolean hasSofaWithRetractableChaise) {
        this.hasSofaWithRetractableChaise = hasSofaWithRetractableChaise;
    }

    public Boolean getHasBooksOrCollection() {
        return hasBooksOrCollection;
    }

    public void setHasBooksOrCollection(Boolean hasBooksOrCollection) {
        this.hasBooksOrCollection = hasBooksOrCollection;
    }

    public Boolean getHasUsedDaily() {
        return hasUsedDaily;
    }

    public void setHasUsedDaily(Boolean hasUsedDaily) {
        this.hasUsedDaily = hasUsedDaily;
    }

    public Boolean getHasReceivesManyPeople() {
        return hasReceivesManyPeople;
    }

    public void setHasReceivesManyPeople(Boolean hasReceivesManyPeople) {
        this.hasReceivesManyPeople = hasReceivesManyPeople;
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
