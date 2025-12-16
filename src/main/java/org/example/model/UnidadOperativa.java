package org.example.model;

import org.example.model.entidad.Empleado;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase exclusiva para ser superclase de los distintos tipos de Centro o UnidadesOpertivas de la organización Salmontt
 */

public class UnidadOperativa implements Registrable {

    private String nombre;
    private Direccion direccion;
    private int cantidadEmpleados;
    private List<Empleado> empleados = new ArrayList<>();


    public UnidadOperativa(String  nombre, Direccion direccion, int cantidadEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String mostrarResumen() {
        return "";
    }

    @Override
    public String getTipoEntidad() {
        return "";
    }

    @Override
    public String getNombreCompletoEntidad() {
        return "";
    }

    @Override
    public String getRut() {
        return "";
    }

    @Override
    public int getTelefono() {
        return 0;
    }

    @Override
    public String getEmail() {
        return "";
    }
}

