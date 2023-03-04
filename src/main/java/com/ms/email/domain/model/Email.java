package com.ms.email.domain.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ms.email.domain.enums.StatusEmailEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_email")
public class Email implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ownerRef;
    private String emailFrom;
    @JsonSerialize
    @ElementCollection
    private List<String> emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private ZonedDateTime sendDateEmail;
    private StatusEmailEnum statusEmail;


}
