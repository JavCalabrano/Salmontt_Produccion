package org.example.model;

import org.example.model.entidad.Empleado;

import java.util.ArrayList;
import java.util.List;

public class UnidadOperativa {

    private String nombre;
    private Direccion direccion;
    private int cantidadEmpleados;
    private List<Empleado> empleados = new ArrayList<>();


    public UnidadOperativa(String  nombre, Direccion direccion, int cantidadEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nNro Empleados=" + cantidadEmpleados + "\n";
    }

    public String getNombre() {
        return nombre;
    }

}

