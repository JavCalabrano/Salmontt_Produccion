package org.example.model.persona;

import org.example.model.Direccion;
import org.example.model.Producto;
import org.example.interfaces.Registrable;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que hereda de Entidad atributos caracteristicos de si mismos
 */

public class Proveedores implements Registrable {

    // Atributo de descripcion de los servicios que cada empresa, no tiene limitacion de extension pero se recomienda acotacion en el documento de información
    private String nombre;
    private String rutId;
    private Direccion direccion;
    private int telefono;
    private String email;
    private String descripcion;
    private List<Producto> productos = new ArrayList<>();

    // CONSTRUCTORES
    public Proveedores(String nombre, String rutId, Direccion direccion, int telefono, String email, String descripcion, List<Producto> productos) {
        this.nombre = nombre;
        this.rutId = rutId;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.descripcion = descripcion;
        this.productos = productos;
    }

    public Proveedores(String nombre, String rutId, Direccion direccion, int telefono, String email, String descripcion) {
        this.nombre = nombre;
        this.rutId = rutId;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.descripcion = descripcion;
    }


    // METODOS REGISTRABLE
    @Override
    public String nombreCompleto() {
        return "Nombre: " + nombre;
    }

    @Override
    public String identidad() {
        return nombre + " | Rut: " + rutId;
    }

    @Override
    public String metodoContacto() {
        return "Contacto: " + email + " | " + telefono;
    }

    // === GETTERS ===

    public String getNombre() {
        return nombre;
    }

    public String getRutId() {
        return rutId;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
