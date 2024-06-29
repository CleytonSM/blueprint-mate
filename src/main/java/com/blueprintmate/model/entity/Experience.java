package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_experience")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @Column(name = "neutral_color_exp", length = 20)
    private String neutralColor;

    @Column(name = "lively_color_exp", length = 20)
    private String livelyColor;

    @Column(name = "like_to_feel_exp", length = 180)
    private String likeToFeel;

    @Column(name = "house_meaning_exp", length = 180)
    private String houseMeaning;

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

    public String getNeutralColor() {
        return neutralColor;
    }

    public void setNeutralColor(String neutralColor) {
        this.neutralColor = neutralColor;
    }

    public String getLivelyColor() {
        return livelyColor;
    }

    public void setLivelyColor(String livelyColor) {
        this.livelyColor = livelyColor;
    }

    public String getLikeToFeel() {
        return likeToFeel;
    }

    public void setLikeToFeel(String likeToFeel) {
        this.likeToFeel = likeToFeel;
    }

    public String getHouseMeaning() {
        return houseMeaning;
    }

    public void setHouseMeaning(String houseMeaning) {
        this.houseMeaning = houseMeaning;
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
