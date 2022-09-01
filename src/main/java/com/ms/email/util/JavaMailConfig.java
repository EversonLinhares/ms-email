package com.ms.email.util;

import org.springframework.mail.javamail.JavaMailSender;

public interface JavaMailConfig {

     JavaMailSender getJavaMailSender(String host, Integer port, String userName, String userPassword);


}
