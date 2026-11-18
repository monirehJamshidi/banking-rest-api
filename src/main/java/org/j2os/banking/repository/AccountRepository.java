package org.j2os.banking.repository;

import org.j2os.banking.model.Account;

import java.util.Optional;

public interface AccountRepository {

    Optional<Account> findById(Long id);
}
