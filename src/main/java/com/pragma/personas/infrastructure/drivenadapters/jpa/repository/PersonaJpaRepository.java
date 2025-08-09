package com.pragma.personas.infrastructure.drivenadapters.jpa.repository;

import com.pragma.personas.infrastructure.drivenadapters.jpa.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaJpaRepository extends JpaRepository<PersonaEntity, String> {
}
