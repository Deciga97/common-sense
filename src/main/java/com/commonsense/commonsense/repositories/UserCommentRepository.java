package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommentRepository extends JpaRepository<UserComment, Long> {

}
