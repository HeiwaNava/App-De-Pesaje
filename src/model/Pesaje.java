package src.model;

import java.time.LocalDateTime;

public class Pesaje {
    private double peso;
    private String producto;
    private LocalDateTime fecha;

    public Pesaje(double peso, String producto) {
        this.peso = peso;
        this.producto = producto;
        this.fecha = LocalDateTime.now();
    }

    public double getPeso() {
        return peso;
    }

    public String getProducto() {
        return producto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return producto + " - " + peso + " kg - " + fecha;
    }
}