package com.example.ejercicioinn13.response;



public class DepartamentoResponse {
    private Long idDepartamento;
    private Double precio;

    public DepartamentoResponse(Long idDepartamento, Double precio) {
        this.idDepartamento = idDepartamento;
        this.precio = precio;
    }

    public DepartamentoResponse() {
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
