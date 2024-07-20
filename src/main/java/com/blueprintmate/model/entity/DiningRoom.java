package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_dining_room")
public class DiningRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dining_room")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
    @Column(name = "dining_table_capacity_dining_room", nullable = false)
    private Integer diningTableCapacity;
    @Column(name = "daily_meals_location_dining_room", length = 60, nullable = false)
    private String dailyMealsLocation;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public DiningRoom() {
    }

    public DiningRoom(Form form, Integer diningTableCapacity, String dailyMealsLocation,
                      Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt) {
        this.form = form;
        this.diningTableCapacity = diningTableCapacity;
        this.dailyMealsLocation = dailyMealsLocation;
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

    public Integer getDiningTableCapacity() {
        return diningTableCapacity;
    }

    public void setDiningTableCapacity(Integer diningTableCapacity) {
        this.diningTableCapacity = diningTableCapacity;
    }

    public String getDailyMealsLocation() {
        return dailyMealsLocation;
    }

    public void setDailyMealsLocation(String dailyMealsLocation) {
        this.dailyMealsLocation = dailyMealsLocation;
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
