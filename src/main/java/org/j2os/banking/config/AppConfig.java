package org.j2os.banking.config;

import org.j2os.banking.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
//    @Primary
    public AccountService savingAccountService(){
        return new AccountService("SAVING");
    }

    @Bean
    public AccountService currentAccountService(){
        return new AccountService("CURRENT");
    }
}
