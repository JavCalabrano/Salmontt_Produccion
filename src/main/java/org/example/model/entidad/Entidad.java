package org.example.model.entidad;

import org.example.model.Direccion;
import org.example.model.Registrable;

public class Entidad implements Registrable {

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

    public String getRut() {
        return rutId;
    }


    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String mostrarResumen() {
        return "";
    }

    public String getTipoEntidad() {
        return "";
    }

    @Override
    public String getNombreCompletoEntidad() {
        return "";
    }
}
