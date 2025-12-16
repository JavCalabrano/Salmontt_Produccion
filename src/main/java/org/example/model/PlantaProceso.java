package org.example.model;

/**
 * Clase dedicada a la especializacion de las plantas de proceso, es heredera de UnidadOperativa
 */

public class PlantaProceso extends UnidadOperativa implements Registrable {

    private double capacidadProcesamiento;

    //constructor de clase
    public PlantaProceso(String nombre, Direccion direccion, int cantidadEmpleados, double capacidadProcesamiento) {
        super(nombre, direccion, cantidadEmpleados);
        this.capacidadProcesamiento = capacidadProcesamiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Capacidad procesamiento: " + capacidadProcesamiento;
    }

    // Metodo creado para sobre carga e identificación de objetos en tiempo de compilación
    @Override
    public String getTipoEntidad() {
        return "(Planta Procesadora)";
    }


    @Override
    public String mostrarResumen() {
        return getNombre() + "/" + getTipoEntidad() + "\n" +
                "Cap. procesamiento: " + capacidadProcesamiento + "\n";
    }


}
