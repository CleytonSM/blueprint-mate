package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_description")
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_desc")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    private Form form;
    @Column(name = "best_place_desc", length = 180, nullable = false)
    private String bestPlace;
    @Column(name = "wknd_best_place_desc", length = 180, nullable = false)
    private String weekendBestPlace;
    @Column(name = "miss_actual_house_desc", length = 180, nullable = false)
    private String missActualHouse;
    @Column(name = "bool_actual_house_satisfaction", nullable = false)
    private Boolean hasActualHouseSatisfaction;
    @Column(name = "actual_house_satisfaction_desc", length = 180, nullable = false)
    private String actualHouseSatisfaction;
    @Column(name = "job_desc", length = 30, nullable = false)
    private String job;
    @Column(name = "work_routine_desc", length = 180)
    private String workRoutine;
    @Column(name = "bool_work_at_home", nullable = false)
    private Boolean hasWorkAtHome;
    @Column(name = "days_working_at_home", nullable = false)
    private int daysWorkingAtHome;
    @Column(name = "bool_travels_for_work", nullable = false)
    private Boolean hasTravelForWork;
    @Column(name = "travels_for_work_desc", length = 45)
    private String travelsForWork;
    @Column(name = "bool_practice_sports", nullable = false)
    private Boolean hasPracticeSports;
    @Column(name = "practice_sports_desc", length = 100, nullable = false)
    private String practiceSports;
    @Column(name = "bool_travel", nullable = false)
    private Boolean hasTravel;
    @Column(name = "travel_desc", length = 50)
    private String travel;
    @Column(name = "bool_watch_tv", nullable = false)
    private Boolean hasWatchTv;
    @Column(name = "watch_tv_desc", length = 200, nullable = false)
    private String watchTv;
    @Column(name = "bool_read")
    private Boolean hasRead;
    @Column(name = "bool_book_read")
    private Boolean hasBookRead;
    @Column(name = "bool_tablet_read")
    private Boolean hasTabletRead;
    @Column(name = "bool_pets", nullable = false)
    private Boolean hasPets;
    @Column(name = "pets_desc", length = 180, nullable = false)
    private String pets;
    @Column(name = "bool_cook", nullable = false)
    private Boolean hasCook;
    @Column(name = "cook_desc", length = 180, nullable = false)
    private String cook;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Description() {
    }

    public Description(Form form, String bestPlace, String weekendBestPlace,
                       String missActualHouse, Boolean hasActualHouseSatisfaction, String actualHouseSatisfaction,
                       String job, String workRoutine, Boolean hasWorkAtHome,
                       int daysWorkingAtHome, Boolean hasTravelForWork, String travelsForWork,
                       Boolean hasPracticeSports, String practiceSports, Boolean hasTravel,
                       String travel, Boolean hasWatchTv, String watchTv,
                       Boolean hasRead, Boolean hasBookRead, Boolean hasTabletRead,
                       Boolean hasPets, String pets, Boolean hasCook,
                       String cook, Timestamp createdAt, Timestamp updatedAt,
                       Timestamp deletedAt) {
        this.form = form;
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
        this.hasRead = hasRead;
        this.hasBookRead = hasBookRead;
        this.hasTabletRead = hasTabletRead;
        this.hasPets = hasPets;
        this.pets = pets;
        this.hasCook = hasCook;
        this.cook = cook;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public int getId() {
        return id;
    }

    public String getBestPlace() {
        return bestPlace;
    }

    public void setBestPlace(String bestPlace) {
        this.bestPlace = bestPlace;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
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

    public Boolean getHasRead() {
        return hasRead;
    }

    public void setHasRead(Boolean hasRead) {
        this.hasRead = hasRead;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }
}
