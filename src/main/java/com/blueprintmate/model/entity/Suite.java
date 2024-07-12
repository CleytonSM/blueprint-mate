package com.blueprintmate.model.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_suite")
public class Suite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suite")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    private Form form;

    @Column(name = "bed_type_suite", length = 30)
    private String bedType;

    public Suite() {
    }

    public Suite(Form form, String bedType) {
        this.form = form;
        this.bedType = bedType;
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
}
