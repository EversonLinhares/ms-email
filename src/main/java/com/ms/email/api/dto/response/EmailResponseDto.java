package com.ms.email.api.dto.response;

import com.ms.email.domain.enums.StatusEmailEnum;
import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class EmailResponseDto {

    @NotBlank
    private String ownerRef;
    @Email
    @NotBlank
    private String emailFrom;
    private List<String> emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
    private StatusEmailEnum statusEmailEnum;


}
