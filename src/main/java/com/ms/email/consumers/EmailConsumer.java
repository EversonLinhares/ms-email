package com.ms.email.consumers;

import com.ms.email.api.dto.request.EmailRequestDto;
import com.ms.email.domain.model.Email;
import com.ms.email.domain.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailRequestDto emailRequestDto){
        Email email = new Email();
        BeanUtils.copyProperties(emailRequestDto, email);
        emailService.sendEmail(email);
    }
}
