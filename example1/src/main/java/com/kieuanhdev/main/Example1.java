package com.kieuanhdev.main;

import com.kieuanhdev.beans.Vehicle;
import com.kieuanhdev.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        //dung bean
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle1 = context.getBean(Vehicle.class);
        System.out.println("oto hang "+ vehicle1.getName());

        vehicle1.hello();
        context.close();

    }
}
