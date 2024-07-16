package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.BedType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DescendantsSuiteCreateDTO {
    @NotBlank(message = "BedType field can't be null")
    private BedType bedType;
    @NotNull(message = "HasTv field can't be null")
    private Boolean hasTv;
    @NotNull(message = "HasChildStudy field can't be null")
    private Boolean hasChildStudy;
    private Boolean hasChildReceivesFriendsToSleep;
    @NotBlank(message = "Theme field can't be null")
    private String theme;

    public DescendantsSuiteCreateDTO() {
    }

    public DescendantsSuiteCreateDTO(BedType bedType, Boolean hasTv, Boolean hasChildStudy,
                                     Boolean hasChildReceivesFriendsToSleep, String theme) {
        this.bedType = bedType;
        this.hasTv = hasTv;
        this.hasChildStudy = hasChildStudy;
        this.hasChildReceivesFriendsToSleep = hasChildReceivesFriendsToSleep;
        this.theme = theme;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public Boolean getHasTv() {
        return hasTv;
    }

    public void setHasTv(Boolean hasTv) {
        this.hasTv = hasTv;
    }

    public Boolean getHasChildStudy() {
        return hasChildStudy;
    }

    public void setHasChildStudy(Boolean hasChildStudy) {
        this.hasChildStudy = hasChildStudy;
    }

    public Boolean getHasChildReceivesFriendsToSleep() {
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
}
