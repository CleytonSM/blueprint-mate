package com.blueprintmate.model.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "nm_client", length = 50, nullable = false)
    private String name;

    @Column(name = "nicknm_client", length = 50)
    private String nickname;

    @Column(name = "birthday_client", nullable = false)
    private Date birthday;

    @Column(name = "marital_status_client", length = 12, nullable = false)
    private String maritalStatus;

    @Column(name = "religion_client", length = 45)
    private String religion;

    @Column(name = "veg_vege_client")
    private boolean isVeganOrVegetarian;

    @Column(name = "individual_needs_client", length = 150)
    private String individualNeeds;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;
}
