package com.example.ejercicioinn13.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
/*@Table(name = "departamento")
@AllArgsConstructor //Constructor con todos los argumentos
@NoArgsConstructor //Metodo constructor sin argumentos
@Data //Getter y Setter*/

public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //esta línea debe de existir cuando le colocamos el auto_increment
    @Column(name = "id_departamento")
    private Long idDepartamento;

    @Column(name = "m2")
    private Long m2;

    @Column(name = "precio")
    private Double precio;

    @Column(name="is_active")
    private Boolean isActive=true;

    public Departamento() {
    }

    public Departamento(Long idDepartamento, Long m2, Double precio, Boolean isActive) {
        this.idDepartamento = idDepartamento;
        this.m2 = m2;
        this.precio = precio;
        this.isActive = isActive;
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Long getM2() {
        return m2;
    }

    public void setM2(Long m2) {
        this.m2 = m2;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
