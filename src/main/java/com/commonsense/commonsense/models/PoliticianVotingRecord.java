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

    public Politician getPolitician() {}

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


}
