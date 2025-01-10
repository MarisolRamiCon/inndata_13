package com.example.ejercicioinn13.service.impl;

import com.example.ejercicioinn13.entity.Persona;
import com.example.ejercicioinn13.repository.PersonaRepository;
import com.example.ejercicioinn13.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepository personaRepository;
    @Override
    public List<Persona> readAll() {
        return personaRepository.findAll();
    }
}
