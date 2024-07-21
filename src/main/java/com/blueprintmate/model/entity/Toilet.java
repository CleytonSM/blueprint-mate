package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_toilet")
public class Toilet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_toilet")
    private int id;
    @OneToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
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

    public Toilet(Form form, String apartmentPattern, String designToilet, Timestamp createdAt, Timestamp updatedAt,
                  Timestamp deletedAt) {
        this.form = form;
        this.apartmentPattern = apartmentPattern;
        this.designToilet = designToilet;
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
