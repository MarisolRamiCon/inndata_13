package com.example.ejercicioinn13.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "departamento2")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //esta línea debe de existir cuando le colocamos el auto_increment
    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "m2")
    private Integer m2;

    @Column(name = "precio")
    private Double precio;

    public Departamento(Integer idDepartamento, Integer m2, Double precio) {
        this.idDepartamento = idDepartamento;
        this.m2 = m2;
        this.precio = precio;
    }

    public Departamento() {
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
