package org.example.model.persona;

import org.example.model.Direccion;
import org.example.interfaces.Registrable;
import org.example.model.UnidadOperativa;
import org.w3c.dom.ls.LSOutput;

/**
 * Esta clase hereda de Entidad para tomar sus atributos básicos y se distancia de organizaciones para centrarse en individuos que colaboran con Salmontt
 */
public class Empleado extends Persona implements Registrable {

    private String cargo;
    private int salario;
    private UnidadOperativa unidadOperativa;

    // CONSTRUCTOR
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String rutId, Direccion direccion, int telefono, String email,
                    String cargo, int salario, UnidadOperativa unidadOperativa) {
        super(nombre, apellidoPaterno, apellidoMaterno, rutId, direccion, telefono, email);
        this.cargo = cargo;
        this.salario = salario;
        this.unidadOperativa = unidadOperativa;
    }



    // METODOS REGISTRABLE
    @Override
    public String nombreCompleto() {
        return getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno();
    }

    @Override
    public String identidad() {
        return nombreCompleto() + " | Rut: " + getRutId();
    }

    @Override
    public String metodoContacto() {
        return "Contacto: " + getEmail() + " | " + getTelefono();
    }

    @Override
    public Direccion getDireccion() {
        return super.getDireccion();
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }

    public String getUnidadOperativa() {
        return unidadOperativa.getTipo();
    }



}
