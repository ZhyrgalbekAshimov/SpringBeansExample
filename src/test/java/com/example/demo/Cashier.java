package com.example.demo;

import com.example.demo.interfaces.Designation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
// "prototype" scope используется если нужно создать уникальный экземпляр бина.
// Например, создание бина "Состояние сайта" для пользователя,
// где хранится например тема сайта(светлая, темная), хранить ли cookies  и т.п.
public class Cashier implements Designation {

    private String name = "Cashier";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("I am cashier and I am counting money!");
    }

}
