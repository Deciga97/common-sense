package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.UserPoll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPollService extends JpaRepository<UserPoll, Long> {
}
