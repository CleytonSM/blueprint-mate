package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_new_appliances_in_kitchen")
public class NewAppliancesInKitchen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_new_appliances_in_kitchen")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_kitchen")
    @JsonIgnore
    private Kitchen kitchen;
    @Column(name = "link_new_appliances_in_kitchen", length = Integer.MAX_VALUE)
    private String link;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public NewAppliancesInKitchen() {
    }

    public NewAppliancesInKitchen(Kitchen kitchen, String link, Timestamp createdAt,
                                  Timestamp updatedAt, Timestamp deletedAt) {
        this.kitchen = kitchen;
        this.link = link;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public NewAppliancesInKitchen(Kitchen kitchen, String link, Timestamp createdAt, Timestamp updatedAt) {
        this.kitchen = kitchen;
        this.link = link;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
