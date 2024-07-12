package com.blueprintmate.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_project")
@Inheritance(strategy = InheritanceType.JOINED)
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_project")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_form", nullable = false)
    private Form form;

    public Project() {
    }

    public Project(Form form) {
        this.form = form;
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
}
