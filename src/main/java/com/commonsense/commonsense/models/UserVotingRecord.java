package com.commonsense.commonsense.models;


import jakarta.persistence.*;

import java.time.LocalDateTime;


// ORM Table Created//

@Entity
@Table(name = "user_voting_records")
public class UserVotingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "poll_id", nullable = false)
    private Poll poll;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_id", nullable = false)
    private PollOption option;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    // Constructors //

    public UserVotingRecord() {}

    public UserVotingRecord(Long id, User user, Poll poll, PollOption option, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.user = user;
        this.poll = poll;
        this.option = option;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
