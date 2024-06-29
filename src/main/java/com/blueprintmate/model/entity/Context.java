package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_context")
public class Context {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_context")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @Column(name = "project_life_stage_significance_context", length = 200)
    private String projectLifeStageSignificance;

    @Column(name = "ambient_style_description_style_and_moods", length = 180)
    private String ambientStyleDescriptionStyleAndMoods;

    @Column(name = "investment_expectation_context", length = 200)
    private String investmentExpectation;

    @Column(name = "project_duration_expectation_context", length = 200)
    private String projectDurationExpectation;

    @Column(name = "location_during_renovation_context", length = 200)
    private String locationDuringRenovation;

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

    public String getProjectLifeStageSignificance() {
        return projectLifeStageSignificance;
    }

    public void setProjectLifeStageSignificance(String projectLifeStageSignificance) {
        this.projectLifeStageSignificance = projectLifeStageSignificance;
    }

    public String getAmbientStyleDescriptionStyleAndMoods() {
        return ambientStyleDescriptionStyleAndMoods;
    }

    public void setAmbientStyleDescriptionStyleAndMoods(String ambientStyleDescriptionStyleAndMoods) {
        this.ambientStyleDescriptionStyleAndMoods = ambientStyleDescriptionStyleAndMoods;
    }

    public String getInvestmentExpectation() {
        return investmentExpectation;
    }

    public void setInvestmentExpectation(String investmentExpectation) {
        this.investmentExpectation = investmentExpectation;
    }

    public String getProjectDurationExpectation() {
        return projectDurationExpectation;
    }

    public void setProjectDurationExpectation(String projectDurationExpectation) {
        this.projectDurationExpectation = projectDurationExpectation;
    }

    public String getLocationDuringRenovation() {
        return locationDuringRenovation;
    }

    public void setLocationDuringRenovation(String locationDuringRenovation) {
        this.locationDuringRenovation = locationDuringRenovation;
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
