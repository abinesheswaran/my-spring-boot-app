package com.web_app.springboot.demo.my_spring_boot_app.myapp.controller;

import com.web_app.springboot.demo.otherUtils.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    private Animal myAnimal;

    @Autowired
    public AnimalController(Animal animal){
        myAnimal = animal;
    }

    @GetMapping("/move")
    public String move(){
        return myAnimal.move();
    }

}
