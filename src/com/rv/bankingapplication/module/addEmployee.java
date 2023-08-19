package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addEmployee extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField positionField;
    private JTextField salaryField;
    private JButton addButton;

    public addEmployee() {
        setTitle("Add Employee");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel positionLabel = new JLabel("Position:");
        JLabel salaryLabel = new JLabel("Salary:");

        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        positionField = new JTextField(20);
        salaryField = new JTextField(20);

        addButton = new JButton("Add Employee");

        // Add components to the layout
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(positionLabel);
        panel.add(positionField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(addButton);

        add(panel);

        // Add ActionListener for the Add button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addEmployeeToDatabase();
            }
        });
    }

    private void addEmployeeToDatabase() {
        String url = "jdbc:mysql://localhost:3306/BankManagementSystem";
        String username = "root";
        String password = "DhWaNi@123";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            String insertQuery = "INSERT INTO employees (employee_id, employee_firstname, employee_lastname, employee_position, employee_salary) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setLong(1, 2);
            preparedStatement.setString(2, firstNameField.getText());
            preparedStatement.setString(3, lastNameField.getText());
            preparedStatement.setString(4, positionField.getText());
            preparedStatement.setDouble(5, Double.parseDouble(salaryField.getText()));

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Employee added successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add employee.");
            }

            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void addEmployee() {
        SwingUtilities.invokeLater(() -> {
            addEmployee form = new addEmployee();
            form.setVisible(true);
        });
    }
}
