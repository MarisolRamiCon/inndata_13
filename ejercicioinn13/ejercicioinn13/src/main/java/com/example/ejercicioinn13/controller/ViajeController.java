package com.example.ejercicioinn13.controller;

import com.example.ejercicioinn13.response.Viaje;
import com.example.ejercicioinn13.service.impl.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v4")
public class ViajeController {
    @Autowired
    ViajeService viajeService;
    @GetMapping("/viajs")
    public List<Viaje> readAll(){
        return viajeService.readAll();
    }
    @PostMapping("/viajs")
    public Viaje create(@RequestBody Viaje viaje){
        return viajeService.create(viaje);
    }
}
