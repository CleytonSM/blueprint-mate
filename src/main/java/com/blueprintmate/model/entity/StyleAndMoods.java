package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_style_and_moods")
public class StyleAndMoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_style_and_moods")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
    @Column(name = "ambient_style_style_and_moods", length = 20)
    private String ambientStyle;
    @Column(name = "ambient_style_description_style_and_moods", length = 180)
    private String ambientStyleDescription;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public StyleAndMoods() {
    }

    public StyleAndMoods(Form form, String ambientStyle, String ambientStyleDescription,
                         Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt) {
        this.form = form;
        this.ambientStyle = ambientStyle;
        this.ambientStyleDescription = ambientStyleDescription;
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

    public String getAmbientStyle() {
        return ambientStyle;
    }

    public void setAmbientStyle(String ambientStyle) {
        this.ambientStyle = ambientStyle;
    }

    public String getAmbientStyleDescription() {
        return ambientStyleDescription;
    }

    public void setAmbientStyleDescription(String ambientStyleDescription) {
        this.ambientStyleDescription = ambientStyleDescription;
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
