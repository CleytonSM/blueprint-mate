package com.blueprintmate.model.dto;

import java.util.List;

public class AppliancesInKitchenUpdateDTO {
    private Boolean hasStoreSmallVisible;
    private Boolean hasStoreSmallHidden;
    private List<NewAppliancesInKitchenUpdateDTO> newAppliancesListInKitchenList;
    private List<ReuseAppliancesInKitchenUpdateDTO> reuseAppliancesListInKitchenList;
    private List<NecessaryAppliancesInKitchenUpdateDTO> necessaryAppliancesInKitchenList;

    public AppliancesInKitchenUpdateDTO() {
    }

    public AppliancesInKitchenUpdateDTO(Boolean hasStoreSmallVisible, Boolean hasStoreSmallHidden,
                                        List<NewAppliancesInKitchenUpdateDTO> newAppliancesListInKitchenList,
                                        List<ReuseAppliancesInKitchenUpdateDTO> reuseAppliancesListInKitchenList,
                                        List<NecessaryAppliancesInKitchenUpdateDTO> necessaryAppliancesInKitchenList) {
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

    public List<NewAppliancesInKitchenUpdateDTO> getNewAppliancesListInKitchenList() {
        return newAppliancesListInKitchenList;
    }

    public void setNewAppliancesListInKitchenList(List<NewAppliancesInKitchenUpdateDTO> newAppliancesListInKitchenList) {
        this.newAppliancesListInKitchenList = newAppliancesListInKitchenList;
    }

    public List<ReuseAppliancesInKitchenUpdateDTO> getReuseAppliancesListInKitchenList() {
        return reuseAppliancesListInKitchenList;
    }

    public void setReuseAppliancesListInKitchenList(List<ReuseAppliancesInKitchenUpdateDTO> reuseAppliancesListInKitchenList) {
        this.reuseAppliancesListInKitchenList = reuseAppliancesListInKitchenList;
    }

    public List<NecessaryAppliancesInKitchenUpdateDTO> getNecessaryAppliancesInKitchenList() {
        return necessaryAppliancesInKitchenList;
    }

    public void setNecessaryAppliancesInKitchenList(List<NecessaryAppliancesInKitchenUpdateDTO> necessaryAppliancesInKitchenList) {
        this.necessaryAppliancesInKitchenList = necessaryAppliancesInKitchenList;
    }
}
