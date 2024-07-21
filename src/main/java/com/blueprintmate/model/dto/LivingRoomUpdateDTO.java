package com.blueprintmate.model.dto;

public class LivingRoomUpdateDTO {
    private Integer people;
    private Boolean hasPeople;
    private Integer tvInch;
    private String equipmentLiving;
    private Boolean hasSofaWithChaise;
    private Boolean hasSofaWithRetractableChaise;
    private Boolean hasBooksOrCollection;
    private Boolean hasUsedDaily;
    private String receivesManyPeople;

    public LivingRoomUpdateDTO() {
    }

    public LivingRoomUpdateDTO(Integer people, Boolean hasPeople, Integer tvInch, String equipmentLiving,
                               Boolean hasSofaWithChaise, Boolean hasSofaWithRetractableChaise,
                               Boolean hasBooksOrCollection, Boolean hasUsedDaily, String receivesManyPeople) {
        this.people = people;
        this.hasPeople = hasPeople;
        this.tvInch = tvInch;
        this.equipmentLiving = equipmentLiving;
        this.hasSofaWithChaise = hasSofaWithChaise;
        this.hasSofaWithRetractableChaise = hasSofaWithRetractableChaise;
        this.hasBooksOrCollection = hasBooksOrCollection;
        this.hasUsedDaily = hasUsedDaily;
        this.receivesManyPeople = receivesManyPeople;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Boolean getHasPeople() {
        return hasPeople;
    }

    public void setHasPeople(Boolean hasPeople) {
        this.hasPeople = hasPeople;
    }

    public Integer getTvInch() {
        return tvInch;
    }

    public void setTvInch(Integer tvInch) {
        this.tvInch = tvInch;
    }

    public String getEquipmentLiving() {
        return equipmentLiving;
    }

    public void setEquipmentLiving(String equipmentLiving) {
        this.equipmentLiving = equipmentLiving;
    }

    public Boolean getHasSofaWithChaise() {
        return hasSofaWithChaise;
    }

    public void setHasSofaWithChaise(Boolean hasSofaWithChaise) {
        this.hasSofaWithChaise = hasSofaWithChaise;
    }

    public Boolean getHasSofaWithRetractableChaise() {
        return hasSofaWithRetractableChaise;
    }

    public void setHasSofaWithRetractableChaise(Boolean hasSofaWithRetractableChaise) {
        this.hasSofaWithRetractableChaise = hasSofaWithRetractableChaise;
    }

    public Boolean getHasBooksOrCollection() {
        return hasBooksOrCollection;
    }

    public void setHasBooksOrCollection(Boolean hasBooksOrCollection) {
        this.hasBooksOrCollection = hasBooksOrCollection;
    }

    public Boolean getHasUsedDaily() {
        return hasUsedDaily;
    }

    public void setHasUsedDaily(Boolean hasUsedDaily) {
        this.hasUsedDaily = hasUsedDaily;
    }

    public String getReceivesManyPeople() {
        return receivesManyPeople;
    }

    public void setReceivesManyPeople(String receivesManyPeople) {
        this.receivesManyPeople = receivesManyPeople;
    }
}
