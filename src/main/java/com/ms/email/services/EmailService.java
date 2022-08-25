package com.ms.email.services;

import com.ms.email.enums.StatusEmailEnum;
import com.ms.email.models.Email;
import com.ms.email.repositories.EmailRepository;
import com.ms.email.services.exception.EmailErrorException;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
@AllArgsConstructor
public class EmailService {

    private final EmailRepository emailRepository;

    private final JavaMailSender javaMailSender;

    public Email sendEmail(Email email) {
        email.setSendDateEmail(ZonedDateTime.now());
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(email.getEmailFrom());
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());
            javaMailSender.send(message);

            email.setStatusEmail(StatusEmailEnum.SENT);
        }
        catch (MailException e){
            email.setStatusEmail(StatusEmailEnum.ERROR);
            throw new EmailErrorException("Não foi possível realizar o envio de email tente mais tarde!");
        }
        return emailRepository.save(email);
    }

}
