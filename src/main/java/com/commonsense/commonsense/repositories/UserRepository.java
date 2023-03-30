package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
