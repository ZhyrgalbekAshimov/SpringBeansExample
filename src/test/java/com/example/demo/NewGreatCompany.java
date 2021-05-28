package com.example.demo;

import com.example.demo.interfaces.CompanyInterface;
import org.springframework.stereotype.Component;

@Component
public class NewGreatCompany implements CompanyInterface {

    private String name = "NewGreatCompany";

    @Override
    public void organization() {
        System.out.println("Our company name is \"NewGreatCompany\"");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
