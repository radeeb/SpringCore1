package io.ennate.simple;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements InitializingBean, DisposableBean { //interfaces

    public HelloWorld(){
        System.out.println("Inside the bean constructor");

    }
    public void sayHello(){
        System.out.println("Spring Application");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying HelloSpring bean");

    }
}
