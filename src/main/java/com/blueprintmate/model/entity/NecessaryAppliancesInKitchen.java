package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_necessary_appliances_in_kitchen")
public class NecessaryAppliancesInKitchen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_necessary_appliances_in_kitchen")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_kitchen")
    @JsonIgnore
    private Kitchen kitchen;
    @Column(name = "nm_necessary_appliances_in_kitchen", length = 45)
    private String name;
    @Column(name = "bool_used_daily_necessary_appliances_in_kitchen")
    private Boolean hasUsedDaily;
    @Column(name = "bool_store_small_visible_appliances")
    private Boolean hasStoreSmallVisible;
    @Column(name = "bool_store_small_hidden_appliances")
    private Boolean hasStoreSmallHidden;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public NecessaryAppliancesInKitchen() {
    }

    public NecessaryAppliancesInKitchen(Kitchen kitchen, String name, Boolean hasUsedDaily, Boolean hasStoreSmallVisible,
                                        Boolean hasStoreSmallHidden, Timestamp createdAt, Timestamp updatedAt,
                                        Timestamp deletedAt) {
        this.kitchen = kitchen;
        this.name = name;
        this.hasUsedDaily = hasUsedDaily;
        this.hasStoreSmallVisible = hasStoreSmallVisible;
        this.hasStoreSmallHidden = hasStoreSmallHidden;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public NecessaryAppliancesInKitchen(Kitchen kitchen, Boolean hasStoreSmallVisible, Boolean hasStoreSmallHidden,
                                        String name, Boolean hasUsedDaily, Timestamp createdAt, Timestamp updatedAt) {
        this.kitchen = kitchen;
        this.hasStoreSmallVisible = hasStoreSmallVisible;
        this.hasStoreSmallHidden = hasStoreSmallHidden;
        this.name = name;
        this.hasUsedDaily = hasUsedDaily;
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

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Boolean getHasStoreSmallVisible() {
        return hasStoreSmallVisible;
    }

    public void setHasStoreSmallVisible(Boolean hasStoreSmallVisible) {
        this.hasStoreSmallVisible = hasStoreSmallVisible;
    }

    public Boolean getHasStoreSmallHidden() {
        return hasStoreSmallHidden;
    }

    public void setHasStoreSmallHidden(Boolean hasStoreSmallHidden) {
        this.hasStoreSmallHidden = hasStoreSmallHidden;
    }
}
