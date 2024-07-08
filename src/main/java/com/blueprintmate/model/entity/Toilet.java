package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_toilet")
@PrimaryKeyJoinColumn(name = "id_toilet")
public class Toilet extends Project {

    @ManyToOne
    @JoinColumn(name = "id_toilet", referencedColumnName = "id_project",
            nullable = false, insertable = false, updatable = false)
    private Project project;

    @Column(name = "apartment_pattern_toilet", length = 180)
    private String apartmentPatternToilet;

    @Column(name = "design_toilet", length = 50)
    private String designToilet;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getApartmentPatternToilet() {
        return apartmentPatternToilet;
    }

    public void setApartmentPatternToilet(String apartmentPatternToilet) {
        this.apartmentPatternToilet = apartmentPatternToilet;
    }

    public String getDesignToilet() {
        return designToilet;
    }

    public void setDesignToilet(String designToilet) {
        this.designToilet = designToilet;
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
