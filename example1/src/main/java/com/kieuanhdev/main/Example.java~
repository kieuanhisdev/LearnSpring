package com.kieuanhdev.main;

import com.kieuanhdev.beans.Vehicle;
import com.kieuanhdev.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {
    public static void main(String[] args) {

        //chua dung bean
        Vehicle vehicle = new Vehicle();
        vehicle.setName("vinfast");
        System.out.println("oto hang "+ vehicle.getName());

        //dung bean
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle1 = context.getBean(Vehicle.class);
        System.out.println("oto hang "+ vehicle1.getName());




    }
}
