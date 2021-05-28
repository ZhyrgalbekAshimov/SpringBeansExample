package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Пример использования бинов с классами:
        // Employee (работник),
        // Designation (должность),
        // Department (отдел),
        // Organisation (организация)

        // объяснение "scope prototype" находится в классе "Cashier"

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProjectConfig.class);

        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee);




    }

}
