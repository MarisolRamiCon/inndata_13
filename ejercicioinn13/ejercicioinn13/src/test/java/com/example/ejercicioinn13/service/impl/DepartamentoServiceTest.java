package com.example.ejercicioinn13.service.impl;

import com.example.ejercicioinn13.entity.Departamento;
import com.example.ejercicioinn13.repository.DepartamentoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
@Slf4j
class DepartamentoServiceTest {
    @InjectMocks
    DepartamentoService departamentoService;

    @Mock
    DepartamentoRepository departamentoRepository;

    @BeforeEach
    void setUp() {
        log.info("BeforeEach setUp()");
    }

    @AfterEach
    void tearDown() {
        log.info("AfterEach tearDown ");
    }

    @Test
    void sumar() {
        double resultado=departamentoService.sumar(5.0,7.0,3.0); //15
        Assertions.assertEquals(15.0,resultado);
        log.info("Sumando");


    }

    @Test
    void delete() {
        Departamento departamento= new Departamento(4L,700L,5000.0,true);
        Mockito.when(departamentoRepository.findById(4L)).
                thenReturn(Optional.of(departamento));
        departamento.setActive(false);
        Mockito.when(departamentoRepository.save(departamento)).thenReturn(departamento);
        String res= departamentoService.delete(departamento);
        Assertions.assertEquals("El departamento ha sido borrado satisfactoriamente",res);
    }

    @Test
    void deleteElse() {
        Departamento departamento= new Departamento(8L,800L,8000.0,true);
        Mockito.when(departamentoRepository.findById(8L)).
                thenReturn(Optional.ofNullable(null));
        //Mockito.when(departamentoRepository.save(departamento)).thenReturn(departamento);
        String res= departamentoService.delete(departamento);
        Assertions.assertEquals("El departamento no existe",res);
    }


}