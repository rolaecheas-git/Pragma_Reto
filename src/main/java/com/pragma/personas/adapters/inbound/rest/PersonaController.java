package com.pragma.personas.adapters.inbound.rest;

import com.pragma.personas.application.service.PersonaService;
import com.pragma.personas.domain.model.Persona;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonaController {

    @Autowired
	private  PersonaService personaService;

    @PostMapping
    public ResponseEntity<Persona> guardarPersona(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.guardarPersona(persona));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> consultarPersona(@PathVariable String id) {
        return personaService.obtenerPersona(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
