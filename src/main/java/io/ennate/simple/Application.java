package io.ennate.simple;

//class to configure the spring app

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    //to tell the app its a bean method
    /*@Bean
    public HelloWorld asd(){
        System.out.println("Inside the bean factory method");
        return new HelloWorld();
    }*/
}
