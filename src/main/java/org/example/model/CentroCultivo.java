package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class CentroCultivo {

    private String nombre;
    private String comuna;
    private int produccion;

    public CentroCultivo(String nombre, String comuna, int produccion) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.produccion = produccion;
    }

    @Override
    public String toString() {
        return "Sede: " + nombre + " " +
                "Producción: " + produccion + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public int getProduccion() {
        return produccion;
    }
}

