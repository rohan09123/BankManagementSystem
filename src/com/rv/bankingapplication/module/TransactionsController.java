package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;

public class TransactionsController {
    private TransactionsModel model;
    private TransactionsView view;

    public TransactionsController(TransactionsModel model, TransactionsView view) {
        this.model = model;
        this.view = view;
    }

    public void updateTransactionType(String transactionType) {
        model.setTransactionType(transactionType);
    }

    public void updateAmount(float amount) {
        model.setAmount(amount);
    }

    public void updateDateAndTime(String dateAndTime) {
        model.setDateAndTime(dateAndTime);
    }

    public void displayTransactionDetails() {
        view.displayTransactionDetails(
            model.getTransactionId(),
            model.getAccountId(),
            model.getTransactionType(),
            model.getAmount(),
            model.getDateAndTime()
        );
    }
}
