package com.web_app.springboot.demo.my_spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.web_app.springboot.demo.my_spring_boot_app",
        "com.web_app.springboot.demo.otherUtils"
})
public class MySpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootAppApplication.class, args);
    }

}
