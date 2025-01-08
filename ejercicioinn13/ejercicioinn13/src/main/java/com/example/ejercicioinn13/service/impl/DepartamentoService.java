package com.example.ejercicioinn13.service.impl;

import com.example.ejercicioinn13.entity.Departamento;
import com.example.ejercicioinn13.repository.DepartamentoRepository;
import com.example.ejercicioinn13.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartamentoService implements IDepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;
    @Override
    public List<Departamento> readAll() {
        return departamentoRepository.findAll();
    }
}
