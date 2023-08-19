package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;

public class AccountsController {
    private AccountsModel model;
    private AccountsView view;

    public AccountsController(AccountsModel model, AccountsView view) {
        this.model = model;
        this.view = view;
    }

    public void updateAccountDetails(int accountId, int customerId, String accountType, float balance, String dateCreated, String status) {
        model.setAccountId(accountId);
        model.setCustomerId(customerId);
        model.setAccountType(accountType);
        model.setBalance(balance);
        model.setDateCreated(dateCreated);
        model.setStatus(status);
    }

    public void displayAccountDetails() {
        view.displayAccountDetails(model.getAccountId(), model.getCustomerId(), model.getAccountType(),
                                   model.getBalance(), model.getDateCreated(), model.getStatus());
    }
}
