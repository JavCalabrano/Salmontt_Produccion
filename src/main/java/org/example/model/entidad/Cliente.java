package org.example.model.entidad;

import org.example.model.Direccion;
import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{

    private List<Producto> carrito = new ArrayList<>();

    public Cliente(String nombre, String apellido, String rutId, Direccion direccion, int telefono, String email) {
        super(nombre, apellido, rutId, direccion, telefono, email);
    }

    @Override
    public String toString() {
        return nombrePersona() +
                " / Carrito: " + carrito + "\n";
    }
}
