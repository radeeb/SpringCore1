package io.ennate.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main (String[] args){
        System.out.println("Starting Main");
        //since using annotation config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After context init");

        HelloWorld hello = context.getBean(HelloWorld.class); //creating an object through spring factory pattern
        hello.sayHello();
        System.out.println("Before closing context");
        context.close();
        System.out.println("After closing context");
    }
}
