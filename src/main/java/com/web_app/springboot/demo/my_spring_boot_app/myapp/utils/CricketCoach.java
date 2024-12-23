package com.web_app.springboot.demo.my_spring_boot_app.myapp.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return "Practice batting and bowling for 20 minutes";
    }
}
