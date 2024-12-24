package com.web_app.springboot.demo.my_spring_boot_app.myapp.utils;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
