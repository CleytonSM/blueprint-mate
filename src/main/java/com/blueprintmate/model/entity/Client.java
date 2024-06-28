package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "nm_client", length = 50, nullable = false)
    private String name;

    @Column(name = "nicknm_client", length = 50)
    private String nickname;

    @Column(name = "birthday_client", nullable = false)
    private Date birthday;

    @Column(name = "marital_status_client", length = 12, nullable = false)
    private String maritalStatus;

    @Column(name = "religion_client", length = 45)
    private String religion;

    @Column(name = "veg_vege_client")
    private boolean isVeganOrVegetarian;

    @Column(name = "individual_needs_client", length = 150)
    private String individualNeeds;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public boolean isVeganOrVegetarian() {
        return isVeganOrVegetarian;
    }

    public void setVeganOrVegetarian(boolean veganOrVegetarian) {
        isVeganOrVegetarian = veganOrVegetarian;
    }

    public String getIndividualNeeds() {
        return individualNeeds;
    }

    public void setIndividualNeeds(String individualNeeds) {
        this.individualNeeds = individualNeeds;
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
