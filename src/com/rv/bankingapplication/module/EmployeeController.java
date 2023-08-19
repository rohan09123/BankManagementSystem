package com.rv.bankingapplication.module;

import javax.swing.*;
import java.awt.*;

public class EmployeeController {
    private EmployeeModel model;
    private EmployeeView view;
    private addEmployee create;

    public EmployeeController(EmployeeModel model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateEmployeeDetails(int employeeId, String employeeFirstname, String employeeLastname,
                                      String employeeJoinDate, String employeePosition) {
        model.setEmployeeId(employeeId);
        model.setEmployeeFirstname(employeeFirstname);
        model.setEmployeeLastname(employeeLastname);
        model.setEmployeeJoinDate(employeeJoinDate);
        model.setEmployeePosition(employeePosition);
    }

    public void displayEmployeeDetails() {
        view.displayEmployeeDetails(model.getEmployeeId(), model.getEmployeeFirstname(),
                                    model.getEmployeeLastname(), model.getEmployeeJoinDate(),
                                    model.getEmployeePosition());
    }
    
    public void employeeCreate()
    {
    	create.addEmployee();
    }
}
