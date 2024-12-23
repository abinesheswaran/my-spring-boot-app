package com.web_app.springboot.demo.my_spring_boot_app.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String dailyWorkout() {
        return "Practice batting and bowling for 20 minutes";
    }
}
