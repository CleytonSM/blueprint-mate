package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_new_appliances")
@PrimaryKeyJoinColumn(name = "id_new_appliances")
public class NewAppliances extends Appliances {
    @ManyToOne
    @JoinColumn(name = "id_new_appliances", referencedColumnName = "id_appliances",
            nullable = false, insertable = false, updatable = false)
    private Appliances appliances;

    @Column(name = "link_new_appliances", length = Integer.MAX_VALUE)
    private String link;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public NewAppliances() {
    }

    public NewAppliances(Kitchen kitchen, Laundry laundry, Boolean hasStoreSmallVisible,
                         Boolean hasStoreSmallHidden, String link, Timestamp createdAt,
                         Timestamp updatedAt, Timestamp deletedAt) {
        super(kitchen, laundry, hasStoreSmallVisible, hasStoreSmallHidden);
        this.link = link;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public NewAppliances(Kitchen kitchen, Laundry laundry, Boolean hasStoreSmallVisible,
                         Boolean hasStoreSmallHidden, String link, Timestamp createdAt) {
        super(kitchen, laundry, hasStoreSmallVisible, hasStoreSmallHidden);
        this.link = link;
        this.createdAt = createdAt;
    }

    public Appliances getAppliances() {
        return appliances;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
