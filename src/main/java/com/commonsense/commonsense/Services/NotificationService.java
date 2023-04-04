package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Notification;
import com.commonsense.commonsense.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationService extends JpaRepository<Notification, Long> {

}
