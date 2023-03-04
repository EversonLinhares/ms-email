package com.ms.email.domain.repository;

import com.ms.email.domain.model.Smtp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmtpRepository extends JpaRepository<Smtp,Long> {
}
