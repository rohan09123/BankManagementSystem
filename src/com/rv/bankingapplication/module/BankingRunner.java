package com.rv.bankingapplication.module;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankingRunner extends JFrame{
	private static Connection connection = null;
	
    public static void main(String[] args) {
    	BankingRunner bankingRunnerObject = new BankingRunner(); 
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		String dbURL = "jdbc:mysql://localhost:3306/BankManagementSystem";
    		String dbUsername = "root";
    		String dbPassword = "DhWaNi@123";
    		
    		connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
    	} catch (Exception e)
    	{
    		throw new RuntimeException("You Got an Error!!");
    	}
    	runner();
    }
    
    public static void runner()
    {
    	SwingUtilities.invokeLater(() -> {
            // Create instances of different models
            EmployeeModel employeeModel = new EmployeeModel();
            AccountsModel accountsModel = new AccountsModel();
            BranchsModel branchsModel = new BranchsModel();
            TransactionsModel transactionsModel = new TransactionsModel();
            UserDetailsModel userDetailsModel = new UserDetailsModel();

            // Create instances of different views
            EmployeeView employeeView = new EmployeeView();
            AccountsView accountsView = new AccountsView();
            BranchsView branchsView = new BranchsView();
            TransactionsView transactionsView = new TransactionsView();
//            UserDetailsView userDetailsView = new UserDetailsView(userDetailsModel);

            // Create instances of different controllers
            EmployeeController employeeController = new EmployeeController(employeeModel, employeeView);
            AccountsController accountsController = new AccountsController(accountsModel, accountsView);
            BranchsController branchsController = new BranchsController(branchsModel, branchsView);
            TransactionsController transactionsController = new TransactionsController(transactionsModel, transactionsView);
//            UserDetailsController userDetailsController = new UserDetailsController(userDetailsModel, userDetailsView);

            // Set up a simple GUI to select controllers to display
            JFrame frame = new JFrame("Banking Application Main Menu");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JPanel panel = new JPanel(new GridLayout(5, 1));
            JButton employeeButton = new JButton("Employee Details");
            JButton accountsButton = new JButton("Accounts Details");
            JButton branchsButton = new JButton("Branches Details");
            JButton transactionsButton = new JButton("Transactions Details");
            JButton userDetailsButton = new JButton("User Details");

            panel.add(employeeButton);
            panel.add(accountsButton);
            panel.add(branchsButton);
            panel.add(transactionsButton);
            panel.add(userDetailsButton);

            frame.add(panel, BorderLayout.CENTER);
            frame.setVisible(true);

            // Add ActionListener for each button to display respective views
            employeeButton.addActionListener(e -> employeeController.employeeCreate());
            accountsButton.addActionListener(e -> accountsController.displayAccountDetails());
            branchsButton.addActionListener(e -> branchsController.displayBranchDetails());
            transactionsButton.addActionListener(e -> transactionsController.displayTransactionDetails());
//            userDetailsButton.addActionListener(e -> userDetailsController.displayUserDetails());
        });
    }
    
    public void sendData()
    {
    	
    }
    
}
