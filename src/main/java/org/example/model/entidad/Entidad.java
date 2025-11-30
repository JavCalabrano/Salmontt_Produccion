package org.example.model.entidad;

import org.example.model.Direccion;

public abstract class Entidad {

    private String nombre;
    private String rutId;
    private Direccion direccion;
    private int telefono;
    private String email;

    public Entidad(String nombre, String rutId, Direccion direccion, int telefono, String email) {
        this.nombre = nombre;
        this.rutId = rutId;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDireccion:" + direccion +
                "\nContacto: " + telefono + " / " + email +"\n";
    }

    public String getNombre() {
        return nombre;
    }
}
