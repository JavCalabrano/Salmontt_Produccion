package org.example.model;

import org.example.model.persona.Empleado;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase exclusiva para ser superclase de los distintos tipos de Centro o UnidadesOpertivas de la organización Salmontt
 */

public class UnidadOperativa {

    private String nombre;
    private Direccion direccion;
    private int cantidadEmpleados;


    // === CONSTRUCTOR ===
    public UnidadOperativa(String  nombre, Direccion direccion, int cantidadEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadEmpleados = cantidadEmpleados;
    }


    // === GETTERS ===
    public String getNombre() {
        return nombre;
    }



    // === METODOS ===
    public String getTipo() {
        return "Tipo";
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }
}

