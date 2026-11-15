package org.j2os.banking.service;

public class AccountService {

    private String serviceType;

    public AccountService(String str) {
        this.serviceType = str;
    }

    public String getServiceType() {
        return this.serviceType;
    }

}
