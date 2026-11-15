package org.j2os.banking.runner;

import org.j2os.banking.service.AccountService;
import org.j2os.banking.service.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceRunner implements CommandLineRunner {

    private final AccountService accountService;
    private final NotificationService notificationService;

    public AccountServiceRunner(
            @Qualifier(value = "currentAccountService")
            AccountService accountService,
            NotificationService notificationService){
        this.accountService = accountService;


        this.notificationService = notificationService;
    }
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Account Service: " + accountService.getServiceType());
        System.out.println("Notification Service: " + notificationService.sendNotification());

    }
}
