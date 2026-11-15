package org.j2os.banking.runner;

import org.j2os.banking.config.properties.NotificationProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotificationPropertiesRunner implements CommandLineRunner {

    private final NotificationProperties notificationProperties;

    public NotificationPropertiesRunner(NotificationProperties notificationProperties) {
        this.notificationProperties = notificationProperties;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Notification Configuration:");
        System.out.println("Message: " + notificationProperties.getMessage());
        System.out.println("Enabled: " + notificationProperties.isEnabled());
        System.out.println("Retry Count: " + notificationProperties.getRetryCount());
    }
}
