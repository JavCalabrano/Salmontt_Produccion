package org.example.model.entidad;

import org.example.model.Direccion;
import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que hereda de Entidad atributos caracteristicos de si mismos
 */

public class Empresa extends Entidad{

    // Atributo de descripcion de los servicios que cada empresa, no tiene limitacion de extension pero se recomienda acotacion en el documento de información
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

    public String getDescripcion() {
        return descripcion;
    }

}
