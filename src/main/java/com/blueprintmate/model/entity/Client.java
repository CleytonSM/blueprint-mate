package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_client")
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
    private LocalDateTime birthday;

    @Column(name = "marital_status_client", length = 12, nullable = false)
    private String maritalStatus;

    @Column(name = "religion_client", length = 45)
    private String religion;

    @Column(name = "veg_vege_client", nullable = false)
    private Boolean veganOrVegetarian;

    @Column(name = "individual_needs_client", length = 150, nullable = false)
    private String individualNeeds;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<SocialMedia> socialMediaList;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Descendants> descendantsList;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Description> descriptionList;

    public Client() {
    }

    public Client(User user, String name, String nickname, LocalDateTime birthday,
                  String maritalStatus, String religion, Boolean veganOrVegetarian, String individualNeeds,
                  Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt, List<SocialMedia> socialMediaList,
                  List<Descendants> descendantsList, List<Description> descriptionList) {
        this.user = user;
        this.name = name;
        this.nickname = nickname;
        this.birthday = birthday;
        this.maritalStatus = maritalStatus;
        this.religion = religion;
        this.veganOrVegetarian = veganOrVegetarian;
        this.individualNeeds = individualNeeds;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.socialMediaList = socialMediaList;
        this.descendantsList = descendantsList;
        this.descriptionList = descriptionList;
    }

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

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getBirthday() {
        return birthday;
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
        return veganOrVegetarian;
    }

    public void setVeganOrVegetarian(Boolean veganOrVegetarian) {
        this.veganOrVegetarian = veganOrVegetarian;
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

    public List<SocialMedia> getSocialMediaList() {
        return socialMediaList;
    }

    public void setSocialMediaList(List<SocialMedia> socialMediaList) {
        this.socialMediaList = socialMediaList;
    }

    public List<Descendants> getDescendantsList() {
        return descendantsList;
    }

    public void setDescendantsList(List<Descendants> descendantsList) {
        this.descendantsList = descendantsList;
    }

    public List<Description> getDescriptionList() {
        return descriptionList;
    }

    public void setDescriptionList(List<Description> descriptionList) {
        this.descriptionList = descriptionList;
    }
}
