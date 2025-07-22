package com.xworkz.carrom.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.carrom")
public class CarromConfiguration {
    public CarromConfiguration(){
        System.out.println("created in CarromConfiguration");
    }
}
