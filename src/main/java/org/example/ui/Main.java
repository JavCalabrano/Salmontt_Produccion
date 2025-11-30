package org.example.ui;

import org.example.data.GestorData;
import org.example.data.GestorUnidades;
import org.example.model.CentroCultivo;
import org.example.model.PlantaProceso;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static void main (String[] args) {

        //Creacion de objetos y listados en main para interactuar con ellos aqui
        List<CentroCultivo> centroCultivos = GestorUnidades.listarCentroCultivos();
        List<PlantaProceso> plantas = GestorUnidades.listarPlantas();

        //impresion de plantas de procesado uno a uno
        System.out.println("=== PLANTAS PROCESADORAS ===");
        for (PlantaProceso planta : plantas) {
           System.out.println(planta.toString());
        }

        //impresion de centros de cultivo uno a uno
        System.out.println("=== CENTROS DE CULTIVO ===");
        for (CentroCultivo centroCultivo : centroCultivos) {
            System.out.println(centroCultivo.toString());
        }
    }
}
