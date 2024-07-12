package com.blueprintmate.model.dto;

public class FormCreateDTO {

    private String title;
    private DescriptionCreateDTO description;
    private ExperienceCreateDTO experience;
    private BuildingCreateDTO building;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DescriptionCreateDTO getDescription() {
        return description;
    }

    public void setDescription(DescriptionCreateDTO description) {
        this.description = description;
    }

    public ExperienceCreateDTO getExperience() {
        return experience;
    }

    public void setExperience(ExperienceCreateDTO experience) {
        this.experience = experience;
    }

    public BuildingCreateDTO getBuilding() {
        return building;
    }

    public void setBuilding(BuildingCreateDTO building) {
        this.building = building;
    }
}
