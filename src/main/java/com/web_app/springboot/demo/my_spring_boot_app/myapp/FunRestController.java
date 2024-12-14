package com.web_app.springboot.demo.my_spring_boot_app.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello, this is abinesh eswaran reruning";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Going to gym for workout...";
    }
}
