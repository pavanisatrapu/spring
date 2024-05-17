package org.spring.with_spring_annotation_config;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("bike is moving");
    }
}
