package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
