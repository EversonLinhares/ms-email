package com.ms.email.controller;

import com.ms.email.api.controller.EmailController;
import com.ms.email.domain.services.EmailService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class EmailControllerTest {

    @InjectMocks
    EmailController emailController;

    @MockBean
    ModelMapper modelMapper;

    @MockBean
    EmailService emailService;


    @Test
    void showDoSendingEmail() {
    }
}