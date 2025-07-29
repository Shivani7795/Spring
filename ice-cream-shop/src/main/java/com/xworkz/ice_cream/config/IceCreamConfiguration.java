package com.xworkz.ice_cream.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.ice_cream")
public class IceCreamConfiguration {
    public IceCreamConfiguration(){
        System.out.println("created Ice_creamConfiguration");
    }
}
