package io.ennate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main (String[] args){
        System.out.println("Starting Main");
        //since using annotation config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After context init");

        HelloWorld hello = context.getBean(HelloWorld.class);
        hello.sayHello();

        context.close();
    }
}
