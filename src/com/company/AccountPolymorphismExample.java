package com.company;

import java.util.ArrayList;


class SavingsAccount extends Account {
    private int interestRateBps;

    public void fetchAndUpdateInterestRate() {
        // Pretend to fetch "ourbank.com/api/interestrate"
        interestRateBps = 150;
    }

    public int getInterestRateBps() {
        return interestRateBps;
    }
}

class CheckingAccount extends Account {
    int fee;
}

class TrustAccount extends Account {
    int fee;
    ArrayList<Customer> trustees;

    public void addTrustee(Customer c) {
        trustees.add(c);
    }
}

class Customer {
    ArrayList<Account> accounts;

    void addAccount(Account a) {
        accounts.add(a);
    }

    public void printAccounts() {
        for (Account a : accounts) {
            System.out.println(a.name);
        }
    }
}

class AccountPolymorphismExample {
    public static void main(String[] args)
    {
        Customer c = new Customer();
        SavingsAccount s = new SavingsAccount();
        CheckingAccount ck = new CheckingAccount();
        TrustAccount t = new TrustAccount();

        s.fetchAndUpdateInterestRate();
        s.getInterestRateBps();

        c.addAccount(s);
        c.addAccount(ck);
        c.addAccount(t);
    }
}
