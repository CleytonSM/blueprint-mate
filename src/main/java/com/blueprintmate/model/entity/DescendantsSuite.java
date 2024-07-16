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
    private Boolean hasTv;

    @Column(name = "bool_child_study_in_descendants_suite")
    private Boolean hasChildStudy;

    @Column(name = "bool_child_receives_friends_to_sleep_descendants_suite")
    private Boolean hasChildReceivesFriendsToSleep;

    @Column(name = "theme_descendants_suite")
    private String theme;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public DescendantsSuite() {
    }

    public DescendantsSuite(Form form, String bedType, Boolean hasTv, Boolean hasChildStudy,
                            Boolean hasChildReceivesFriendsToSleep, String theme, Timestamp createdAt,
                            Timestamp updatedAt, Timestamp deletedAt) {
        super(form, bedType);
        this.hasTv = hasTv;
        this.hasChildStudy = hasChildStudy;
        this.hasChildReceivesFriendsToSleep = hasChildReceivesFriendsToSleep;
        this.theme = theme;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Suite getSuite() {
        return suite;
    }

    public Boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(Boolean hasTv) {
        this.hasTv = hasTv;
    }

    public Boolean isHasChildStudy() {
        return hasChildStudy;
    }

    public void setHasChildStudy(Boolean hasChildStudy) {
        this.hasChildStudy = hasChildStudy;
    }

    public Boolean isHasChildReceivesFriendsToSleep() {
        return hasChildReceivesFriendsToSleep;
    }

    public void setHasChildReceivesFriendsToSleep(Boolean hasChildReceivesFriendsToSleep) {
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
