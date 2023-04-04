package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonationService extends JpaRepository<Donation, Long> {

}
