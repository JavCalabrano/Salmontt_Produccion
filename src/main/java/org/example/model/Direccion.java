package org.example.model;

public class Direccion {

    private String calle;
    private int nro;
    private String comuna;

    public Direccion(String calle, int nro, String comuna) {
        this.calle = calle;
        this.nro = nro;
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return calle + ',' + nro + ',' + comuna;
    }


}
