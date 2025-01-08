package com.example.ejercicioinn13.service;

import com.example.ejercicioinn13.entity.Departamento;

import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    public List<Departamento> readAll();
    public Optional<Departamento> readById(int id);
    public Departamento create(Departamento departamento);
    public Departamento update(Departamento departamento);
    public void delete(Departamento departamento);
}
