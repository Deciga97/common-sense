package com.commonsense.commonsense.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// ORM Table Created //
@Entity
@Table(name = "politician_voting_records")
public class PoliticianVotingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_id")
    private Bill bill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "politician_id")
    private Politician politician;

    @Column(name = "vote", length = 10, nullable = false)
    private String vote;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false, updatable = false)
    private LocalDateTime updatedAt;

    // Constructors //

    public PoliticianVotingRecord() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public PoliticianVotingRecord(Bill bill, Politician politician, String vote) {
        this.bill = bill;
        this.politician = politician;
        this.vote = vote;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    // Getters and Setters //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Politician getPolitician() {
        return politician;
    }

    public void setPolitician(Politician politician) {
        this.politician = politician;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
