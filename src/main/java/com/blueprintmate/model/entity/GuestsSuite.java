package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@PrimaryKeyJoinColumn(name = "id_guests_suite")
public class GuestsSuite extends Suite {

    @ManyToOne
    @JoinColumn(name = "id_guests_suite", referencedColumnName = "id_suite", nullable = false, insertable = false, updatable = false)
    private Suite suite;

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

    public Suite getSuite() {
        return suite;
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
