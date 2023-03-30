package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.Lobbyist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LobbyistRepository extends JpaRepository<Lobbyist, Long> {
}
