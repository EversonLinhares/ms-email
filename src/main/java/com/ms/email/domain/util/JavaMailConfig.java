package com.ms.email.domain.util;

import org.springframework.mail.javamail.JavaMailSender;

public interface JavaMailConfig {

     JavaMailSender getJavaMailSender(String host, Integer port, String userName, String userPassword);


}
