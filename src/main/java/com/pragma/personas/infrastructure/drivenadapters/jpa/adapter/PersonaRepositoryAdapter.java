package com.pragma.personas.infrastructure.drivenadapters.jpa.adapter;

import com.pragma.personas.domain.model.Persona;
import com.pragma.personas.domain.ports.PersonaRepositoryPort;
import com.pragma.personas.infrastructure.drivenadapters.jpa.entity.PersonaEntity;
import com.pragma.personas.infrastructure.drivenadapters.jpa.repository.PersonaJpaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PersonaRepositoryAdapter implements PersonaRepositoryPort {

    @Autowired
	private  PersonaJpaRepository personaJpaRepository;

    @Override
    public Persona guardar(Persona persona) {
        PersonaEntity entity = toEntity(persona);
        return toDomain(personaJpaRepository.save(entity));
    }

    @Override
    public Optional<Persona> buscarPorId(String id) {
        return personaJpaRepository.findById(id)
                .map(this::toDomain);
    }

    private PersonaEntity toEntity(Persona persona) {
        return PersonaEntity.builder()
                .id(persona.getId())
                .nombre(persona.getNombre())
                .email(persona.getEmail())
                .build();
    }

    private Persona toDomain(PersonaEntity entity) {
        return Persona.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .email(entity.getEmail())
                .build();
    }
}
