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

    @Column(name = "apartment_pattern_toilet", length = 180, nullable = false)
    private String apartmentPattern;

    @Column(name = "design_toilet", length = 50, nullable = false)
    private String designToilet;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Toilet() {
    }

    public Toilet(Form form, String apartmentPattern, String designToilet,
                  Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt) {
        super(form);
        this.apartmentPattern = apartmentPattern;
        this.designToilet = designToilet;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Project getProject() {
        return project;
    }

    public String getApartmentPattern() {
        return apartmentPattern;
    }

    public void setApartmentPattern(String apartmentPattern) {
        this.apartmentPattern = apartmentPattern;
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
