package com.example.ejercicioinn13.repository;

import com.example.ejercicioinn13.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {
    public List<Departamento> findByM2LessThan(Long m2);
    public List<Departamento> findByM2LessThanAndPrecioLessThan(Double precio, Long m2);

    @Query(value = "select * from departamento where precio<:precio and m2<:m2;", nativeQuery = true) //Indicar que vamos a hacer una consulta
    public List<Departamento> precioAndM2 (Double precio,Long m2);
}
