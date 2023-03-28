package com.commonsense.commonsense.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "donations")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "politician_id", referencedColumnName = "id")
    private Politician politician;

    @Column(name = "donor_name", nullable = false, length = 255)
    private String donorName;

    @Column(name = "amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "donation_date", nullable = false)
    private LocalDate donationDate;

    @Column(name = "donation_type", nullable = false, length = 50)
    private String donationType;

    @Column(name = "occupation", length = 255)
    private String occupation;

    @Column(name = "employer", length = 255)
    private String employer;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "state", length = 2)
    private String state;

    @Column(name = "zip_code", length = 10)
    private String zipCode;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // Constructors //
    public Donation() {}

    public Donation(Long id, Politician politician, String donorName, BigDecimal amount, LocalDate donationDate, String donationType, String occupation, String employer, String address, String city, String state, String zipCode, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.politician = politician;
        this.donorName = donorName;
        this.amount = amount;
        this.donationDate = donationDate;
        this.donationType = donationType;
        this.occupation = occupation;
        this.employer = employer;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }



}
