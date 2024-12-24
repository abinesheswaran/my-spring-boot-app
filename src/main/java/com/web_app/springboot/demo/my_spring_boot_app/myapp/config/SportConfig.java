package com.web_app.springboot.demo.my_spring_boot_app.myapp.config;

import com.web_app.springboot.demo.my_spring_boot_app.myapp.utils.Coach;
import com.web_app.springboot.demo.my_spring_boot_app.myapp.utils.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
