package com.web_app.springboot.demo.my_spring_boot_app.myapp.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return "Run a hard 5k!";
    }
}
