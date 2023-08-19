package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;

public class AccountsView extends JFrame {
    private JLabel accountIdLabel;
    private JLabel customerIdLabel;
    private JLabel accountTypeLabel;
    private JLabel balanceLabel;
    private JLabel dateCreatedLabel;
    private JLabel statusLabel;
    
    public AccountsView()
    {
    	//empty constructor;
    }

    public AccountsView(AccountsModel account) {
        setTitle("Account Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Initialize components
        accountIdLabel = new JLabel("Account ID: " + account.getAccountId());
        customerIdLabel = new JLabel("Customer ID: " + account.getCustomerId());
        accountTypeLabel = new JLabel("Account Type: " + account.getAccountType());
        balanceLabel = new JLabel("Balance: " + account.getBalance());
        dateCreatedLabel = new JLabel("Date Created: " + account.getDateCreated());
        statusLabel = new JLabel("Status: " + account.getStatus());

        // Set layout
        setLayout(new GridLayout(6, 1));

        // Add components to the frame
        add(accountIdLabel);
        add(customerIdLabel);
        add(accountTypeLabel);
        add(balanceLabel);
        add(dateCreatedLabel);
        add(statusLabel);

        setVisible(true);
    }

    public void displayAccountDetails(int a, int b, String c, float d, String e, String f ){
        SwingUtilities.invokeLater(() -> {
            AccountsModel account = new AccountsModel();
            account.setAccountId(123);
            account.setCustomerId(456);
            account.setAccountType("Savings");
            account.setBalance(1000.0f);
            account.setDateCreated("2023-08-20");
            account.setStatus("Active");

            AccountsView accountsView = new AccountsView(account);
        });
    }
}
