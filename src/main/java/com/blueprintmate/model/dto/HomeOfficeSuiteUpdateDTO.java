package com.blueprintmate.model.dto;

import com.blueprintmate.model.enumerable.BedType;

public class HomeOfficeSuiteUpdateDTO {
    private BedType bedType;
    private Boolean needsPrivacy;
    private Boolean needsSpaceForBooksDocumentsOrPapers;

    public HomeOfficeSuiteUpdateDTO() {
    }

    public HomeOfficeSuiteUpdateDTO(BedType bedType, Boolean needsPrivacy,
                                    Boolean needsSpaceForBooksDocumentsOrPapers) {
        this.bedType = bedType;
        this.needsPrivacy = needsPrivacy;
        this.needsSpaceForBooksDocumentsOrPapers = needsSpaceForBooksDocumentsOrPapers;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public Boolean getNeedsPrivacy() {
        return needsPrivacy;
    }

    public void setNeedsPrivacy(Boolean needsPrivacy) {
        this.needsPrivacy = needsPrivacy;
    }

    public Boolean getNeedsSpaceForBooksDocumentsOrPapers() {
        return needsSpaceForBooksDocumentsOrPapers;
    }

    public void setNeedsSpaceForBooksDocumentsOrPapers(Boolean needsSpaceForBooksDocumentsOrPapers) {
        this.needsSpaceForBooksDocumentsOrPapers = needsSpaceForBooksDocumentsOrPapers;
    }
}
