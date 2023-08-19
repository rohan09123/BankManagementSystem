package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;


public class BranchsController {
    private BranchsModel model;
    private BranchsView view;

    public BranchsController(BranchsModel model, BranchsView view) {
        this.model = model;
        this.view = view;
    }

    public void displayBranchDetails() {
        view.displayBranchsDetails(
            model.getBranchId(),
            model.getBranchName(),
            model.getLocation(),
            model.getManagerId(),
            model.getContactInformation()
        );
    }
}

