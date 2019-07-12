package io.ennate.complex.email;

import org.springframework.stereotype.Component;

@Component
public class AWSEmailService implements EmailService {

    @Override
    public void sendEmail(String toAddress, String body) {
        System.out.println("---------- AWS Email Service--------");
        System.out.println("sending email to " + toAddress);
        System.out.println("Body: " + body);
        System.out.println("------------------------------------");
    }
}
