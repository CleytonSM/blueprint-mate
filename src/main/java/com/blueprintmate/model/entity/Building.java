package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_building")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_building")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    private Form form;

    @Column(name = "neighborhood_relationship_building", length = 180)
    private String neighborhoodRelationship;

    @Column(name = "determining_factor_building", length = 180)
    private String determiningFactor;

    @Column(name = "architectural_language_building", length = 180)
    private String architecturalLanguage;

    @Column(name = "balcony_integration_building", length = 180)
    private String balconyIntegration;

    @Column(name = "building_manager_contact_building", length = 180)
    private String buildingManagerContact;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Building() {
    }

    public Building(Form form, String neighborhoodRelationship, String determiningFactor, String architecturalLanguage,
                    String balconyIntegration, String buildingManagerContact, Timestamp createdAt, Timestamp updatedAt,
                    Timestamp deletedAt) {
        this.form = form;
        this.neighborhoodRelationship = neighborhoodRelationship;
        this.determiningFactor = determiningFactor;
        this.architecturalLanguage = architecturalLanguage;
        this.balconyIntegration = balconyIntegration;
        this.buildingManagerContact = buildingManagerContact;
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

    public String getNeighborhoodRelationship() {
        return neighborhoodRelationship;
    }

    public void setNeighborhoodRelationship(String neighborhoodRelationship) {
        this.neighborhoodRelationship = neighborhoodRelationship;
    }

    public String getDeterminingFactor() {
        return determiningFactor;
    }

    public void setDeterminingFactor(String determiningFactor) {
        this.determiningFactor = determiningFactor;
    }

    public String getArchitecturalLanguage() {
        return architecturalLanguage;
    }

    public void setArchitecturalLanguage(String architecturalLanguage) {
        this.architecturalLanguage = architecturalLanguage;
    }

    public String getBalconyIntegration() {
        return balconyIntegration;
    }

    public void setBalconyIntegration(String balconyIntegration) {
        this.balconyIntegration = balconyIntegration;
    }

    public String getBuildingManagerContact() {
        return buildingManagerContact;
    }

    public void setBuildingManagerContact(String buildingManagerContact) {
        this.buildingManagerContact = buildingManagerContact;
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
