package com.example.ejercicioinn13.controller;

import com.example.ejercicioinn13.entity.Persona;
import com.example.ejercicioinn13.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v4")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> readAll(){
        return personaService.readAll();
    }
}
