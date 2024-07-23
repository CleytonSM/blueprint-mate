package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_reuse_appliances_in_kitchen")
public class ReuseAppliancesInKitchen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reuse_appliances_in_kitchen")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_kitchen")
    @JsonIgnore
    private Kitchen kitchen;
    @Column(name = "nm_reuse_appliances_in_kitchen", length = 30)
    private String name;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public ReuseAppliancesInKitchen() {
    }

    public ReuseAppliancesInKitchen(Kitchen kitchen, String name, Timestamp createdAt,
                                    Timestamp updatedAt, Timestamp deletedAt) {
        this.kitchen = kitchen;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public ReuseAppliancesInKitchen(Kitchen kitchen, String name, Timestamp createdAt, Timestamp updatedAt) {
        this.kitchen = kitchen;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}
