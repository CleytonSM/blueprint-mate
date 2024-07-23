package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.BedType;

public class GuestsSuiteUpdateDTO {
    private BedType bedType;
    private String closetUse;
    private String frequencyOfGuests;

    public GuestsSuiteUpdateDTO() {
    }

    public GuestsSuiteUpdateDTO(BedType bedType, String closetUse, String frequencyOfGuests) {
        this.bedType = bedType;
        this.closetUse = closetUse;
        this.frequencyOfGuests = frequencyOfGuests;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public String getClosetUse() {
        return closetUse;
    }

    public void setClosetUse(String closetUse) {
        this.closetUse = closetUse;
    }

    public String getFrequencyOfGuests() {
        return frequencyOfGuests;
    }

    public void setFrequencyOfGuests(String frequencyOfGuests) {
        this.frequencyOfGuests = frequencyOfGuests;
    }
}
