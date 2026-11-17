package org.j2os.banking.controller;

import org.j2os.banking.exception.AccountNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getAccount(
            @PathVariable Long id) {

        throw new AccountNotFoundException("Account not found with id: " + id); //ResponseEntity.ok("Test");

//        return ResponseEntity.ok("Test");
    }
}
