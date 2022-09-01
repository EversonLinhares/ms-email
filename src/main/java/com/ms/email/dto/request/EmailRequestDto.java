package com.ms.email.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequestDto {

    @NotBlank
    private String ownerRef;
    @Email
    @NotBlank
    private String emailFrom;
    private List<@Email @NotBlank String> emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

}
