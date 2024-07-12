package com.blueprintmate.model.dto;

public class SocialMediaCreateDTO {

    private String name;

    public SocialMediaCreateDTO() {
    }

    public SocialMediaCreateDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
