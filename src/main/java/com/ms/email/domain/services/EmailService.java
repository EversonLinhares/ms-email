package com.ms.email.domain.services;

import com.ms.email.domain.enums.StatusEmailEnum;
import com.ms.email.domain.model.Email;
import com.ms.email.domain.model.Smtp;
import com.ms.email.domain.repository.EmailRepository;
import com.ms.email.domain.repository.SmtpRepository;
import com.ms.email.domain.services.exception.EmailErrorException;
import com.ms.email.domain.util.JavaMailConfigImpl;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.time.ZonedDateTime;
import javax.mail.internet.InternetAddress;

@Service
@AllArgsConstructor
public class EmailService {

    private final EmailRepository emailRepository;

    private final JavaMailConfigImpl javaMailConfig;

    private final SmtpRepository smtpRepository;

    public Email sendEmail(Email email) {
        Smtp smtpBanco = smtpRepository.findAll().get(0);
        email.setSendDateEmail(ZonedDateTime.now());
        JavaMailSender javaMail = javaMailConfig.getJavaMailSender(smtpBanco.getMail_host(),
                Integer.valueOf(smtpBanco.getMail_port()),
                smtpBanco.getMail_username(),
                smtpBanco.getMail_password());

        try {
            String [] to = email.getEmailTo().stream().toArray(String []::new);
            MimeMessage mimeMessage = javaMail.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
            if(email.getEmailFrom().isEmpty()){
                helper.setFrom(smtpBanco.getMail_from());
            }else{
                helper.setFrom(new InternetAddress(smtpBanco.getMail_from(),email.getEmailFrom()));
            }
            helper.setFrom(email.getEmailFrom());
            helper.setTo(to);
            helper.setSubject(email.getSubject());
            helper.setText(email.getText());
            javaMail.send(mimeMessage);
            email.setStatusEmail(StatusEmailEnum.SENT);
        }
        catch (MessagingException | MailException | UnsupportedEncodingException e){
            e.printStackTrace();
            email.setStatusEmail(StatusEmailEnum.ERROR);
            throw new EmailErrorException("Não foi possível realizar o envio de email tente mais tarde!");
        }
        return emailRepository.save(email);
    }

}
