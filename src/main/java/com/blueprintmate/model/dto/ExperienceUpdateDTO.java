package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.LivelyColor;
import com.blueprintmate.model.enumerable.NeutralColor;

public class ExperienceUpdateDTO {
    private NeutralColor neutralColor;
    private LivelyColor livelyColor;
    private String likeToFeel;
    private String houseMeaning;

    public ExperienceUpdateDTO() {
    }

    public ExperienceUpdateDTO(NeutralColor neutralColor, LivelyColor livelyColor,
                               String likeToFeel, String houseMeaning) {
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
