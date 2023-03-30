package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.Committee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommitteeRepository extends JpaRepository<Committee, Long> {
}
