package com.web_app.springboot.demo.my_spring_boot_app.myapp.utils;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Run a hard 5k!";
    }
}
