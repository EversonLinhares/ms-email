package com.ms.email.controllers;

import com.ms.email.services.EmailService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
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