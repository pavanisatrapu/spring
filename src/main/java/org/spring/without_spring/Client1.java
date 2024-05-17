package org.spring.without_spring;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client1 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Bike();
        Vehicle vehicle2 = new Car();
        Traveler t1 = new Traveler(vehicle1);
        Traveler t2 = new Traveler(vehicle2);
        t1.start();
        t2.start();
    }
}