package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_entrance_hall")
@PrimaryKeyJoinColumn(name = "id_entrance_hall")
public class EntranceHall extends Project {

    @ManyToOne
    @JoinColumn(name = "id_entrance_hall", referencedColumnName = "id_project",
            nullable = false, insertable = false, updatable = false)
    private Project project;

    @Column(name = "bool_shoes_house_walking_entrance_hall")
    private Boolean hasShoesHouseWalkingEntranceHall;

    @Column(name = "bool_has_entrance_console_table_entrance_hall")
    private Boolean hasEntranceConsoleTableEntranceHall;

    @Column(name = "bool_want_entrance_console_table_entrance_hall")
    private Boolean hasWantEntranceConsoleTableEntranceHall;

    @Column(name = "bool_full_length_mirror_entrance_hall")
    private Boolean hasFullLengthMirrorEntranceHall;

    @Column(name = "bool_familiar_with_electronic_locks_entrance_hall")
    private Boolean hasFamiliarWithElectronicLocksEntranceHall;

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

    public Boolean getHasShoesHouseWalkingEntranceHall() {
        return hasShoesHouseWalkingEntranceHall;
    }

    public void setHasShoesHouseWalkingEntranceHall(Boolean hasShoesHouseWalkingEntranceHall) {
        this.hasShoesHouseWalkingEntranceHall = hasShoesHouseWalkingEntranceHall;
    }

    public Boolean getHasEntranceConsoleTableEntranceHall() {
        return hasEntranceConsoleTableEntranceHall;
    }

    public void setHasEntranceConsoleTableEntranceHall(Boolean hasEntranceConsoleTableEntranceHall) {
        this.hasEntranceConsoleTableEntranceHall = hasEntranceConsoleTableEntranceHall;
    }

    public Boolean getHasWantEntranceConsoleTableEntranceHall() {
        return hasWantEntranceConsoleTableEntranceHall;
    }

    public void setHasWantEntranceConsoleTableEntranceHall(Boolean hasWantEntranceConsoleTableEntranceHall) {
        this.hasWantEntranceConsoleTableEntranceHall = hasWantEntranceConsoleTableEntranceHall;
    }

    public Boolean getHasFullLengthMirrorEntranceHall() {
        return hasFullLengthMirrorEntranceHall;
    }

    public void setHasFullLengthMirrorEntranceHall(Boolean hasFullLengthMirrorEntranceHall) {
        this.hasFullLengthMirrorEntranceHall = hasFullLengthMirrorEntranceHall;
    }

    public Boolean getHasFamiliarWithElectronicLocksEntranceHall() {
        return hasFamiliarWithElectronicLocksEntranceHall;
    }

    public void setHasFamiliarWithElectronicLocksEntranceHall(Boolean hasFamiliarWithElectronicLocksEntranceHall) {
        this.hasFamiliarWithElectronicLocksEntranceHall = hasFamiliarWithElectronicLocksEntranceHall;
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
