package org.spring.without_spring;

public class Traveler {
    private Vehicle vehicle;
    Traveler(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void start(){
        this.vehicle.move();
    }
}
