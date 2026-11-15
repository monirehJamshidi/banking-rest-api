package org.j2os.banking.repository;

import org.j2os.banking.config.properties.NotificationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("development")
public class NotificationRepositoryImpl implements NotificationRepository{

    private final NotificationProperties notificationProperties;

    public NotificationRepositoryImpl(
            NotificationProperties notificationProperties
    ) {
        this.notificationProperties = notificationProperties;
    }

    public String getMessage() {
        return notificationProperties.getMessage(); //this.message; //"Notification sent successfully";
    }
}
