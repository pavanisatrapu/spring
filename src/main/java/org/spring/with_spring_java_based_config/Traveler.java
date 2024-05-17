package org.spring.with_spring_java_based_config;

public class Traveler {
    private Vehicle vehicle;
    public Traveler(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void start(){
        this.vehicle.move();
    }
}
