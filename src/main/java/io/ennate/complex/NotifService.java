package io.ennate.complex;


import org.springframework.stereotype.Component;
import io.ennate.complex.email.EmailService;
@Component
public class NotifService {

    //example of springs dependency injection
    private EmailService emailService;
    public NotifService(EmailService emailService){
        this.emailService = emailService;
    }

    public void sendNotification(String to, String message){
        this.emailService.sendEmail(to, message);
    }
}
