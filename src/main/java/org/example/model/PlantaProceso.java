package org.example.model;

/**
 * Clase dedicada a la especializacion de las plantas de proceso, es heredera de UnidadOperativa
 */

public class PlantaProceso extends UnidadOperativa {

    private double capacidadProcesamiento;

    // === CONSTRUCTOR ===
    public PlantaProceso(String nombre, Direccion direccion, int cantidadEmpleados, double capacidadProcesamiento) {
        super(nombre, direccion, cantidadEmpleados);
        this.capacidadProcesamiento = capacidadProcesamiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Capacidad procesamiento: " + capacidadProcesamiento;
    }

    // === METODOS ===
    @Override
    public String getTipo() {
        return "Planta Procesadora";
    }


}
