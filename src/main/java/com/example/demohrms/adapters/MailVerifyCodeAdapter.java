package com.example.demohrms.adapters;

import com.example.demohrms.core.services.verification.VerifyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailVerifyCodeAdapter implements VerifyCode {

    @Autowired
    private JavaMailSender emailSender;

    public void sendVerifyCodeToEmail(String toEmail , String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@baeldung.com");
        message.setTo(toEmail);
        message.setSubject("Email Dogrulama");
        message.setText(text);
        emailSender.send(message);
        System.out.println("Sended");

    }
}
