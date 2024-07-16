package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DescriptionCreateDTO {
    @NotBlank(message = "BestPlace field can't be null")
    private String bestPlace;
    @NotBlank(message = "WeekendBestPlace field can't be null")
    private String weekendBestPlace;
    @NotBlank(message = "MissActualHouse field can't be null")
    private String missActualHouse;
    @NotNull(message = "HasActualHouseSatis field can't be null")
    private Boolean hasActualHouseSatisfaction;
    @NotBlank(message = "ActualHouseSatisfaction field can't be null")
    private String actualHouseSatisfaction;
    @NotBlank(message = "Job field can't be null")
    private String job;
    private String workRoutine;
    @NotNull(message = "HasWorkAtHome field can't be null")
    private Boolean hasWorkAtHome;
    @NotNull(message = "DaysWorkingAtHome field can't be null")
    private int daysWorkingAtHome;
    @NotNull(message = "HasTravelForWork field can't be null")
    private Boolean hasTravelForWork;
    private String travelsForWork;
    @NotNull(message = "HasPracticeSports field can't be null")
    private Boolean hasPracticeSports;
    @NotBlank(message = "PracticeSports field can't be null")
    private String practiceSports;
    @NotNull(message = "HasTravel field can't be null")
    private Boolean hasTravel;
    private String travel;
    @NotNull(message = "HasWatchTv field can't be null")
    private Boolean hasWatchTv;
    @NotBlank(message = "WatchTv field can't be null")
    private String watchTv;
    private Boolean hasRead;
    private Boolean hasBookRead;
    private Boolean hasTabletRead;
    @NotNull(message = "HasPets field can't be null")
    private Boolean hasPets;
    @NotBlank(message = "Pets field can't be null")
    private String pets;
    @NotNull(message = "HasCook field can't be null")
    private Boolean hasCook;
    @NotBlank(message = "Cook field can't be null")
    private String cook;

    public DescriptionCreateDTO() {
    }

    public DescriptionCreateDTO(String bestPlace, String weekendBestPlace, String missActualHouse,
                                Boolean hasActualHouseSatisfaction, String actualHouseSatisfaction, String job,
                                String workRoutine, Boolean hasWorkAtHome, int daysWorkingAtHome,
                                Boolean hasTravelForWork, String travelsForWork, Boolean hasPracticeSports,
                                String practiceSports, Boolean hasTravel, String travel, Boolean hasWatchTv,
                                String watchTv, Boolean hasBookRead, Boolean hasTabletRead, Boolean hasPets,
                                String pets, Boolean hasCook, String cook) {
        this.bestPlace = bestPlace;
        this.weekendBestPlace = weekendBestPlace;
        this.missActualHouse = missActualHouse;
        this.hasActualHouseSatisfaction = hasActualHouseSatisfaction;
        this.actualHouseSatisfaction = actualHouseSatisfaction;
        this.job = job;
        this.workRoutine = workRoutine;
        this.hasWorkAtHome = hasWorkAtHome;
        this.daysWorkingAtHome = daysWorkingAtHome;
        this.hasTravelForWork = hasTravelForWork;
        this.travelsForWork = travelsForWork;
        this.hasPracticeSports = hasPracticeSports;
        this.practiceSports = practiceSports;
        this.hasTravel = hasTravel;
        this.travel = travel;
        this.hasWatchTv = hasWatchTv;
        this.watchTv = watchTv;
        this.hasBookRead = hasBookRead;
        this.hasTabletRead = hasTabletRead;
        this.hasPets = hasPets;
        this.pets = pets;
        this.hasCook = hasCook;
        this.cook = cook;
    }

    public String getBestPlace() {
        return bestPlace;
    }

    public void setBestPlace(String bestPlace) {
        this.bestPlace = bestPlace;
    }

    public String getWeekendBestPlace() {
        return weekendBestPlace;
    }

    public void setWeekendBestPlace(String weekendBestPlace) {
        this.weekendBestPlace = weekendBestPlace;
    }

    public String getMissActualHouse() {
        return missActualHouse;
    }

    public void setMissActualHouse(String missActualHouse) {
        this.missActualHouse = missActualHouse;
    }

    public Boolean getHasActualHouseSatisfaction() {
        return hasActualHouseSatisfaction;
    }

    public void setHasActualHouseSatisfaction(Boolean hasActualHouseSatisfaction) {
        this.hasActualHouseSatisfaction = hasActualHouseSatisfaction;
    }

    public String getActualHouseSatisfaction() {
        return actualHouseSatisfaction;
    }

    public void setActualHouseSatisfaction(String actualHouseSatisfaction) {
        this.actualHouseSatisfaction = actualHouseSatisfaction;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getWorkRoutine() {
        return workRoutine;
    }

    public void setWorkRoutine(String workRoutine) {
        this.workRoutine = workRoutine;
    }

    public Boolean getHasWorkAtHome() {
        return hasWorkAtHome;
    }

    public void setHasWorkAtHome(Boolean hasWorkAtHome) {
        this.hasWorkAtHome = hasWorkAtHome;
    }

    public int getDaysWorkingAtHome() {
        return daysWorkingAtHome;
    }

    public void setDaysWorkingAtHome(int daysWorkingAtHome) {
        this.daysWorkingAtHome = daysWorkingAtHome;
    }

    public Boolean getHasTravelForWork() {
        return hasTravelForWork;
    }

    public void setHasTravelForWork(Boolean hasTravelForWork) {
        this.hasTravelForWork = hasTravelForWork;
    }

    public String getTravelsForWork() {
        return travelsForWork;
    }

    public void setTravelsForWork(String travelsForWork) {
        this.travelsForWork = travelsForWork;
    }

    public Boolean getHasPracticeSports() {
        return hasPracticeSports;
    }

    public void setHasPracticeSports(Boolean hasPracticeSports) {
        this.hasPracticeSports = hasPracticeSports;
    }

    public String getPracticeSports() {
        return practiceSports;
    }

    public void setPracticeSports(String practiceSports) {
        this.practiceSports = practiceSports;
    }

    public Boolean getHasTravel() {
        return hasTravel;
    }

    public void setHasTravel(Boolean hasTravel) {
        this.hasTravel = hasTravel;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public Boolean getHasWatchTv() {
        return hasWatchTv;
    }

    public void setHasWatchTv(Boolean hasWatchTv) {
        this.hasWatchTv = hasWatchTv;
    }

    public String getWatchTv() {
        return watchTv;
    }

    public void setWatchTv(String watchTv) {
        this.watchTv = watchTv;
    }

    public Boolean getHasBookRead() {
        return hasBookRead;
    }

    public void setHasBookRead(Boolean hasBookRead) {
        this.hasBookRead = hasBookRead;
    }

    public Boolean getHasTabletRead() {
        return hasTabletRead;
    }

    public void setHasTabletRead(Boolean hasTabletRead) {
        this.hasTabletRead = hasTabletRead;
    }

    public Boolean getHasPets() {
        return hasPets;
    }

    public void setHasPets(Boolean hasPets) {
        this.hasPets = hasPets;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public Boolean getHasCook() {
        return hasCook;
    }

    public void setHasCook(Boolean hasCook) {
        this.hasCook = hasCook;
    }

    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }

    public Boolean getHasRead() {
        return hasRead;
    }

    public void setHasRead(Boolean hasRead) {
        this.hasRead = hasRead;
    }
}
