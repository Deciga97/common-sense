package com.commonsense.commonsense.models;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


// ORM Table Created //

@Entity
@Table(name = "user_polls")
public class UserPoll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "poll")
    private Set<UserVotingRecord> userVotingRecords = new HashSet<>();


    @Column(name = "poll_type", nullable = false, length = 50)
    private String pollType;

    @Column(name = "poll_id", nullable = false)
    private Long pollId;

    @Column(name = "vote", nullable = false, length = 10)
    private String vote;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    // Constructors //
    public UserPoll() {}

    public UserPoll(Long id, User user, String pollType, Long pollId, String vote, LocalDateTime createdAt) {
        this.id = id;
        this.user = user;
        this.pollType = pollType;
        this.pollId = pollId;
        this.vote = vote;
        this.createdAt = createdAt;
    }

    // Getters and Setters //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPollType() {
        return pollType;
    }

    public void setPollType(String pollType) {
        this.pollType = pollType;
    }

    public Long getPollId() {
        return pollId;
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
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
}
