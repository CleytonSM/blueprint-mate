package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@PrimaryKeyJoinColumn(name = "id_home_office_suite")
public class HomeOfficeSuite extends Suite {

    @ManyToOne
    @JoinColumn(name = "id_home_office_suite", referencedColumnName = "id_suite", nullable = false, insertable = false, updatable = false)
    private Suite suite;

    @Column(name = "bool_needs_privacy")
    private boolean needsPrivacy;

    @Column(name = "bool_needs_space_for_books_documents_papers")
    private boolean needsSpaceForBooksDocumentsOrPapers;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public Suite getSuite() {
        return suite;
    }

    public boolean isNeedsPrivacy() {
        return needsPrivacy;
    }

    public void setNeedsPrivacy(boolean needsPrivacy) {
        this.needsPrivacy = needsPrivacy;
    }

    public boolean isNeedsSpaceForBooksDocumentsOrPapers() {
        return needsSpaceForBooksDocumentsOrPapers;
    }

    public void setNeedsSpaceForBooksDocumentsOrPapers(boolean needsSpaceForBooksDocumentsOrPapers) {
        this.needsSpaceForBooksDocumentsOrPapers = needsSpaceForBooksDocumentsOrPapers;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }
}
