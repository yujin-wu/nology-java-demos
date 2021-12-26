package com.company;

import java.math.BigDecimal;

public class Account {
    String name;
    BigDecimal balance;

    public void deposit(int amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void withdraw(int amount) {
        balance.subtract(BigDecimal.valueOf(amount));
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
