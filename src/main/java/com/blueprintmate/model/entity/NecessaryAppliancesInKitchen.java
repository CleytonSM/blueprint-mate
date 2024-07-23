package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_necessary_appliances_in_kitchen")
@PrimaryKeyJoinColumn(name = "id_necessary_appliances_in_kitchen")
public class NecessaryAppliancesInKitchen extends Appliances {
    @ManyToOne
    @JoinColumn(name = "id_necessary_appliances_in_kitchen", referencedColumnName = "id_appliances",
            nullable = false, insertable = false, updatable = false)
    private Appliances appliances;
    @Column(name = "nm_necessary_appliances_in_kitchen", length = 45)
    private String name;
    @Column(name = "bool_used_daily_necessary_appliances_in_kitchen")
    private Boolean hasUsedDaily;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public NecessaryAppliancesInKitchen() {
    }

    public NecessaryAppliancesInKitchen(Kitchen kitchen, Boolean hasStoreSmallVisible, Boolean hasStoreSmallHidden,
                                        String name, Boolean hasUsedDaily, Timestamp createdAt, Timestamp updatedAt,
                                        Timestamp deletedAt) {
        super(kitchen, hasStoreSmallVisible, hasStoreSmallHidden);
        this.name = name;
        this.hasUsedDaily = hasUsedDaily;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public NecessaryAppliancesInKitchen(Kitchen kitchen, Boolean hasStoreSmallVisible, Boolean hasStoreSmallHidden,
                                        String name, Boolean hasUsedDaily, Timestamp createdAt, Timestamp updatedAt) {
        super(kitchen, hasStoreSmallVisible, hasStoreSmallHidden);
        this.name = name;
        this.hasUsedDaily = hasUsedDaily;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Appliances getAppliances() {
        return appliances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasUsedDaily() {
        return hasUsedDaily;
    }

    public void setHasUsedDaily(Boolean hasUsedDaily) {
        this.hasUsedDaily = hasUsedDaily;
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
