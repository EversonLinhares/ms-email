package com.ms.email.dto.response;

import com.ms.email.enums.StatusEmailEnum;
import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailResponseDto {

    @NotBlank
    private String ownerRef;
    @Email
    @NotBlank
    private String emailFrom;
    @Email
    @NotBlank
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
    private StatusEmailEnum statusEmailEnum;


}
