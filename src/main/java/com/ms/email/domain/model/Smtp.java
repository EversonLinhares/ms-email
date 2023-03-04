package com.ms.email.domain.model;

import com.ms.email.domain.enums.StatusSmtpEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_smtp")
public class Smtp {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String mail_host;
    private String mail_port;
    private String mail_username;
    private String mail_password;
    private String mail_from;
    private StatusSmtpEnum statusSmtpEnum;
}
