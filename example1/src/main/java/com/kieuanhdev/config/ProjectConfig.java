package com.kieuanhdev.config;


import com.kieuanhdev.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "vinfast1")
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("vin phet 1");
        return vehicle;
    }

    @Bean(name = "vinfast2")
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("vin phet 2 ");
        return vehicle;
    }

    @Bean(name = "vinfast3")
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("vin phet 3 ");
        return vehicle;
    }

}
