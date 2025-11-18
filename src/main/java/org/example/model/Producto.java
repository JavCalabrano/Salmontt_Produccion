package org.example.model;

public class Producto {

    private int id;
    private String nombre;
    private String tipo;


    public Producto(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Productos:" +
                "ID= " + id + "/" + nombre + "/" + tipo + "\n";
    }
}
