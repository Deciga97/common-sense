package com.commonsense.commonsense.Services;

import com.commonsense.commonsense.models.Notification;
import com.commonsense.commonsense.models.User;

import java.util.List;

public interface NotificationService {
    Notification createNotification(Notification notification);

    Notification updateNotification(Notification notification);

    void deleteNotification(Long id);

    List<Notification> getAllNotifications();

    List<Notification> getNotificationsByUser(User user);
}
