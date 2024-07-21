package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.AmbientStyle;

public class StyleAndMoodsUpdateDTO {
    private AmbientStyle ambientStyle;
    private String ambientStyleDescription;

    public StyleAndMoodsUpdateDTO() {
    }

    public StyleAndMoodsUpdateDTO(AmbientStyle ambientStyle, String ambientStyleDescription) {
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
