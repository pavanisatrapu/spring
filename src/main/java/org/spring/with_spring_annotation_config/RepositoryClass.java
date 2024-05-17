package org.spring.with_spring_annotation_config;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryClass {
    public void hello(){
        System.out.println("repository class");
    }
}
