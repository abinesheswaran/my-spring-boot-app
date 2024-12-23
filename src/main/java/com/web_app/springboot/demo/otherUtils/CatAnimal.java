package com.web_app.springboot.demo.otherUtils;

import org.springframework.stereotype.Component;

@Component
public class CatAnimal implements Animal{

    @Override
    public String move() {
        return "Cat is walking with 4 legs...";
    }

    @Override
    public String eat() {
        return "Cat is drinking milk...  :)";
    }
}
