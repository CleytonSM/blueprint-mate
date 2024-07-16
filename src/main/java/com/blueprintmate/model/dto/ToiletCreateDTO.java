package com.blueprintmate.model.dto;

import jakarta.validation.constraints.NotBlank;

public class ToiletCreateDTO {
    @NotBlank(message = "ApartmentPattern field can't be null")
    private String apartmentPattern;
    @NotBlank(message = "DesignToilet field can't be null")
    private String designToilet;

    public ToiletCreateDTO() {
    }

    public ToiletCreateDTO(String apartmentPattern, String designToilet) {
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
