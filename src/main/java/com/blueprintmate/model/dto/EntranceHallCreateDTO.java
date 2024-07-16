package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotNull;

public class EntranceHallCreateDTO {
    private Boolean hasShoesHouseWalking;
    @NotNull(message = "HasEntranceConsoleTable field can't be null")
    private Boolean hasEntranceConsoleTable;
    @NotNull(message = "HasWantEntranceConsoleTable field can't be null")
    private Boolean hasWantEntranceConsoleTable;
    @NotNull(message = "HasFullLengthMirror field can't be null")
    private Boolean hasFullLengthMirror;
    @NotNull(message = "HasFamiliarWithElectronicLocks field can't be null")
    private Boolean hasFamiliarWithElectronicLocks;

    public EntranceHallCreateDTO() {
    }

    public EntranceHallCreateDTO(Boolean hasShoesHouseWalking, Boolean hasEntranceConsoleTable,
                                 Boolean hasWantEntranceConsoleTable, Boolean hasFullLengthMirror,
                                 Boolean hasFamiliarWithElectronicLocks) {
        this.hasShoesHouseWalking = hasShoesHouseWalking;
        this.hasEntranceConsoleTable = hasEntranceConsoleTable;
        this.hasWantEntranceConsoleTable = hasWantEntranceConsoleTable;
        this.hasFullLengthMirror = hasFullLengthMirror;
        this.hasFamiliarWithElectronicLocks = hasFamiliarWithElectronicLocks;
    }

    public Boolean getHasShoesHouseWalking() {
        return hasShoesHouseWalking;
    }

    public void setHasShoesHouseWalking(Boolean hasShoesHouseWalking) {
        this.hasShoesHouseWalking = hasShoesHouseWalking;
    }

    public Boolean getHasEntranceConsoleTable() {
        return hasEntranceConsoleTable;
    }

    public void setHasEntranceConsoleTable(Boolean hasEntranceConsoleTable) {
        this.hasEntranceConsoleTable = hasEntranceConsoleTable;
    }

    public Boolean getHasWantEntranceConsoleTable() {
        return hasWantEntranceConsoleTable;
    }

    public void setHasWantEntranceConsoleTable(Boolean hasWantEntranceConsoleTable) {
        this.hasWantEntranceConsoleTable = hasWantEntranceConsoleTable;
    }

    public Boolean getHasFullLengthMirror() {
        return hasFullLengthMirror;
    }

    public void setHasFullLengthMirror(Boolean hasFullLengthMirror) {
        this.hasFullLengthMirror = hasFullLengthMirror;
    }

    public Boolean getHasFamiliarWithElectronicLocks() {
        return hasFamiliarWithElectronicLocks;
    }

    public void setHasFamiliarWithElectronicLocks(Boolean hasFamiliarWithElectronicLocks) {
        this.hasFamiliarWithElectronicLocks = hasFamiliarWithElectronicLocks;
    }
}
