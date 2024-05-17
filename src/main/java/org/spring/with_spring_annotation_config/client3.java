package org.spring.with_spring_annotation_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigClass.class);
        ControllerClass controllerClass=applicationContext.getBean(ControllerClass.class);
        ServiceClass serviceClass=applicationContext.getBean(ServiceClass.class);
        RepositoryClass repositoryClass=applicationContext.getBean(RepositoryClass.class);

        controllerClass.hello();
        serviceClass.hello();
        repositoryClass.hello();

        Traveler traveler=applicationContext.getBean(Traveler.class);
        traveler.start();

    }
}
