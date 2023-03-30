package com.commonsense.commonsense.repositories;

import com.commonsense.commonsense.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
