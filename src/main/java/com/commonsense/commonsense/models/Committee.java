package com.commonsense.commonsense.models;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


// ORM Database Created //


@Entity
@Table(name = "committees")
public class Committee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many-to-many relationships between committee and politician table //
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "committee_politician",
            joinColumns = { @JoinColumn(name = "committee_id") },
            inverseJoinColumns = { @JoinColumn(name = "politician_id") }
    )
    private Set<Politician> politicians = new HashSet<>();


    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "member_ids")
    private String memberIds;

    @Column(name = "potential_issues")
    private String potentialIssues;

    @Column(name = "bills")
    private String bills;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // Constructors //
     public Committee() {}

    public Committee(Long id, String name, String description, String memberIds, String potentialIssues, String bills, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.memberIds = memberIds;
        this.potentialIssues = potentialIssues;
        this.bills = bills;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(String memberIds) {
        this.memberIds = memberIds;
    }

    public String getPotentialIssues() {
        return potentialIssues;
    }

    public void setPotentialIssues(String potentialIssues) {
        this.potentialIssues = potentialIssues;
    }

    public String getBills() {
        return bills;
    }

    public void setBills(String bills) {
        this.bills = bills;
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

