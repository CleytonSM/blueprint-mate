package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_necessary_appliances_in_laundry")
public class NecessaryAppliancesInLaundry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_necessary_appliances_in_laundry")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_laundry")
    @JsonIgnore
    private Laundry laundry;
    @Column(name = "nm_necessary_appliances_in_laundry", length = 45)
    private String name;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public NecessaryAppliancesInLaundry() {
    }

    public NecessaryAppliancesInLaundry(Laundry laundry, String name, Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt) {
        this.laundry = laundry;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public NecessaryAppliancesInLaundry(Laundry laundry, String name, Timestamp createdAt, Timestamp updatedAt) {
        this.laundry = laundry;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Laundry getLaundry() {
        return laundry;
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

    public void setLaundry(Laundry laundry) {
        this.laundry = laundry;
    }
}
