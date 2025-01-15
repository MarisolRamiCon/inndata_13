package com.example.ejercicioinn13.response;



import java.time.LocalDateTime;


public class Viaje {
    private Long id;
    private String destino;
    private Double precio;
    private LocalDateTime fechasalida;

    public Viaje() {
    }

    public Viaje(Long id, String destino, Double precio, LocalDateTime fechasalida) {
        this.id = id;
        this.destino = destino;
        this.precio = precio;
        this.fechasalida = fechasalida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(LocalDateTime fechasalida) {
        this.fechasalida = fechasalida;
    }
}
