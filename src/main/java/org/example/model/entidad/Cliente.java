package org.example.model.entidad;

import org.example.model.Direccion;
import org.example.model.Producto;
import org.example.model.Registrable;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona implements Registrable {

    private List<Producto> carrito = new ArrayList<>();

    public Cliente(String nombre, String apellido, String rutId, Direccion direccion, int telefono, String email) {
        super(nombre, apellido, rutId, direccion, telefono, email);
    }

    @Override
    public String mostrarResumen() {
        return nombrePersona() +
                "\nContacto: " + getTelefono() + "/" +  getEmail() + "\n" +
                "Carrito: " + carrito + "\n";
    }

    @Override
    public String getTipoEntidad() {
        return "Cliente";
    }

    @Override
    public String getNombreCompletoEntidad() {
        return getNombre() + " " + getApellido();
    }
}
