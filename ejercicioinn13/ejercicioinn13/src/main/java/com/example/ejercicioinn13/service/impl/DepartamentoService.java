package com.example.ejercicioinn13.service.impl;

import com.example.ejercicioinn13.entity.Departamento;
import com.example.ejercicioinn13.repository.DepartamentoRepository;
import com.example.ejercicioinn13.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService implements IDepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;
    @Override
    public List<Departamento> readAll() {

        return departamentoRepository.findAll();
    }

    @Override
    public Optional<Departamento> readById(int id) {
        Optional<Departamento> departamento= departamentoRepository.findById(id);
        return departamento;
    }

    @Override
    public Departamento create(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public void delete(Departamento departamento) {
        departamentoRepository.delete(departamento);
    }


}
