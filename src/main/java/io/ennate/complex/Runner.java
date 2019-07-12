package io.ennate.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Starting Main");
        //since using annotation config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        NotifService notifService = context.getBean(NotifService.class);
        notifService.sendNotification("radeebbashir@gmail.com","this is springs DI!! ");

        context.close();
    }
}
