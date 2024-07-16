package com.blueprintmate.model.dto;

public class NewAppliancesCreateDTO {
    private String link;

    public NewAppliancesCreateDTO(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
