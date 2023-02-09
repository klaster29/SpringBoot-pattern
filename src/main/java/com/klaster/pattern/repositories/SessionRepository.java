package com.klaster.pattern.repositories;

import com.klaster.pattern.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
