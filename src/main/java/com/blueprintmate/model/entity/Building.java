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
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @Column(name = "neighborhood_relationship_building", length = 180)
    private String neighborhoodRelationshipBuilding;

    @Column(name = "determining_factor_building", length = 180)
    private String determiningFactorBuilding;

    @Column(name = "architectural_language_building", length = 180)
    private String architecturalLanguageBuilding;

    @Column(name = "balcony_integration_building", length = 180)
    private String balconyIntegrationBuilding;

    @Column(name = "building_manager_contact_building", length = 180)
    private String buildingManagerContactBuilding;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNeighborhoodRelationshipBuilding() {
        return neighborhoodRelationshipBuilding;
    }

    public void setNeighborhoodRelationshipBuilding(String neighborhoodRelationshipBuilding) {
        this.neighborhoodRelationshipBuilding = neighborhoodRelationshipBuilding;
    }

    public String getDeterminingFactorBuilding() {
        return determiningFactorBuilding;
    }

    public void setDeterminingFactorBuilding(String determiningFactorBuilding) {
        this.determiningFactorBuilding = determiningFactorBuilding;
    }

    public String getArchitecturalLanguageBuilding() {
        return architecturalLanguageBuilding;
    }

    public void setArchitecturalLanguageBuilding(String architecturalLanguageBuilding) {
        this.architecturalLanguageBuilding = architecturalLanguageBuilding;
    }

    public String getBalconyIntegrationBuilding() {
        return balconyIntegrationBuilding;
    }

    public void setBalconyIntegrationBuilding(String balconyIntegrationBuilding) {
        this.balconyIntegrationBuilding = balconyIntegrationBuilding;
    }

    public String getBuildingManagerContactBuilding() {
        return buildingManagerContactBuilding;
    }

    public void setBuildingManagerContactBuilding(String buildingManagerContactBuilding) {
        this.buildingManagerContactBuilding = buildingManagerContactBuilding;
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
