package com.example.demo;

import com.example.demo.interfaces.DepartmentInterface;

public class MarketingDept implements DepartmentInterface {
    private String name = "Marketing department";

    @Override
    public void destination() {
        System.out.println("Its Marketing department!");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
