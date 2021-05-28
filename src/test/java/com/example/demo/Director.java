package com.example.demo;

import com.example.demo.interfaces.Designation;
import org.springframework.stereotype.Component;

@Component
public class Director implements Designation {
    private String name = "Director";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("I am manager and I am managing!");
    }


}
