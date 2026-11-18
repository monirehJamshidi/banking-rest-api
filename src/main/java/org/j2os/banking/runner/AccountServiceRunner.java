package org.j2os.banking.runner;

import org.j2os.banking.service.NotificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceRunner implements CommandLineRunner {

    private final NotificationService notificationService;

    public AccountServiceRunner(
            NotificationService notificationService){

        this.notificationService = notificationService;
    }
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Notification Service: " + notificationService.sendNotification());

    }
}
