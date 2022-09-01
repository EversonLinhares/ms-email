package com.ms.email.repositories;

import com.ms.email.models.Smtp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmtpRepository extends JpaRepository<Smtp,Long> {
}
