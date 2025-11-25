package org.example.model;

import org.example.model.entidad.Empleado;

import java.util.ArrayList;
import java.util.List;

public class CentroCultivo {

    private String nombre;
    private Direccion direccion;
    private int produccion;
    private int cantidadEmpleados;
    private List<Empleado> empleados = new ArrayList<>();

    public CentroCultivo(String nombre, Direccion direccion, int produccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.produccion = produccion;
    }

    public CentroCultivo(String  nombre, Direccion direccion, int produccion, int cantidadEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.produccion = produccion;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public String toString() {
        return "CentroCultivo: " + nombre +
                "\nDireccion: " + direccion +
                "\nProduccion: " + produccion +
                "\nNro Empleados=" + cantidadEmpleados + "\n\n";
    }

    public String getNombre() {
        return nombre;
    }

    public int getProduccion() {
        return produccion;
    }


}

