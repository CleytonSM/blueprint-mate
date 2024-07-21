package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_living_room")
public class LivingRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_living_room")
    private int id;
    @OneToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
    @Column(name = "people_in_living_room", nullable = false)
    private Integer people;
    @Column(name = "bool_tv_is_important_living_room", nullable = false)
    private Boolean hasPeople;
    @Column(name = "tv_inch_living_room", nullable = false)
    private Integer tvInch;
    @Column(name = "equipment_living_room", length = 160, nullable = false)
    private String equipmentLiving;
    @Column(name = "bool_sofa_with_chaise_living_room", nullable = false)
    private Boolean hasSofaWithChaise;
    @Column(name = "bool_sofa_with_retractable_chaise_living_room", nullable = false)
    private Boolean hasSofaWithRetractableChaise;
    @Column(name = "bool_books_or_collection_living_room", nullable = false)
    private Boolean hasBooksOrCollection;
    @Column(name = "bool_used_daily_living_room", nullable = false)
    private Boolean hasUsedDaily;
    @Column(name = "receives_many_people_living_room", length = 100, nullable = false)
    private String receivesManyPeople;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public LivingRoom() {
    }

    public LivingRoom(Form form, Integer people, Boolean hasPeople, Integer tvInch,
                      String equipmentLiving, Boolean hasSofaWithChaise, Boolean hasSofaWithRetractableChaise,
                      Boolean hasBooksOrCollection, Boolean hasUsedDaily, String receivesManyPeople,
                      Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt) {
        this.form = form;
        this.people = people;
        this.hasPeople = hasPeople;
        this.tvInch = tvInch;
        this.equipmentLiving = equipmentLiving;
        this.hasSofaWithChaise = hasSofaWithChaise;
        this.hasSofaWithRetractableChaise = hasSofaWithRetractableChaise;
        this.hasBooksOrCollection = hasBooksOrCollection;
        this.hasUsedDaily = hasUsedDaily;
        this.receivesManyPeople = receivesManyPeople;
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

    public String getReceivesManyPeople() {
        return receivesManyPeople;
    }

    public void setReceivesManyPeople(String receivesManyPeople) {
        this.receivesManyPeople = receivesManyPeople;
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
