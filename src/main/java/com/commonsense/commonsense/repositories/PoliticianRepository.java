package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.Politician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliticianRepository extends JpaRepository<Politician, Long> {
}
