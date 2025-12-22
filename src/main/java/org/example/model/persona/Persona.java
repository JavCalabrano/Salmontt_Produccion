package org.example.model.persona;

import org.example.model.Direccion;

public class Persona {

    // ATRIBUTOS
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String rutId;
    private Direccion direccion;
    private int telefono;
    private String email;


    // CONSTRUCTOR
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String rutId, Direccion Direccion, int telefono, String email) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rutId = rutId;
        this.direccion = Direccion;
        this.telefono = telefono;
        this.email = email;
    }


    // SECCION GETTERS
    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRutId() {
        return rutId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
