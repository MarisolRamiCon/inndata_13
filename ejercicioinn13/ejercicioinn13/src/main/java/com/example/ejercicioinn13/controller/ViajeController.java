package com.example.ejercicioinn13.controller;

import com.example.ejercicioinn13.response.Viaje;
import com.example.ejercicioinn13.service.impl.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v4")
public class ViajeController {
    @Autowired
    ViajeService viajeService;
    @GetMapping("/viajes")
    public List<Viaje> readAll(){
        return viajeService.readAll();
    }
}
