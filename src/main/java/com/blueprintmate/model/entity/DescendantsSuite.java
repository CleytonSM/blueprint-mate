package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@PrimaryKeyJoinColumn(name = "id_descendants_suite")
public class DescendantsSuite extends Suite {

    @ManyToOne
    @JoinColumn(name = "id_descendants_suite", referencedColumnName = "id_suite", nullable = false, insertable = false, updatable = false)
    private Suite suite;

    @Column(name = "bool_tv_in_descendants_suite")
    private boolean hasTv;

    @Column(name = "bool_child_study_in_descendants_suite")
    private boolean hasChildStudy;

    @Column(name = "bool_child_receives_friends_to_sleep_descendants_suite")
    private boolean hasChildReceivesFriendsToSleep;

    @Column(name = "theme_descendants_suite")
    private String theme;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Suite getSuite() {
        return suite;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }

    public boolean isHasChildStudy() {
        return hasChildStudy;
    }

    public void setHasChildStudy(boolean hasChildStudy) {
        this.hasChildStudy = hasChildStudy;
    }

    public boolean isHasChildReceivesFriendsToSleep() {
        return hasChildReceivesFriendsToSleep;
    }

    public void setHasChildReceivesFriendsToSleep(boolean hasChildReceivesFriendsToSleep) {
        this.hasChildReceivesFriendsToSleep = hasChildReceivesFriendsToSleep;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
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
