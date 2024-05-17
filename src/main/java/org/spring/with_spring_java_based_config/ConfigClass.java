package org.spring.with_spring_java_based_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public Vehicle bike(){
        return new Bike();
    }

    @Bean
    public Vehicle car(){
        return new Car();
    }

    @Bean
    public Traveler traveler(){
        return new Traveler(bike());
    }

}
