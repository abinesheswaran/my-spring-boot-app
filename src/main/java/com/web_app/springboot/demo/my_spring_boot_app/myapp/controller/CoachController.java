package com.web_app.springboot.demo.my_spring_boot_app.myapp.controller;

import com.web_app.springboot.demo.my_spring_boot_app.myapp.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach")
public class CoachController {
    private Coach myCoach;

    @Autowired
    public CoachController(@Qualifier("cricketCoach") Coach coach) {
        myCoach = coach;
    }

    @GetMapping("/workout")
    public String workout() {
        return myCoach.dailyWorkout();
    }
}
