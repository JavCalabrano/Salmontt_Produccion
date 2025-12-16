package org.example.model;

public class CentroCultivo extends UnidadOperativa implements Registrable {

    private double toneladasProduccion;


    public CentroCultivo(String nombre, Direccion direccion, int cantidadEmpleados, double toneladasProduccion) {
        super(nombre, direccion, cantidadEmpleados);
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public String mostrarResumen() {
        return getNombre() + "/" + getTipoEntidad() + "\n" +
                "Toneladas producidas: " + toneladasProduccion + "\n";
    }

    public String getTipoEntidad() {
        return "Centro Cultivo";
    }
}
