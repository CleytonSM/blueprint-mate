package com.blueprintmate.model.dto;

public class NewAppliancesCreateOnKitchenDTO {
    private String link;

    public NewAppliancesCreateOnKitchenDTO() {
    }

    public NewAppliancesCreateOnKitchenDTO(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
