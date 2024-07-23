package com.blueprintmate.model.dto;

public class NewAppliancesInKitchenUpdateDTO {
    private String link;

    public NewAppliancesInKitchenUpdateDTO() {
    }

    public NewAppliancesInKitchenUpdateDTO(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
