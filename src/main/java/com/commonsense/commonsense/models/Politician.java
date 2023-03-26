package com.commonsense.commonsense.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;


@Entity
@Table(name = "politicians")
public class Politician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", length = 25, nullable = false)
    private String firstName;

    @Column(name = "middle_name", length = 25)
    private String middleName;

    @Column(name = "last_name", length = 25, nullable = false)
    private String lastName;

    @Column(name = "party_affiliation", length = 25, nullable = false)
    private String partyAffiliation;

    @Column(name = "district")
    private String district;

    @Column(name = "position", length = 25, nullable = false)
    private String position;

    @Column(name = "photo_Url", length = 255)
    private String photo_Url;

    @Column(name = "email", length = 25)
    private String email;

    @Column(name = "phone_number", length = 25, nullable = false)
    private String phoneNumber;

    @Column(name = "office_address", length = 25)
    private String officeAddress;

    @Column(name = "biography", columnDefinition = "TEXT")
    private String Biography;

    @Column(name = "voting_records", columnDefinition = "TEXT")
    private String votingRecords;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime CreatedAt;

    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
