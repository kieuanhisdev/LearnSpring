package com.kieuanhdev.config;


import com.kieuanhdev.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("vin phet 1");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("vin phet");
        return vehicle;
    }

    @Bean
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("vin phet");
        return vehicle;
    }

}
