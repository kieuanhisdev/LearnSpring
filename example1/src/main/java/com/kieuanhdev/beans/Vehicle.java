package com.kieuanhdev.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "Honda";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("vehicle destroyed");
    }

    public void hello() {
        System.out.println("hello oto");
    }

}
