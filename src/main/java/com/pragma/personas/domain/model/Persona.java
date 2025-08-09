package com.pragma.personas.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Persona {
    private String id;
    private String nombre;
    private String email;
}
