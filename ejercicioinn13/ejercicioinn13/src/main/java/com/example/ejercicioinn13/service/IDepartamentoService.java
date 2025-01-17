package com.example.ejercicioinn13.service;

import com.example.ejercicioinn13.entity.Departamento;
import com.example.ejercicioinn13.response.DepartamentoResponse;

import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    public List<Departamento> readAll();
    public Optional<Departamento> readById(Long id);
    public DepartamentoResponse create(Departamento departamento);
    public Departamento update(Departamento departamento);
    public String delete(Departamento departamento);
    public List<Departamento> findByM2LessThan(Long m2);
    public List<Departamento> precioAndM2(Double precio, Long m2);
}
