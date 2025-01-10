package com.example.ejercicioinn13.repository;

import com.example.ejercicioinn13.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {

}
