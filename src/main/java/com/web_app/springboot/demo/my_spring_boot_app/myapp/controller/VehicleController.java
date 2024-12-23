package com.web_app.springboot.demo.my_spring_boot_app.myapp.controller;

import com.web_app.springboot.demo.my_spring_boot_app.myapp.utils.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    private Vehicle myVehicle;

    @Autowired
    public void setMyVehicle(Vehicle vehicle) {
        myVehicle = vehicle;
    }

    @GetMapping("/move")
    public String move() {
        return myVehicle.move();
    }
}
