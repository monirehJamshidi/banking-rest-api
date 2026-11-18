package org.j2os.banking.repository;

import org.j2os.banking.model.Account;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryAccountRepository implements AccountRepository{

    private final Map<Long, Account> accounts = new HashMap<>();

    public InMemoryAccountRepository() {
        accounts.put(1L, new Account(1L, "AT123456789", new BigDecimal("1500.00")));
    }

    @Override
    public Optional<Account> findById(Long id) {
        return Optional.ofNullable(accounts.get(id));
    }
}