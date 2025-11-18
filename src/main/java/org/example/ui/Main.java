package org.example.ui;

import org.example.data.*;
import org.example.model.CentroCultivo;
import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main (String[] args) {

        //Creando centros de cultivo con datos
        List<CentroCultivo> listaCentroCultivo = GestorData.creadorCentroCultivo();
        System.out.println(listaCentroCultivo);

        //Creando Productos con datos
        List<Producto> listaProducto = GestorData.creadorProducto();
        System.out.println(listaProducto);

        //Consulta al sistema con el nombre de la sede y el ID de producto buscado. Formato (String, int)
        System.out.println(GestorData.produccionEspecificoID("Muermos", 4));

        //Consulta por la Centro cultivo con el registro más alto de entrada unica en el documento
        System.out.println(GestorData.mayorproduccion());


    }
}
