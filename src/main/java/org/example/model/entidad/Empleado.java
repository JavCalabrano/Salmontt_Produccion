package org.example.model.entidad;

import org.example.model.Direccion;
import org.example.model.Registrable;

/**
 * Esta clase hereda de Entidad para tomar sus atributos básicos y se distancia de organizaciones para centrarse en individuos que colaboran con Salmontt
 */
public class Empleado extends Persona implements Registrable {

    private String cargo;
    private int salario;
    private String nombreCentro;

    public Empleado(String nombre, String apellido, String rutId, Direccion direccion, int telefono, String email, String cargo, int salario, String nombreCentro) {
        super(nombre, apellido, rutId, direccion, telefono, email);
        this.cargo = cargo;
        this.salario = salario;
        this.nombreCentro = nombreCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    @Override
    public String mostrarResumen() {
        return nombrePersona() + "\n" +
                "Cargo=" + cargo + "/" + getNombreCentro() + "\n" +
                "Contacto: " + getTelefono() + "/" + getEmail() + "\n";
    }

    @Override
    public String getTipoEntidad() {
        return "Empleado";
    }

    @Override
    public String getNombreCompletoEntidad() {
        return getNombre() + " " + getApellido();
    }
}
