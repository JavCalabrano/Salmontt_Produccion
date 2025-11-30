package org.example.model;

public class PlantaProceso extends UnidadOperativa{

    private double capacidadProcesamiento;

    public PlantaProceso(String nombre, Direccion direccion, int cantidadEmpleados, double capacidadProcesamiento) {
        super(nombre, direccion, cantidadEmpleados);
        this.capacidadProcesamiento = capacidadProcesamiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Capacidad procesamiento: " + capacidadProcesamiento + "\n";
    }
}
