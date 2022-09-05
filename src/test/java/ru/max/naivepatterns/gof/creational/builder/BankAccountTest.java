package ru.max.naivepatterns.gof.creational.builder;

import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.creational.builder.BankAccount;

class BankAccountTest {

    @Test
    void testBuildBankAccount() {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withEmail("jon@example.com")
                .wantNewsletter(true)
                .build();
    }

}