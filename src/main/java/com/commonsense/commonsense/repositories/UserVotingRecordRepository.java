package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.UserVotingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserVotingRecordRepository extends JpaRepository<UserVotingRecord, Long> {

}
