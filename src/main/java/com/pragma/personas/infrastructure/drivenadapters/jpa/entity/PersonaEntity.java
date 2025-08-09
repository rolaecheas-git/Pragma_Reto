package com.pragma.personas.infrastructure.drivenadapters.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonaEntity {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    private String nombre;
    private String email;
}
