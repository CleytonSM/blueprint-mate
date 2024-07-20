package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "tb_form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_form")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    @JsonIgnore
    private Client client;
    @Column(name = "title_form", nullable = false, length = 40)
    private String title;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;
    @OneToMany(mappedBy = "form")
    private List<Description> descriptionList;
    @OneToMany(mappedBy = "form")
    private List<StyleAndMoods> styleAndMoodsList;
    @OneToMany(mappedBy = "form")
    private List<Building> buildingList;
    @OneToMany(mappedBy = "form")
    private List<Context> contextList;
    @OneToMany(mappedBy = "form")
    private List<Experience> experienceList;
    @OneToMany(mappedBy = "form")
    private List<GeneralInfo> generalInfoList;
    @OneToMany(mappedBy = "form")
    private List<Bathroom> bathroomList;
    @OneToMany(mappedBy = "form")
    private List<Laundry> laundryList;
    @OneToMany(mappedBy = "form")
    private List<Toilet> toiletList;
    @OneToMany(mappedBy = "form")
    private List<EntranceHall> entranceHallList;
    @OneToMany(mappedBy = "form")
    private List<LivingRoom> livingRoomList;
    @OneToMany(mappedBy = "form")
    private List<DiningRoom> diningRoomList;
    @OneToMany(mappedBy = "form")
    private List<Kitchen> kitchenList;


    public Form() {
    }

    public Form(Client client, String title, Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt,
                List<Description> descriptionList, List<StyleAndMoods> styleAndMoodsList, List<Building> buildingList,
                List<Context> contextList, List<Experience> experienceList, List<GeneralInfo> generalInfoList,
                List<Bathroom> bathroomList, List<Laundry> laundryList, List<Toilet> toiletList,
                List<EntranceHall> entranceHallList, List<LivingRoom> livingRoomList, List<DiningRoom> diningRoomList,
                List<Kitchen> kitchenList) {
        this.client = client;
        this.title = title;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.descriptionList = descriptionList;
        this.styleAndMoodsList = styleAndMoodsList;
        this.buildingList = buildingList;
        this.contextList = contextList;
        this.experienceList = experienceList;
        this.generalInfoList = generalInfoList;
        this.bathroomList = bathroomList;
        this.laundryList = laundryList;
        this.toiletList = toiletList;
        this.entranceHallList = entranceHallList;
        this.livingRoomList = livingRoomList;
        this.diningRoomList = diningRoomList;
        this.kitchenList = kitchenList;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Description> getDescriptionList() {
        return descriptionList;
    }

    public void setDescriptionList(List<Description> descriptionList) {
        this.descriptionList = descriptionList;
    }

    public List<StyleAndMoods> getStyleAndMoodsList() {
        return styleAndMoodsList;
    }

    public void setStyleAndMoodsList(List<StyleAndMoods> styleAndMoodsList) {
        this.styleAndMoodsList = styleAndMoodsList;
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public List<Context> getContextList() {
        return contextList;
    }

    public void setContextList(List<Context> contextList) {
        this.contextList = contextList;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public List<GeneralInfo> getGeneralInfoList() {
        return generalInfoList;
    }

    public void setGeneralInfoList(List<GeneralInfo> generalInfoList) {
        this.generalInfoList = generalInfoList;
    }

    public List<Bathroom> getBathroomList() {
        return bathroomList;
    }

    public void setBathroomList(List<Bathroom> bathroomList) {
        this.bathroomList = bathroomList;
    }

    public List<Laundry> getLaundryList() {
        return laundryList;
    }

    public void setLaundryList(List<Laundry> laundryList) {
        this.laundryList = laundryList;
    }

    public List<Toilet> getToiletList() {
        return toiletList;
    }

    public void setToiletList(List<Toilet> toiletList) {
        this.toiletList = toiletList;
    }

    public List<EntranceHall> getEntranceHallList() {
        return entranceHallList;
    }

    public void setEntranceHallList(List<EntranceHall> entranceHallList) {
        this.entranceHallList = entranceHallList;
    }

    public List<LivingRoom> getLivingRoomList() {
        return livingRoomList;
    }

    public void setLivingRoomList(List<LivingRoom> livingRoomList) {
        this.livingRoomList = livingRoomList;
    }

    public List<DiningRoom> getDiningRoomList() {
        return diningRoomList;
    }

    public void setDiningRoomList(List<DiningRoom> diningRoomList) {
        this.diningRoomList = diningRoomList;
    }

    public List<Kitchen> getKitchenList() {
        return kitchenList;
    }

    public void setKitchenList(List<Kitchen> kitchenList) {
        this.kitchenList = kitchenList;
    }
}
