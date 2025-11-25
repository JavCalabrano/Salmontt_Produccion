package org.example.model.entidad;

import org.example.model.CentroCultivo;
import org.example.model.Direccion;
import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Entidad{

    private String descripcion;
    private List<Producto> productos = new ArrayList<>();

    public Empresa(String nombre, String rutId, Direccion direccion, int telefono, String email, String descripcion) {
        super(nombre, rutId, direccion, telefono, email);
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Descripcion='" + descripcion + "\n\n";
    }
}
