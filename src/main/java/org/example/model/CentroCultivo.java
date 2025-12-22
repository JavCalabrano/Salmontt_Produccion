package org.example.model;

public class CentroCultivo extends UnidadOperativa {

    private double toneladasProduccion;

    // === CONSTRUCTOR ===
    public CentroCultivo(String nombre, Direccion direccion, int cantidadEmpleados, double toneladasProduccion) {
        super(nombre, direccion, cantidadEmpleados);
        this.toneladasProduccion = toneladasProduccion;
    }

    // === METODOS ===
    @Override
    public String getTipo() {
        return "Centro Cultivo";
    }


}
