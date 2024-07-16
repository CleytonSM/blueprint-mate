package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.AmbientStyle;
import jakarta.validation.constraints.NotBlank;

public class StyleAndMoodsCreateDTO {
    @NotBlank(message = "AmbientStyle field can't be null")
    private AmbientStyle ambientStyle;
    @NotBlank(message = "AmbientStyleDescription field can't be null")
    private String ambientStyleDescription;

    public StyleAndMoodsCreateDTO() {
    }

    public StyleAndMoodsCreateDTO(AmbientStyle ambientStyle, String ambientStyleDescription) {
        this.ambientStyle = ambientStyle;
        this.ambientStyleDescription = ambientStyleDescription;
    }

    public AmbientStyle getAmbientStyle() {
        return ambientStyle;
    }

    public void setAmbientStyle(AmbientStyle ambientStyle) {
        this.ambientStyle = ambientStyle;
    }

    public String getAmbientStyleDescription() {
        return ambientStyleDescription;
    }

    public void setAmbientStyleDescription(String ambientStyleDescription) {
        this.ambientStyleDescription = ambientStyleDescription;
    }
}
