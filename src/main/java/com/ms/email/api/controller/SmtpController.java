package com.ms.email.api.controller;

import com.ms.email.domain.model.Smtp;
import com.ms.email.domain.repository.SmtpRepository;
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
