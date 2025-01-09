package com.example.ejercicioinn13.controller;

import com.example.ejercicioinn13.entity.Departamento;
import com.example.ejercicioinn13.service.impl.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v4")
public class DepartamentoController {
    @Autowired //Inyección de dependencia
    DepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public List<Departamento> readAll(){

        return departamentoService.readAll();
    }

    @GetMapping("/departamento/{id}")
    public Optional<Departamento> readById(@PathVariable int id){
        return departamentoService.readById(id);
    }
//Post es para create y el put es para update
    @PostMapping("/departamentos")
    public Departamento create(@RequestBody Departamento departamento){
        return departamentoService.create(departamento);
    }

    @PutMapping("/departamentos")
    public Departamento update(@RequestBody Departamento departamento){
        return departamentoService.create(departamento);
    }

    @DeleteMapping("/departamentos")
    public void delete(@RequestBody Departamento departamento){
        departamentoService.delete(departamento);
    }


}
