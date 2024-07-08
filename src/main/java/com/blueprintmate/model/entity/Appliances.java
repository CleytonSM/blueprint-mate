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
    private Boolean hasStoreSmallAppliancesVisible;

    @Column(name = "bool_store_small_appliances_hidden")
    private Boolean hasStoreSmallAppliancesHidden;
}
