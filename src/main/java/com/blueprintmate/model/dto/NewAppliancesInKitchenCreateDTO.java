package com.blueprintmate.model.dto;

public class NewAppliancesInKitchenCreateDTO {
    private String link;

    public NewAppliancesInKitchenCreateDTO() {
    }

    public NewAppliancesInKitchenCreateDTO(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
