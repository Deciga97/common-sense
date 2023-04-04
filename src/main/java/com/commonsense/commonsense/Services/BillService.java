package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillService extends JpaRepository<Bill, Long> {
}
