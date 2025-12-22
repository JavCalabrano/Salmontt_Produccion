package org.example.model.persona;

import org.example.model.Direccion;
import org.example.model.Producto;
import org.example.interfaces.Registrable;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona implements Registrable {

    private List<Producto> carrito = new ArrayList<>();
    private boolean credito;
    private int nroTarjeta;

    // CONSTRUCTORES
    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String rutId, Direccion direccion, int telefono, String email,
                   List<Producto> carrito, boolean credito, int nroTarjeta) {
        super(nombre, apellidoPaterno, apellidoMaterno, rutId, direccion, telefono, email);
        this.carrito = carrito;
        this.credito = false;
        this.nroTarjeta = nroTarjeta;
    }

    public Cliente (String nombre, String apellidoPaterno, String apellidoMaterno, String rutId, Direccion direccion, int telefono, String email) {
        super(nombre, apellidoPaterno, apellidoMaterno, rutId, direccion, telefono, email);
    }


    // METODOS REGISTRABLE
    @Override
    public String nombreCompleto() {
        return  getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno();
    }

    @Override
    public String identidad() {
        return nombreCompleto() + " | Rut: " + getRutId();
    }

    @Override
    public String metodoContacto() {
        return "Contacto: " + getEmail() + " | " + getTelefono();
    }
}
