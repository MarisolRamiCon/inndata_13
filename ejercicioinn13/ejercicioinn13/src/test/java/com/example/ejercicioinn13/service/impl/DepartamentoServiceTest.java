package com.example.ejercicioinn13.service.impl;

import com.example.ejercicioinn13.repository.DepartamentoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

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

    }
}