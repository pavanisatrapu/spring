package org.spring.with_spring_java_based_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigClass.class);

        Bike bike = applicationContext.getBean(Bike.class);
        Car car = applicationContext.getBean(Car.class);
        Traveler traveler = applicationContext.getBean(Traveler.class);
        bike.move();
        car.move();
        traveler.start();

    }
}
