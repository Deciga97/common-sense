package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.StockTrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockTradeRepository extends JpaRepository<StockTrade, Long> {
}
