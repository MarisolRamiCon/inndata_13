package com.example.ejercicioinn13.controller;

import com.example.ejercicioinn13.entity.Departamento;
import com.example.ejercicioinn13.service.impl.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v4")
public class DepartamentoController {
    @Autowired //Inyección de dependencia
    DepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public List<Departamento> readAll(){
        return departamentoService.readAll();
    }
}
