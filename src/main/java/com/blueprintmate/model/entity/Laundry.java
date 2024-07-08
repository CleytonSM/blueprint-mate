package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_laundry")
@PrimaryKeyJoinColumn(name = "id_laundry")
public class Laundry extends Project {

    @ManyToOne
    @JoinColumn(name = "id_laundry", referencedColumnName = "id_project",
            nullable = false, insertable = false, updatable = false)
    private Project project;

    @Column(name = "bool_built_in_sink_laundry")
    private Boolean hasBuiltInSink;

    @Column(name = "bool_porcelain_sink_laundry")
    private Boolean hasPorcelainSink;

    @Column(name = "bool_pet_food_and_bowls_stored_here_laundry")
    private Boolean hasPetFoodAndBowlsStoredHere;

    @Column(name = "bool_recycles_trash_laundry")
    private Boolean hasRecyclesTrash;

    @Column(name = "current_drying_rack_count_laundry")
    private Integer currentDryingRackCount;

    @Column(name = "drying_rack_sizes_laundry", precision = 5, scale = 2)
    private BigDecimal dryingRackSizes;

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

    public Boolean getHasBuiltInSink() {
        return hasBuiltInSink;
    }

    public void setHasBuiltInSink(Boolean hasBuiltInSink) {
        this.hasBuiltInSink = hasBuiltInSink;
    }

    public Boolean getHasPorcelainSink() {
        return hasPorcelainSink;
    }

    public void setHasPorcelainSink(Boolean hasPorcelainSink) {
        this.hasPorcelainSink = hasPorcelainSink;
    }

    public Boolean getHasPetFoodAndBowlsStoredHere() {
        return hasPetFoodAndBowlsStoredHere;
    }

    public void setHasPetFoodAndBowlsStoredHere(Boolean hasPetFoodAndBowlsStoredHere) {
        this.hasPetFoodAndBowlsStoredHere = hasPetFoodAndBowlsStoredHere;
    }

    public Boolean getHasRecyclesTrash() {
        return hasRecyclesTrash;
    }

    public void setHasRecyclesTrash(Boolean hasRecyclesTrash) {
        this.hasRecyclesTrash = hasRecyclesTrash;
    }

    public Integer getCurrentDryingRackCount() {
        return currentDryingRackCount;
    }

    public void setCurrentDryingRackCount(Integer currentDryingRackCount) {
        this.currentDryingRackCount = currentDryingRackCount;
    }

    public BigDecimal getDryingRackSizes() {
        return dryingRackSizes;
    }

    public void setDryingRackSizes(BigDecimal dryingRackSizes) {
        this.dryingRackSizes = dryingRackSizes;
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
