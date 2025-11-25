package org.example.model.entidad;

import org.example.model.Direccion;

public class Persona extends Entidad {

    private String apellido;

    public Persona(String nombre, String apellido, String rutId, Direccion direccion, int telefono, String correo) {
        super(nombre, rutId, direccion, telefono, correo);
        this.apellido = apellido;
    }

    public String nombrePersona() {
        return "Nombre: " + getNombre() + " " + apellido;
    }
}
