package org.example.model;

public class CentroCultivo extends UnidadOperativa {

    private double toneladasProduccion;


    public CentroCultivo(String nombre, Direccion direccion, int cantidadEmpleados, double toneladasProduccion) {
        super(nombre, direccion, cantidadEmpleados);
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public String toString() {
        return super.toString() + "Toneladas producidas: " + toneladasProduccion + "\n";

    }
}
