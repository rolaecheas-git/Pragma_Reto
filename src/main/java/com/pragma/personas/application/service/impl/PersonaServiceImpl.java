package com.pragma.personas.application.service.impl;

import com.pragma.personas.application.service.PersonaService;
import com.pragma.personas.domain.model.Persona;
import com.pragma.personas.domain.ports.PersonaRepositoryPort;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepositoryPort personaRepository;

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepository.guardar(persona);
    }

    @Override
    public Optional<Persona> obtenerPersona(String id) {
        return personaRepository.buscarPorId(id);
    }
}
