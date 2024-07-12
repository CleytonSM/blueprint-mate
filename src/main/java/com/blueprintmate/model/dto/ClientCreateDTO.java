package com.blueprintmate.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public class ClientCreateDTO {

    @NotBlank(message = "Name field can't be null")
    private String name;
    private String nickname;
    private List<SocialMediaCreateDTO> socialMediaList;
    @NotNull(message = "Birthday field can't be null")
    private LocalDateTime birthday;
    @NotBlank(message = "MaritalStatus field can't be null")
    private String maritalStatus;
    @Valid
    private List<DescendantsCreateDTO> descendantsList;
    private String religion;
    @NotNull(message = "VeganOrVegetarian field can't be null")
    private Boolean veganOrVegetarian;
    @NotBlank(message = "IndividualNeeds field can't be null")
    private String individualNeeds;

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

    public List<SocialMediaCreateDTO> getSocialMediaList() {
        return socialMediaList;
    }

    public void setSocialMediaList(List<SocialMediaCreateDTO> socialMediaList) {
        this.socialMediaList = socialMediaList;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public List<DescendantsCreateDTO> getDescendantsList() {
        return descendantsList;
    }

    public void setDescendantsList(List<DescendantsCreateDTO> descendantsList) {
        this.descendantsList = descendantsList;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Boolean isVeganOrVegetarian() {
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
}
