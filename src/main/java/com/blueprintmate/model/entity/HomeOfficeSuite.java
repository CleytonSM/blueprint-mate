package com.blueprintmate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_home_office_suite")
public class HomeOfficeSuite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_home_office_suite")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    @JsonIgnore
    private Form form;
    @Column(name = "bed_type_suite", length = 30)
    private String bedType;
    @Column(name = "bool_needs_privacy")
    private Boolean needsPrivacy;
    @Column(name = "bool_needs_space_for_books_documents_papers")
    private Boolean needsSpaceForBooksDocumentsOrPapers;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public HomeOfficeSuite() {
    }

    public HomeOfficeSuite(Form form, String bedType, Timestamp deletedAt, Timestamp updatedAt, Timestamp createdAt,
                           Boolean needsSpaceForBooksDocumentsOrPapers, Boolean needsPrivacy) {
        this.form = form;
        this.bedType = bedType;
        this.deletedAt = deletedAt;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.needsSpaceForBooksDocumentsOrPapers = needsSpaceForBooksDocumentsOrPapers;
        this.needsPrivacy = needsPrivacy;
    }

    public int getId() {
        return id;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public Boolean getNeedsPrivacy() {
        return needsPrivacy;
    }

    public Boolean getNeedsSpaceForBooksDocumentsOrPapers() {
        return needsSpaceForBooksDocumentsOrPapers;
    }

    public Boolean isNeedsPrivacy() {
        return needsPrivacy;
    }

    public void setNeedsPrivacy(Boolean needsPrivacy) {
        this.needsPrivacy = needsPrivacy;
    }

    public Boolean isNeedsSpaceForBooksDocumentsOrPapers() {
        return needsSpaceForBooksDocumentsOrPapers;
    }

    public void setNeedsSpaceForBooksDocumentsOrPapers(Boolean needsSpaceForBooksDocumentsOrPapers) {
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
