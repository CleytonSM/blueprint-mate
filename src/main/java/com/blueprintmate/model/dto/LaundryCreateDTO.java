package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

public class LaundryCreateDTO {
    @NotNull(message = "HasBuiltInSink field can't be null")
    private Boolean hasBuiltInSink;
    @NotNull(message = "HasPorcelainSink field can't be null")
    private Boolean hasPorcelainSink;
    private Boolean hasPetFoodAndBowlsStoredHere;
    private Boolean hasRecyclesTrash;
    private List<NecessaryAppliancesCreateOnLaundryDTO> necessaryAppliancesOnLaundryList;
    @NotNull(message = "CurrentDryingRackCount field can't be null")
    private Integer currentDryingRackCount;
    @NotNull(message = "DryingRackSizes field can't be null")
    private BigDecimal dryingRackSizes;

    public LaundryCreateDTO() {
    }

    public LaundryCreateDTO(Boolean hasBuiltInSink, Boolean hasPorcelainSink, Boolean hasPetFoodAndBowlsStoredHere,
                            Boolean hasRecyclesTrash, List<NecessaryAppliancesCreateOnLaundryDTO> necessaryAppliancesOnLaundryList,
                            Integer currentDryingRackCount, BigDecimal dryingRackSizes) {
        this.hasBuiltInSink = hasBuiltInSink;
        this.hasPorcelainSink = hasPorcelainSink;
        this.hasPetFoodAndBowlsStoredHere = hasPetFoodAndBowlsStoredHere;
        this.hasRecyclesTrash = hasRecyclesTrash;
        this.necessaryAppliancesOnLaundryList = necessaryAppliancesOnLaundryList;
        this.currentDryingRackCount = currentDryingRackCount;
        this.dryingRackSizes = dryingRackSizes;
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

    public List<NecessaryAppliancesCreateOnLaundryDTO> getNecessaryAppliancesOnLaundryList() {
        return necessaryAppliancesOnLaundryList;
    }

    public void setNecessaryAppliancesOnLaundryList(List<NecessaryAppliancesCreateOnLaundryDTO> necessaryAppliancesOnLaundryList) {
        this.necessaryAppliancesOnLaundryList = necessaryAppliancesOnLaundryList;
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
}
