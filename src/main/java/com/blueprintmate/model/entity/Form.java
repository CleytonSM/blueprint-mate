package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_form")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;
    @Column(name = "title_form", nullable = false, length = 40)
    private String title;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;
    @OneToOne(mappedBy = "form")
    private Description description;
    @OneToOne(mappedBy = "form")
    private StyleAndMoods styleAndMoods;
    @OneToOne(mappedBy = "form")
    private Building building;
    @OneToOne(mappedBy = "form")
    private Context context;
    @OneToOne(mappedBy = "form")
    private Experience experience;
    @OneToOne(mappedBy = "form")
    private GeneralInfo generalInfo;
    @OneToOne(mappedBy = "form")
    private Bathroom bathroom;
    @OneToOne(mappedBy = "form")
    private Laundry laundry;
    @OneToOne(mappedBy = "form")
    private Toilet toilet;
    @OneToOne(mappedBy = "form")
    private EntranceHall entranceHall;
    @OneToOne(mappedBy = "form")
    private LivingRoom livingRoom;
    @OneToOne(mappedBy = "form")
    private DiningRoom diningRoom;
    @OneToOne(mappedBy = "form")
    private Kitchen kitchen;


    public Form() {
    }

    public Form(Client client, String title, Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt,
                Description description, StyleAndMoods styleAndMoods, Building building, Context context,
                Experience experience, GeneralInfo generalInfo, Bathroom bathroom, Laundry laundry, Toilet toilet,
                EntranceHall entranceHall, LivingRoom livingRoom, DiningRoom diningRoom, Kitchen kitchen) {
        this.client = client;
        this.title = title;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.description = description;
        this.styleAndMoods = styleAndMoods;
        this.building = building;
        this.context = context;
        this.experience = experience;
        this.generalInfo = generalInfo;
        this.bathroom = bathroom;
        this.laundry = laundry;
        this.toilet = toilet;
        this.entranceHall = entranceHall;
        this.livingRoom = livingRoom;
        this.diningRoom = diningRoom;
        this.kitchen = kitchen;
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

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public StyleAndMoods getStyleAndMoods() {
        return styleAndMoods;
    }

    public void setStyleAndMoods(StyleAndMoods styleAndMoods) {
        this.styleAndMoods = styleAndMoods;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public Laundry getLaundry() {
        return laundry;
    }

    public void setLaundry(Laundry laundry) {
        this.laundry = laundry;
    }

    public Toilet getToilet() {
        return toilet;
    }

    public void setToilet(Toilet toilet) {
        this.toilet = toilet;
    }

    public EntranceHall getEntranceHall() {
        return entranceHall;
    }

    public void setEntranceHall(EntranceHall entranceHall) {
        this.entranceHall = entranceHall;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}
