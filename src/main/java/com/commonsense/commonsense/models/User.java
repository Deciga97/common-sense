package com.commonsense.commonsense.models;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", unique = true, nullable = false)
    @Size(max = 30, message = "Email address must be less than or equal to 30 characters")
    @Email
    private String email;

    @Column(name = "password", length = 20, nullable = false)
    private String password;

    @Column(name ="first_name", length = 20, nullable = false)
    private String firstName;

    @Column(name = "middle_name", length = 20)
    private String middleName;

    @Column(name = "last_name", length = 20, nullable = false)
    private String lastName;

    @Column(name = "party_affiliation")
    private String partyAffiliation;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime CreatedAt;

    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;


    // Getters and Setters //

    private int Id;


}
