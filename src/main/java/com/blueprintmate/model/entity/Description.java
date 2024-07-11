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
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @Column(name = "best_place_desc")
    private int bestPlace;

    @Column(name = "wknd_best_place_desc", length = 180)
    private String weekendBestPlace;

    @Column(name = "miss_actual_house_desc", length = 180)
    private String missActualHouse;

    @Column(name = "bool_actual_house_satisfaction")
    private boolean hasActualHouseSatisfaction;

    @Column(name = "actual_house_satisfaction_desc", length = 180)
    private String actualHouseSatisfaction;

    @Column(name = "work_routine_desc", length = 180)
    private String workRoutine;

    @Column(name = "bool_work_at_home")
    private boolean hasWorkAtHome;

    @Column(name = "days_working_at_home")
    private int daysWorkingAtHome;

    @Column(name = "bool_practice_sports")
    private boolean hasPracticeSports;

    @Column(name = "practice_sports_desc", length = 100)
    private String practiceSports;

    @Column(name = "bool_travel")
    private boolean hasTravel;

    @Column(name = "travel_desc", length = 50)
    private String travel;

    @Column(name = "watch_tv_desc", length = 200)
    private String watchTv;

    @Column(name = "bool_book_read")
    private boolean hasBookRead;

    @Column(name = "bool_tablet_read")
    private boolean hasTabletRead;

    @Column(name = "bool_pets")
    private boolean hasPets;

    @Column(name = "pets_desc", length = 180)
    private String pets;

    @Column(name = "bool_cook")
    private boolean hasCook;

    @Column(name = "cook_desc", length = 180)
    private boolean cook;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public int getId() {
        return id;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getBestPlace() {
        return bestPlace;
    }

    public void setBestPlace(int bestPlace) {
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

    public boolean isHasActualHouseSatisfaction() {
        return hasActualHouseSatisfaction;
    }

    public void setHasActualHouseSatisfaction(boolean hasActualHouseSatisfaction) {
        this.hasActualHouseSatisfaction = hasActualHouseSatisfaction;
    }

    public String getActualHouseSatisfaction() {
        return actualHouseSatisfaction;
    }

    public void setActualHouseSatisfaction(String actualHouseSatisfaction) {
        this.actualHouseSatisfaction = actualHouseSatisfaction;
    }

    public String getWorkRoutine() {
        return workRoutine;
    }

    public void setWorkRoutine(String workRoutine) {
        this.workRoutine = workRoutine;
    }

    public boolean isHasWorkAtHome() {
        return hasWorkAtHome;
    }

    public void setHasWorkAtHome(boolean hasWorkAtHome) {
        this.hasWorkAtHome = hasWorkAtHome;
    }

    public int getDaysWorkingAtHome() {
        return daysWorkingAtHome;
    }

    public void setDaysWorkingAtHome(int daysWorkingAtHome) {
        this.daysWorkingAtHome = daysWorkingAtHome;
    }

    public boolean isHasPracticeSports() {
        return hasPracticeSports;
    }

    public void setHasPracticeSports(boolean hasPracticeSports) {
        this.hasPracticeSports = hasPracticeSports;
    }

    public String getPracticeSports() {
        return practiceSports;
    }

    public void setPracticeSports(String practiceSports) {
        this.practiceSports = practiceSports;
    }

    public boolean isHasTravel() {
        return hasTravel;
    }

    public void setHasTravel(boolean hasTravel) {
        this.hasTravel = hasTravel;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getWatchTv() {
        return watchTv;
    }

    public void setWatchTv(String watchTv) {
        this.watchTv = watchTv;
    }

    public boolean isHasBookRead() {
        return hasBookRead;
    }

    public void setHasBookRead(boolean hasBookRead) {
        this.hasBookRead = hasBookRead;
    }

    public boolean isHasTabletRead() {
        return hasTabletRead;
    }

    public void setHasTabletRead(boolean hasTabletRead) {
        this.hasTabletRead = hasTabletRead;
    }

    public boolean isHasPets() {
        return hasPets;
    }

    public void setHasPets(boolean hasPets) {
        this.hasPets = hasPets;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public boolean isHasCook() {
        return hasCook;
    }

    public void setHasCook(boolean hasCook) {
        this.hasCook = hasCook;
    }

    public boolean isCook() {
        return cook;
    }

    public void setCook(boolean cook) {
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
