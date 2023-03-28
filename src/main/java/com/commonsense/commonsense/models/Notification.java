package com.commonsense.commonsense.models;


import jakarta.persistence.*;

import java.time.LocalDateTime;

// ORM Table Created //
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Column(name = "description", nullable = false, length = 50)
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "read", nullable = false)
    private boolean read;

    @Column(name = "read_at")
    private LocalDateTime readAt;


}
