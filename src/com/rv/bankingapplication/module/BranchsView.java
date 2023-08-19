package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;

public class BranchsView extends JFrame {
    private JLabel branchIdLabel;
    private JLabel branchNameLabel;
    private JLabel locationLabel;
    private JLabel managerIdLabel;
    private JLabel contactInformationLabel;
    
    public BranchsView()
    {
    	//empty constructor
    }

    public BranchsView(BranchsModel branch) {
        setTitle("Branch Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Initialize components
        branchIdLabel = new JLabel("Branch ID: " + branch.getBranchId());
        branchNameLabel = new JLabel("Branch Name: " + branch.getBranchName());
        locationLabel = new JLabel("Location: " + branch.getLocation());
        managerIdLabel = new JLabel("Manager ID: " + branch.getManagerId());
        contactInformationLabel = new JLabel("Contact Information: " + branch.getContactInformation());

        // Set layout
        setLayout(new GridLayout(5, 1));

        // Add components to the frame
        add(branchIdLabel);
        add(branchNameLabel);
        add(locationLabel);
        add(managerIdLabel);
        add(contactInformationLabel);

        setVisible(true);
    }

    public void displayBranchsDetails(int a, String b, String c, int d, String f) {
        SwingUtilities.invokeLater(() -> {
            BranchsModel branch = new BranchsModel();
            branch.setBranchId(1);
            branch.setBranchName("Main Branch");
            branch.setLocation("City Center");
            branch.setManagerId(101);
            branch.setContactInformation("Email: main@bank.com, Phone: 123-456-7890");

            BranchsView branchsView = new BranchsView(branch);
        });
    }
}
