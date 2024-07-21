package com.blueprintmate.model.dto;

public class EntranceHallUpdateDTO {
    private Boolean hasShoesHouseWalking;
    private Boolean hasEntranceConsoleTable;
    private Boolean hasWantEntranceConsoleTable;
    private Boolean hasFullLengthMirror;
    private Boolean hasFamiliarWithElectronicLocks;

    public EntranceHallUpdateDTO() {
    }

    public EntranceHallUpdateDTO(Boolean hasShoesHouseWalking, Boolean hasEntranceConsoleTable,
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
