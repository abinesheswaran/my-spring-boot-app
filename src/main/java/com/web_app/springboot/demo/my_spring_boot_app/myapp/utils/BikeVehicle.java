package com.web_app.springboot.demo.my_spring_boot_app.myapp.utils;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BikeVehicle implements Vehicle{
    @Override
    public String move() {
        return "bike is started moving...";
    }
}
