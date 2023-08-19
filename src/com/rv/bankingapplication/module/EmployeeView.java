package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;


public class EmployeeView extends JPanel {
    private JLabel employeeIdLabel;
    private JLabel employeeFirstnameLabel;
    private JLabel employeeLastnameLabel;
    private JLabel employeeJoinDateLabel;
    private JLabel employeePositionLabel;

    public EmployeeView() {
        // Initialize components
        employeeIdLabel = new JLabel("Employee ID:");
        employeeFirstnameLabel = new JLabel("First Name:");
        employeeLastnameLabel = new JLabel("Last Name:");
        employeeJoinDateLabel = new JLabel("Join Date:");
        employeePositionLabel = new JLabel("Position:");

        // Set layout
        setLayout(new GridLayout(5, 2));

        // Add components to the panel
        add(employeeIdLabel);
        add(new JLabel()); // Empty label for spacing
        add(employeeFirstnameLabel);
        add(new JLabel()); // Empty label for spacing
        add(employeeLastnameLabel);
        add(new JLabel()); // Empty label for spacing
        add(employeeJoinDateLabel);
        add(new JLabel()); // Empty label for spacing
        add(employeePositionLabel);
    }

    public void displayEmployeeDetails(EmployeeModel employee) {
        // Update labels with employee details
        employeeIdLabel.setText("Employee ID: " + employee.getEmployeeId());
        employeeFirstnameLabel.setText("First Name: " + employee.getEmployeeFirstname());
        employeeLastnameLabel.setText("Last Name: " + employee.getEmployeeLastname());
        employeeJoinDateLabel.setText("Join Date: " + employee.getEmployeeJoinDate());
        employeePositionLabel.setText("Position: " + employee.getEmployeePosition());
    }

    public void displayEmployeeDetails(int a, String b, String c, String d, String e) {
        SwingUtilities.invokeLater(()-> {
            JFrame frame = new JFrame("Employee Details");
            EmployeeView employeeView = new EmployeeView();
            setSize(400, 300);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(employeeView); // Add the EmployeeView panel to the JFrame
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
