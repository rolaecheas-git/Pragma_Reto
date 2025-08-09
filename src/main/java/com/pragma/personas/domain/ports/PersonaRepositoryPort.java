package com.pragma.personas.domain.ports;

import com.pragma.personas.domain.model.Persona;

import java.util.Optional;

public interface PersonaRepositoryPort {
    Persona guardar(Persona persona);
    Optional<Persona> buscarPorId(String id);
}
