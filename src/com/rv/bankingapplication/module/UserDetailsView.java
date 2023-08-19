package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserDetailsView extends JFrame {

	private JLabel customerIdLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel dobLabel;
	private JLabel contactInfoLabel;
	private JLabel addressLabel;

	public void displayData(UserDetailsModel userDetails) {
		setTitle("User Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);

		// Initialize components
		customerIdLabel = new JLabel("Customer ID: " + userDetails.getCustomerID());
		firstNameLabel = new JLabel("First Name: " + userDetails.getCustomerFirstName());
		lastNameLabel = new JLabel("Last Name: " + userDetails.getCustomerLastName());
		dobLabel = new JLabel("Date of Birth: " + userDetails.getCustomerDOB());
		contactInfoLabel = new JLabel("Contact Info: " + userDetails.getCustomerContactInfo());
		addressLabel = new JLabel("Address: " + userDetails.getCustomerAddress());

		// Set layout
		setLayout(new GridLayout(6, 1));

		// Add components to the frame
		add(customerIdLabel);
		add(firstNameLabel);
		add(lastNameLabel);
		add(dobLabel);
		add(contactInfoLabel);
		add(addressLabel);

		setVisible(true);
	}
	
	public void addUserData()
	{
		SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Add User Form");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(7, 2));

            JLabel firstNameLabel = new JLabel("First Name:");
            JTextField firstNameField = new JTextField();

            JLabel lastNameLabel = new JLabel("Last Name:");
            JTextField lastNameField = new JTextField();

            JLabel dobLabel = new JLabel("Date of Birth:");
            JTextField dobField = new JTextField();

            JLabel contactInfoLabel = new JLabel("Contact Information:");
            JTextField contactInfoField = new JTextField();

            JLabel addressLabel = new JLabel("Address:");
            JTextField addressField = new JTextField();

            JButton submitButton = new JButton("Submit");

            frame.add(firstNameLabel);
            frame.add(firstNameField);
            frame.add(lastNameLabel);
            frame.add(lastNameField);
            frame.add(dobLabel);
            frame.add(dobField);
            frame.add(contactInfoLabel);
            frame.add(contactInfoField);
            frame.add(addressLabel);
            frame.add(addressField);
            frame.add(new JLabel()); // Empty label for spacing
            frame.add(submitButton);

            submitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String firstName = firstNameField.getText();
                    String lastName = lastNameField.getText();
                    String dob = dobField.getText();
                    String contactInfo = contactInfoField.getText();
                    String address = addressField.getText();

                    // Perform database insert or other operations here

                    // Display success message
                    JOptionPane.showMessageDialog(frame, "User added successfully!");

                    // Clear form fields
                    firstNameField.setText("");
                    lastNameField.setText("");
                    dobField.setText("");
                    contactInfoField.setText("");
                    addressField.setText("");
                }
            });

            frame.setVisible(true);
        });
	}
}
