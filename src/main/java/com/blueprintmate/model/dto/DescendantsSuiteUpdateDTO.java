package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.BedType;

public class DescendantsSuiteUpdateDTO {
    private BedType bedType;
    private Boolean hasTv;
    private Boolean hasChildStudy;
    private Boolean hasChildReceivesFriendsToSleep;
    private String theme;

    public DescendantsSuiteUpdateDTO() {
    }

    public DescendantsSuiteUpdateDTO(BedType bedType, Boolean hasTv, Boolean hasChildStudy,
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
