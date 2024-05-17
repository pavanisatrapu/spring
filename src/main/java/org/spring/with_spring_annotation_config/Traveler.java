package org.spring.with_spring_annotation_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {
    private Vehicle vehicle;

    @Autowired
    public Traveler(@Qualifier("bike") Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void start(){
        this.vehicle.move();
    }

}
