package com.commonsense.commonsense.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

// ORM Databased Created //

@Entity
@Table(name = "politicians")
public class Politician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "politicians")
    private Set<Bill> bills = new HashSet<>();


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

    // Constructors //

    public Politician() {}

    public Politician(Long id, String firstName, String middleName, String lastName, String partyAffiliation, String district, String position, String photo_Url, String email, String phoneNumber, String officeAddress, String biography, String votingRecords, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.partyAffiliation = partyAffiliation;
        this.district = district;
        this.position = position;
        this.photo_Url = photo_Url;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.officeAddress = officeAddress;
        Biography = biography;
        this.votingRecords = votingRecords;
        CreatedAt = createdAt;
        this.updatedAt = updatedAt;
    }

// Getters and Setters //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPartyAffiliation() {
        return partyAffiliation;
    }

    public void setPartyAffiliation(String partyAffiliation) {
        this.partyAffiliation = partyAffiliation;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoto_Url() {
        return photo_Url;
    }

    public void setPhoto_Url(String photo_Url) {
        this.photo_Url = photo_Url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getBiography() {
        return Biography;
    }

    public void setBiography(String biography) {
        Biography = biography;
    }

    public String getVotingRecords() {
        return votingRecords;
    }

    public void setVotingRecords(String votingRecords) {
        this.votingRecords = votingRecords;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
