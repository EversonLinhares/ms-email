package com.ms.email.controllers;

import com.ms.email.models.Smtp;
import com.ms.email.repositories.SmtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/smtp")
public class SmtpController {

    @Autowired
    SmtpRepository smtpRepository;

    @GetMapping
    public List<Smtp> findAll(){
        return smtpRepository.findAll();
    }
}
