package org.j2os.banking.service;

import org.j2os.banking.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(
//            @Qualifier("notificationRepositoryImpl")
            NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public String sendNotification() {
        return notificationRepository.getMessage();
    }
}
