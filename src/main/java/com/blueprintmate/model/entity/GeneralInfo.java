package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_general_info")
public class GeneralInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_general_info")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @Column(name = "reuse_general_info", length = 200)
    private String reuse;

    @Column(name = "additional_general_info", length = 200)
    private String additional;

    @Column(name = "unlisted_furniture_or_equipment_general_info", length = 200)
    private String unlistedFurnitureOrEquipment;

    @Column(name = "avoidance_requests_general_info", length = 200)
    private String avoidanceRequests;

    @Column(name = "plant_relationship_general_info", length = 50)
    private String plantRelationship;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getReuse() {
        return reuse;
    }

    public void setReuse(String reuse) {
        this.reuse = reuse;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getUnlistedFurnitureOrEquipment() {
        return unlistedFurnitureOrEquipment;
    }

    public void setUnlistedFurnitureOrEquipment(String unlistedFurnitureOrEquipment) {
        this.unlistedFurnitureOrEquipment = unlistedFurnitureOrEquipment;
    }

    public String getAvoidanceRequests() {
        return avoidanceRequests;
    }

    public void setAvoidanceRequests(String avoidanceRequests) {
        this.avoidanceRequests = avoidanceRequests;
    }

    public String getPlantRelationship() {
        return plantRelationship;
    }

    public void setPlantRelationship(String plantRelationship) {
        this.plantRelationship = plantRelationship;
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
