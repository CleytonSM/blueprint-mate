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
    private Integer people;

    @Column(name = "dining_table_capacity_dining_room")
    private Integer diningTableCapacity;

    @Column(name = "daily_meals_location_dining_room", length = 60)
    private String dailyMealsLocation;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

}
