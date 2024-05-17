package org.spring.with_spring_annotation_config;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    public void hello(){
        System.out.println("service class");
    }
}
