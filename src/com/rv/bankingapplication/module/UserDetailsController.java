package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;

public class UserDetailsController {
    private UserDetailsModel model;
    private UserDetailsView view;

    public UserDetailsController(UserDetailsModel model, UserDetailsView view) {
        this.model = model;
        this.view = view;
    }

    public void updateModel(int customerID, String firstName, String lastName,
                            String dob, String contactInfo, String address) {
        model.setCustomerID(customerID);
        model.setCustomerFirstName(firstName);
        model.setCustomerLastName(lastName);
        model.setCustomerDOB(dob);
        model.setCustomerContactInfo(contactInfo);
        model.setCustomerAddress(address);
    }

    public void displayUserDetails() {
        view.setVisible(true);
    }

}
