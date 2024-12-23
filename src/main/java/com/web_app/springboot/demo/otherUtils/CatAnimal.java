package com.web_app.springboot.demo.otherUtils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//this is default one
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
