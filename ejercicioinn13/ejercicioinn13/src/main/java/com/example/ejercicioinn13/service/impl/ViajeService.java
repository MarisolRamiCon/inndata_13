package com.example.ejercicioinn13.service.impl;

import com.example.ejercicioinn13.feign.ViajeClient;
import com.example.ejercicioinn13.response.Viaje;
import com.example.ejercicioinn13.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeService implements IViajeService {
    @Autowired
    ViajeClient viajeC;
    @Override
    public List<Viaje> readAll() {
        return viajeC.getData();
    }

    @Override
    public Viaje create(Viaje viaje) {
        return viajeC.postData();
    }
}
