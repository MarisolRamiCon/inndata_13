package com.example.ejercicioinn13.controller;

import com.example.ejercicioinn13.entity.Departamento;
import com.example.ejercicioinn13.response.DepartamentoResponse;
import com.example.ejercicioinn13.service.impl.DepartamentoService;
import jakarta.websocket.server.PathParam;
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
    public Optional<Departamento> readById(@PathVariable Long id){
        return departamentoService.readById(id);
    }

    @GetMapping("/departamento")
    public List<Departamento> findByM2(@PathParam("m2") Long m2){
        return departamentoService.findByM2(m2);
    }
//Post es para create y el put es para update
    @PostMapping("/departamentos")
    public DepartamentoResponse create(@RequestBody Departamento departamento){
        return departamentoService.create(departamento);
    }

    @PutMapping("/departamentos")
    public Departamento update(@RequestBody Departamento departamento){
        return departamentoService.update(departamento);
    }

    @DeleteMapping("/departamentos")
    public void delete(@RequestBody Departamento departamento){
        departamentoService.delete(departamento);
    }




}
