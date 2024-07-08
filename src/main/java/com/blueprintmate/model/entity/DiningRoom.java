package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_dining_room")
@PrimaryKeyJoinColumn(name = "id_dining_room")
public class DiningRoom extends Project {

    @ManyToOne
    @JoinColumn(name = "id_dining_room", referencedColumnName = "id_project",
            nullable = false, insertable = false, updatable = false)
    private Project project;

    @Column(name = "people_dining_room")
    private Integer peopleDiningRoom;

    @Column(name = "dining_table_capacity_dining_room")
    private Integer diningTableCapacityDiningRoom;

    @Column(name = "daily_meals_location_dining_room", length = 60)
    private String dailyMealsLocationDiningRoom;

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

    public Integer getPeopleDiningRoom() {
        return peopleDiningRoom;
    }

    public void setPeopleDiningRoom(Integer peopleDiningRoom) {
        this.peopleDiningRoom = peopleDiningRoom;
    }

    public Integer getDiningTableCapacityDiningRoom() {
        return diningTableCapacityDiningRoom;
    }

    public void setDiningTableCapacityDiningRoom(Integer diningTableCapacityDiningRoom) {
        this.diningTableCapacityDiningRoom = diningTableCapacityDiningRoom;
    }

    public String getDailyMealsLocationDiningRoom() {
        return dailyMealsLocationDiningRoom;
    }

    public void setDailyMealsLocationDiningRoom(String dailyMealsLocationDiningRoom) {
        this.dailyMealsLocationDiningRoom = dailyMealsLocationDiningRoom;
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
