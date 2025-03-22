package com.kieuanhdev.config;


import com.kieuanhdev.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("vin phet");
        return vehicle;
    }

    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    Integer integer() {
        return 10;
    }

}
