package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;

public class TransactionsView extends JFrame {
    private JLabel transactionIdLabel;
    private JLabel accountIdLabel;
    private JLabel transactionTypeLabel;
    private JLabel amountLabel;
    private JLabel dateAndTimeLabel;
    
    public TransactionsView()
    {
    	//empty constructor
    }

    public TransactionsView(TransactionsModel transaction) {
        setTitle("Transaction Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Initialize components
        transactionIdLabel = new JLabel("Transaction ID: " + transaction.getTransactionId());
        accountIdLabel = new JLabel("Account ID: " + transaction.getAccountId());
        transactionTypeLabel = new JLabel("Transaction Type: " + transaction.getTransactionType());
        amountLabel = new JLabel("Amount: " + transaction.getAmount());
        dateAndTimeLabel = new JLabel("Date and Time: " + transaction.getDateAndTime());

        // Set layout
        setLayout(new GridLayout(5, 1));

        // Add components to the frame
        add(transactionIdLabel);
        add(accountIdLabel);
        add(transactionTypeLabel);
        add(amountLabel);
        add(dateAndTimeLabel);

        setVisible(true);
    }

    public void displayTransactionDetails(int a, int b, String c, float d, String f) {
        SwingUtilities.invokeLater(() -> {
            TransactionsModel transaction = new TransactionsModel();
            transaction.setTransactionId(1);
            transaction.setAccountId(101);
            transaction.setTransactionType("Deposit");
            transaction.setAmount(1000);
            transaction.setDateAndTime("2023-08-18 15:30:00");

            TransactionsView transactionsView = new TransactionsView(transaction);
        });
    }
}
