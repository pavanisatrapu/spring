package org.spring.with_spring_annotation_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan//(basePackages = {"org.spring.with_spring_annotation_config"})
public class ConfigClass {
}
