package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_guests_suite")
public class GuestsSuite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_guests_suite")
    private int id;
    @OneToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
    @Column(name = "bed_type_suite", length = 30)
    private String bedType;
    @Column(name = "closet_use_guests_suite")
    private String closetUse;
    @Column(name = "frequency_of_guests_guests_suite")
    private String frequencyOfGuests;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public GuestsSuite() {
    }

    public GuestsSuite(Form form, String bedType, String closetUse, String frequencyOfGuests, Timestamp createdAt,
                       Timestamp updatedAt, Timestamp deletedAt) {
        this.form = form;
        this.bedType = bedType;
        this.closetUse = closetUse;
        this.frequencyOfGuests = frequencyOfGuests;
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

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getClosetUse() {
        return closetUse;
    }

    public void setClosetUse(String closetUse) {
        this.closetUse = closetUse;
    }

    public String getFrequencyOfGuests() {
        return frequencyOfGuests;
    }

    public void setFrequencyOfGuests(String frequencyOfGuests) {
        this.frequencyOfGuests = frequencyOfGuests;
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
