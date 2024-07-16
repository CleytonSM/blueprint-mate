package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotNull;

public class AppliancesConfigCreateDTO {
    @NotNull(message = "HasStoreSmallVisible field can't be null")
    private Boolean hasStoreSmallVisible;
    @NotNull(message = "HasStoreSmallHidden field can't be null")
    private Boolean hasStoreSmallHidden;

    public AppliancesConfigCreateDTO() {
    }

    public AppliancesConfigCreateDTO(Boolean hasStoreSmallVisible, Boolean hasStoreSmallHidden) {
        this.hasStoreSmallVisible = hasStoreSmallVisible;
        this.hasStoreSmallHidden = hasStoreSmallHidden;
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
}
