package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {

}
