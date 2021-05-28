package com.example.demo;

import com.example.demo.interfaces.CompanyInterface;
import com.example.demo.interfaces.DepartmentInterface;
import com.example.demo.interfaces.Designation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Employee {

    private Designation designation;
    private DepartmentInterface departmentInterface;     //indicated as @Bean in config file
    private CompanyInterface organisation;

    public Employee(@Qualifier("cashier") Designation designation,
                    DepartmentInterface departmentInterface,
                    CompanyInterface organisation) {
        this.designation = designation;
        this.departmentInterface = departmentInterface;
        this.organisation = organisation;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee \n{" +
                "\ndesignation = " + designation.getName() +
                ", \ndepartment = " + departmentInterface.getName() +
                ", \norganisation = " + organisation.getName() +
                "\n}";
    }
}
