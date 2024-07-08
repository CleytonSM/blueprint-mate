package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_reuse_appliances")
@PrimaryKeyJoinColumn(name = "id_reuse_appliances")
public class ReuseAppliances {

    @ManyToOne
    @JoinColumn(name = "id_reuse_appliances", referencedColumnName = "id_appliances",
            nullable = false, insertable = false, updatable = false)
    private Appliances appliances;

    @Column(name = "nm_reuse_appliances", length = 30)
    private String name;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Appliances getAppliances() {
        return appliances;
    }

    public void setAppliances(Appliances appliances) {
        this.appliances = appliances;
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
}
