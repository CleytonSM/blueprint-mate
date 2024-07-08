package com.blueprintmate.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_appliances")
@Inheritance(strategy = InheritanceType.JOINED)
public class Appliances {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_appliances")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_kitchen")
    private Kitchen kitchen;

    @ManyToOne
    @JoinColumn(name = "id_laundry")
    private Laundry laundry;

    @Column(name = "bool_store_small_appliances_visible")
    private Boolean hasStoreSmallVisible;

    @Column(name = "bool_store_small_appliances_hidden")
    private Boolean hasStoreSmallHidden;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Laundry getLaundry() {
        return laundry;
    }

    public void setLaundry(Laundry laundry) {
        this.laundry = laundry;
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
