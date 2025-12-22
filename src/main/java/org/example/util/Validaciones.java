package org.example.util;

public class Validaciones {

    public static boolean validarRut(String rut) {

        boolean resultado = rut.trim().matches("^[0-9]{7,8}-[0-9Kk]$");;
        return resultado;
    }


}
