package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
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

    public GeneralInfo() {
    }

    public GeneralInfo(Form form, String reuse, String additional,
                       String unlistedFurnitureOrEquipment, String avoidanceRequests, String plantRelationship,
                       Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt) {
        this.form = form;
        this.reuse = reuse;
        this.additional = additional;
        this.unlistedFurnitureOrEquipment = unlistedFurnitureOrEquipment;
        this.avoidanceRequests = avoidanceRequests;
        this.plantRelationship = plantRelationship;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public int getId() {
        return id;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
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
