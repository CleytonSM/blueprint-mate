package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public class AppliancesInKitchenCreateDTO {
    @NotNull(message = "HasStoreSmallVisible field can't be null")
    private Boolean hasStoreSmallVisible;
    @NotNull(message = "HasStoreSmallHidden field can't be null")
    private Boolean hasStoreSmallHidden;
    private List<NewAppliancesInKitchenCreateDTO> newAppliancesListInKitchenList;
    private List<ReuseAppliancesInKitchenCreateDTO> reuseAppliancesListInKitchenList;
    private List<NecessaryAppliancesInKitchenCreateDTO> necessaryAppliancesInKitchenList;

    public AppliancesInKitchenCreateDTO() {
    }

    public AppliancesInKitchenCreateDTO(Boolean hasStoreSmallVisible, Boolean hasStoreSmallHidden,
                                        List<NewAppliancesInKitchenCreateDTO> newAppliancesListInKitchenList,
                                        List<ReuseAppliancesInKitchenCreateDTO> reuseAppliancesListInKitchenList,
                                        List<NecessaryAppliancesInKitchenCreateDTO> necessaryAppliancesInKitchenList) {
        this.hasStoreSmallVisible = hasStoreSmallVisible;
        this.hasStoreSmallHidden = hasStoreSmallHidden;
        this.newAppliancesListInKitchenList = newAppliancesListInKitchenList;
        this.reuseAppliancesListInKitchenList = reuseAppliancesListInKitchenList;
        this.necessaryAppliancesInKitchenList = necessaryAppliancesInKitchenList;
    }

    public Boolean getHasStoreSmallVisible() {
        return hasStoreSmallVisible;
    }

    public void setHasStoreSmallVisible(Boolean hasStoreSmallVisible) {
        this.hasStoreSmallVisible = hasStoreSmallVisible;
    }

    public Boolean getHasStoreSmallHidden() {
        return hasStoreSmallHidden;
    }

    public void setHasStoreSmallHidden(Boolean hasStoreSmallHidden) {
        this.hasStoreSmallHidden = hasStoreSmallHidden;
    }

    public List<NewAppliancesInKitchenCreateDTO> getNewAppliancesListInKitchenList() {
        return newAppliancesListInKitchenList;
    }

    public void setNewAppliancesListInKitchenList(List<NewAppliancesInKitchenCreateDTO> newAppliancesListInKitchenList) {
        this.newAppliancesListInKitchenList = newAppliancesListInKitchenList;
    }

    public List<ReuseAppliancesInKitchenCreateDTO> getReuseAppliancesListInKitchenList() {
        return reuseAppliancesListInKitchenList;
    }

    public void setReuseAppliancesListInKitchenList(List<ReuseAppliancesInKitchenCreateDTO> reuseAppliancesListInKitchenList) {
        this.reuseAppliancesListInKitchenList = reuseAppliancesListInKitchenList;
    }

    public List<NecessaryAppliancesInKitchenCreateDTO> getNecessaryAppliancesInKitchenList() {
        return necessaryAppliancesInKitchenList;
    }

    public void setNecessaryAppliancesInKitchenList(List<NecessaryAppliancesInKitchenCreateDTO> necessaryAppliancesInKitchenList) {
        this.necessaryAppliancesInKitchenList = necessaryAppliancesInKitchenList;
    }
}
