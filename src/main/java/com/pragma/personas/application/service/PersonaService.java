package com.pragma.personas.application.service;

import com.pragma.personas.domain.model.Persona;

import java.util.Optional;

public interface PersonaService {
    Persona guardarPersona(Persona persona);
    Optional<Persona> obtenerPersona(String id);
}
