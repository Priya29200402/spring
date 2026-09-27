package com.xworkz.light.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.xworkz.light")
@EnableWebMvc
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println("Created ApplicationConfiguration");
    }
}
