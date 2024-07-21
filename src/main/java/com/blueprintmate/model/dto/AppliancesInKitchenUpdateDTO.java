package com.blueprintmate.model.dto;

import java.util.List;

public class AppliancesInKitchenUpdateDTO {
    private Boolean hasStoreSmallVisible;
    private Boolean hasStoreSmallHidden;
    private List<NewAppliancesInKitchenUpdateDTO> newAppliancesListInKitchenList;
    private List<ReuseAppliancesInKitchenUpdateDTO> reuseAppliancesListInKitchenList;
    private List<NecessaryAppliancesInKitchenUpdateDTO> necessaryAppliancesInKitchenList;
}
