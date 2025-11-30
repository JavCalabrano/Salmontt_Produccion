package org.example.model;

import org.example.model.entidad.Empleado;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase exclusiva para ser superclase de los distintos tipos de Centro o UnidadesOpertivas de la organización Salmontt
 */

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
        return "Nombre: " + nombre + getTipo() +
                "\nNro Empleados=" + cantidadEmpleados + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    // Metodo creado para sobre carga e identificación de objetos en tiempo de compilación
    public String getTipo() {
        return "tipo";
        // el valor "tipo" esta asignado por defecto / se reemplazará mediante proceso de sobrecarga en clases herederas
    }

}

