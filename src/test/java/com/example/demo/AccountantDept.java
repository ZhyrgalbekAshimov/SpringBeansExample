package com.example.demo;

import com.example.demo.interfaces.DepartmentInterface;

public class AccountantDept implements DepartmentInterface {

    private String name = "Accountant department";

    @Override
    public void destination() {
        System.out.println("Its Accountant department!");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
