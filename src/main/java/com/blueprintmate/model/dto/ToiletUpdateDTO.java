package com.blueprintmate.model.dto;

public class ToiletUpdateDTO {
    private String apartmentPattern;
    private String designToilet;

    public ToiletUpdateDTO() {
    }

    public ToiletUpdateDTO(String apartmentPattern, String designToilet) {
        this.apartmentPattern = apartmentPattern;
        this.designToilet = designToilet;
    }

    public String getApartmentPattern() {
        return apartmentPattern;
    }

    public void setApartmentPattern(String apartmentPattern) {
        this.apartmentPattern = apartmentPattern;
    }

    public String getDesignToilet() {
        return designToilet;
    }

    public void setDesignToilet(String designToilet) {
        this.designToilet = designToilet;
    }
}
