package org.example.model.entidad;

import org.example.model.CentroCultivo;
import org.example.model.Direccion;

public class Empleado extends Persona{

    private String cargo;
    private int salario;
    private String nombreCentro;

    public Empleado(String nombre, String apellido, String rutId, Direccion direccion, int telefono, String email, String cargo, int salario, String nombreCentro) {
        super(nombre, apellido, rutId, direccion, telefono, email);
        this.cargo = cargo;
        this.salario = salario;
        this.nombreCentro = nombreCentro;
    }

    @Override
    public String toString() {
        return nombrePersona() + "\n" +
                "Cargo='" + cargo + '\'' + nombrePersona() + "\n";
    }

    public String getNombreCentro() {
        return nombreCentro;
    }
}
