package com.blueprintmate.model.dto;

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
    private Boolean isChildren;
    private List<DescendantsCreateDTO> descendantsList;
    private String religion;
    @NotNull(message = "VeganOrVegetarian field can't be null")
    private Boolean isVeganOrVegetarian;
    @NotBlank(message = "IndividualNeeds field can't be null")
    private String individualNeeds;

    public @NotNull(message = "Name field can't be null") String getName() {
        return name;
    }

    public void setName(@NotNull(message = "Name field can't be null") String name) {
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

    public @NotNull(message = "Birthday field can't be null") LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(@NotNull(message = "Birthday field can't be null") LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public @NotNull(message = "MaritalStatus field can't be null") String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(@NotNull(message = "MaritalStatus field can't be null") String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @NotNull(message = "VeganOrVegetarian field can't be null")
    public Boolean isVeganOrVegetarian() {
        return isVeganOrVegetarian;
    }

    public void setVeganOrVegetarian(@NotNull(message = "VeganOrVegetarian field can't be null") Boolean veganOrVegetarian) {
        isVeganOrVegetarian = veganOrVegetarian;
    }

    public @NotNull(message = "IndividualNeeds field can't be null") String getIndividualNeeds() {
        return individualNeeds;
    }

    public void setIndividualNeeds(@NotNull(message = "IndividualNeeds field can't be null") String individualNeeds) {
        this.individualNeeds = individualNeeds;
    }

    public Boolean isChildren() {
        return isChildren;
    }

    public void setChildren(Boolean children) {
        isChildren = children;
    }

    public List<DescendantsCreateDTO> getDescendantsList() {
        return descendantsList;
    }

    public void setDescendantsList(List<DescendantsCreateDTO> descendantsList) {
        this.descendantsList = descendantsList;
    }
}
