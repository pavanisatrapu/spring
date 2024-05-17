package org.spring.with_spring_annotation_config;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("car is moving");
    }
}
