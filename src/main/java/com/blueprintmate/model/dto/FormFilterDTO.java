package com.blueprintmate.model.dto;

public class FormFilterDTO {
    private String clientName;

    public FormFilterDTO() {
    }

    public FormFilterDTO(String clientName) {
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
