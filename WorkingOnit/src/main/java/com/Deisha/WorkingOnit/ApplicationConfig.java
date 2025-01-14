package com.Deisha.WorkingOnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MyFirstComponent myFirstComponent() {
        return new MyFirstComponent("Durelle");
    }
}
