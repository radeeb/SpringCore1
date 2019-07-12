package io.ennate;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public HelloWorld(){
        System.out.println("Inside the bean constructor");

    }
    public void sayHello(){
        System.out.println("Spring Application");
    }
}
