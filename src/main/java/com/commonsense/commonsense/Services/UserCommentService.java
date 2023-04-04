package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommentService extends JpaRepository<UserComment, Long> {
}
