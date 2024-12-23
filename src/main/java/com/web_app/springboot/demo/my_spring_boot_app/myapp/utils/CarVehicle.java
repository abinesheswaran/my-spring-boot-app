package com.web_app.springboot.demo.my_spring_boot_app.myapp.utils;

import org.springframework.stereotype.Component;

@Component
public class CarVehicle implements Vehicle{

    @Override
    public String move() {
        return "Car is started moving...";
    }
}
