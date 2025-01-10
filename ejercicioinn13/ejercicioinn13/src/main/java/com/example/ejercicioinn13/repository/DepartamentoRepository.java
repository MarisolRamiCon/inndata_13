package com.example.ejercicioinn13.repository;

import com.example.ejercicioinn13.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {
    public List<Departamento> findByM2(Long m2);

}
