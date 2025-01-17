package com.example.ejercicioinn13.service.impl;


import com.example.ejercicioinn13.entity.Departamento;
import com.example.ejercicioinn13.repository.DepartamentoRepository;
import com.example.ejercicioinn13.response.DepartamentoResponse;
import com.example.ejercicioinn13.service.IDepartamentoService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DepartamentoService implements IDepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;
    @Override
    public List<Departamento> readAll() {

        return departamentoRepository.findAll().stream().filter(departamento -> departamento.getActive()==true).toList();
    }

    @Override
    public Optional<Departamento> readById(Long id) {
        Optional<Departamento> departamento= departamentoRepository.findById(id);

        return departamento;
    }

    @Override
    public DepartamentoResponse create(Departamento departamento) {
        departamentoRepository.save(departamento);
        DepartamentoResponse departamentoResponse = new DepartamentoResponse(departamento.getIdDepartamento(),departamento.getPrecio());
        return departamentoResponse;
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public String delete(Departamento departamento) {
        Optional<Departamento> departamentoOptional= departamentoRepository.findById(departamento.getIdDepartamento());
        if(departamentoOptional.isPresent()){
            Departamento departamentoABorrar=departamentoOptional.get();
            departamentoABorrar.setActive(false);
            try {
                departamentoRepository.save(departamentoABorrar);
                log.info("El departamento ha sido borrado");
                return "El departamento ha sido borrado satisfactoriamente";
            }catch (Exception e){

                log.error("Error "+e.getMessage());
                log.error("Rastreo: " + e.getStackTrace());
                return "Hubo un error con la base de datos";
            }
        }else{
            log.info("El departamento no existe");
            return "El departamento no existe";
        }

    }

    public List<Departamento> findByM2LessThan(Long m2){
        return departamentoRepository.findByM2LessThan(m2);
    }

    @Override
    public List<Departamento> precioAndM2(Double precio, Long m2) {
        return departamentoRepository.precioAndM2(precio, m2);
    }

    public Double sumar(Double... numeros){
        double suma=0;
        for(Double numero:numeros){
            suma+=numero;
        }
        return suma;
    }


}
