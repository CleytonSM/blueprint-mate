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
    private Boolean hasBuiltInSinkLaundry;

    @Column(name = "bool_porcelain_sink_laundry")
    private Boolean hasPorcelainSinkLaundry;

    @Column(name = "bool_pet_food_and_bowls_stored_here_laundry")
    private Boolean hasPetFoodAndBowlsStoredHereLaundry;

    @Column(name = "bool_recycles_trash_laundry")
    private Boolean hasRecyclesTrashLaundry;

    @Column(name = "current_drying_rack_count_laundry")
    private Integer currentDryingRackCountLaundry;

    @Column(name = "drying_rack_sizes_laundry", precision = 5, scale = 2)
    private BigDecimal dryingRackSizesLaundry;

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

    public Boolean getHasBuiltInSinkLaundry() {
        return hasBuiltInSinkLaundry;
    }

    public void setHasBuiltInSinkLaundry(Boolean hasBuiltInSinkLaundry) {
        this.hasBuiltInSinkLaundry = hasBuiltInSinkLaundry;
    }

    public Boolean getHasPorcelainSinkLaundry() {
        return hasPorcelainSinkLaundry;
    }

    public void setHasPorcelainSinkLaundry(Boolean hasPorcelainSinkLaundry) {
        this.hasPorcelainSinkLaundry = hasPorcelainSinkLaundry;
    }

    public Boolean getHasPetFoodAndBowlsStoredHereLaundry() {
        return hasPetFoodAndBowlsStoredHereLaundry;
    }

    public void setHasPetFoodAndBowlsStoredHereLaundry(Boolean hasPetFoodAndBowlsStoredHereLaundry) {
        this.hasPetFoodAndBowlsStoredHereLaundry = hasPetFoodAndBowlsStoredHereLaundry;
    }

    public Boolean getHasRecyclesTrashLaundry() {
        return hasRecyclesTrashLaundry;
    }

    public void setHasRecyclesTrashLaundry(Boolean hasRecyclesTrashLaundry) {
        this.hasRecyclesTrashLaundry = hasRecyclesTrashLaundry;
    }

    public Integer getCurrentDryingRackCountLaundry() {
        return currentDryingRackCountLaundry;
    }

    public void setCurrentDryingRackCountLaundry(Integer currentDryingRackCountLaundry) {
        this.currentDryingRackCountLaundry = currentDryingRackCountLaundry;
    }

    public BigDecimal getDryingRackSizesLaundry() {
        return dryingRackSizesLaundry;
    }

    public void setDryingRackSizesLaundry(BigDecimal dryingRackSizesLaundry) {
        this.dryingRackSizesLaundry = dryingRackSizesLaundry;
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
