package com.example.ejercicioinn13.service;

import com.example.ejercicioinn13.response.Viaje;

import java.util.List;

public interface IViajeService {
    public List<Viaje> readAll();
    public Viaje create(Viaje viaje);
}
