package org.example.configuration;

import org.example.aspects.LoggingAspects;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.services")
@EnableAspectJAutoProxy
public class ProjectConfiguration {
    public LoggingAspects aspects(){
        return new LoggingAspects();
    }
}
