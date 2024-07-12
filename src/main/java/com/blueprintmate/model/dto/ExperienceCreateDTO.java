package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.LivelyColor;
import com.blueprintmate.model.enumerable.NeutralColor;
import jakarta.validation.constraints.NotBlank;

public class ExperienceCreateDTO {

    @NotBlank(message = "NeutralColor can't be null")
    private NeutralColor neutralColor;
    @NotBlank(message = "LivelyColor can't be null")
    private LivelyColor livelyColor;
    @NotBlank(message = "LikeToFeel can't be null")
    private String likeToFeel;
    @NotBlank(message = "HouseMeaning can't be null")
    private String houseMeaning;

    public ExperienceCreateDTO() {
    }

    public ExperienceCreateDTO(NeutralColor neutralColor, LivelyColor livelyColor, String likeToFeel, String houseMeaning) {
        this.neutralColor = neutralColor;
        this.livelyColor = livelyColor;
        this.likeToFeel = likeToFeel;
        this.houseMeaning = houseMeaning;
    }

    public NeutralColor getNeutralColor() {
        return neutralColor;
    }

    public void setNeutralColor(NeutralColor neutralColor) {
        this.neutralColor = neutralColor;
    }

    public LivelyColor getLivelyColor() {
        return livelyColor;
    }

    public void setLivelyColor(LivelyColor livelyColor) {
        this.livelyColor = livelyColor;
    }

    public String getLikeToFeel() {
        return likeToFeel;
    }

    public void setLikeToFeel(String likeToFeel) {
        this.likeToFeel = likeToFeel;
    }

    public String getHouseMeaning() {
        return houseMeaning;
    }

    public void setHouseMeaning(String houseMeaning) {
        this.houseMeaning = houseMeaning;
    }
}
