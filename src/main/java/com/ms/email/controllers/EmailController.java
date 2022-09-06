package com.ms.email.controllers;

import com.ms.email.dto.request.EmailRequestDto;
import com.ms.email.dto.response.EmailResponseDto;
import com.ms.email.models.Email;
import com.ms.email.services.EmailService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;
    private final ModelMapper modelMapper;


    @PostMapping
    public ResponseEntity<EmailResponseDto> sendingEmail(@RequestBody @Valid EmailRequestDto emailRequestDto){
        Email email = new Email();
        BeanUtils.copyProperties(emailRequestDto, email);
        return ResponseEntity.ok().body(modelMapper.map(emailService.sendEmail(email), EmailResponseDto.class));
    }
}
