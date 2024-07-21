package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_entrance_hall")
public class EntranceHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrance_hall")
    private int id;
    @OneToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
    @Column(name = "bool_shoes_house_walking_entrance_hall")
    private Boolean hasShoesHouseWalking;
    @Column(name = "bool_has_entrance_console_table_entrance_hall", nullable = false)
    private Boolean hasEntranceConsoleTable;
    @Column(name = "bool_want_entrance_console_table_entrance_hall", nullable = false)
    private Boolean hasWantEntranceConsoleTable;
    @Column(name = "bool_full_length_mirror_entrance_hall", nullable = false)
    private Boolean hasFullLengthMirror;
    @Column(name = "bool_familiar_with_electronic_locks_entrance_hall", nullable = false)
    private Boolean hasFamiliarWithElectronicLocks;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public EntranceHall() {
    }

    public EntranceHall(Form form, Boolean hasShoesHouseWalking, Boolean hasEntranceConsoleTable,
                        Boolean hasWantEntranceConsoleTable, Boolean hasFullLengthMirror,
                        Boolean hasFamiliarWithElectronicLocks, Timestamp createdAt, Timestamp updatedAt,
                        Timestamp deletedAt) {
        this.form = form;
        this.hasShoesHouseWalking = hasShoesHouseWalking;
        this.hasEntranceConsoleTable = hasEntranceConsoleTable;
        this.hasWantEntranceConsoleTable = hasWantEntranceConsoleTable;
        this.hasFullLengthMirror = hasFullLengthMirror;
        this.hasFamiliarWithElectronicLocks = hasFamiliarWithElectronicLocks;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Boolean getHasShoesHouseWalking() {
        return hasShoesHouseWalking;
    }

    public void setHasShoesHouseWalking(Boolean hasShoesHouseWalking) {
        this.hasShoesHouseWalking = hasShoesHouseWalking;
    }

    public Boolean getHasEntranceConsoleTable() {
        return hasEntranceConsoleTable;
    }

    public void setHasEntranceConsoleTable(Boolean hasEntranceConsoleTable) {
        this.hasEntranceConsoleTable = hasEntranceConsoleTable;
    }

    public Boolean getHasWantEntranceConsoleTable() {
        return hasWantEntranceConsoleTable;
    }

    public void setHasWantEntranceConsoleTable(Boolean hasWantEntranceConsoleTable) {
        this.hasWantEntranceConsoleTable = hasWantEntranceConsoleTable;
    }

    public Boolean getHasFullLengthMirror() {
        return hasFullLengthMirror;
    }

    public void setHasFullLengthMirror(Boolean hasFullLengthMirror) {
        this.hasFullLengthMirror = hasFullLengthMirror;
    }

    public Boolean getHasFamiliarWithElectronicLocks() {
        return hasFamiliarWithElectronicLocks;
    }

    public void setHasFamiliarWithElectronicLocks(Boolean hasFamiliarWithElectronicLocks) {
        this.hasFamiliarWithElectronicLocks = hasFamiliarWithElectronicLocks;
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
