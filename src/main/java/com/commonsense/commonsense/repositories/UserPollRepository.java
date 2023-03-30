package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.UserPoll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPollRepository extends JpaRepository<UserPoll, Long> {

}
