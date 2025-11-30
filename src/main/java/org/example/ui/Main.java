package org.example.ui;

/**
 * Clase principal y de ejecucion de Salmontt App
 * Llama a los metodos especializados de las clases GestorUnidades y GestorEntidades
 * También puede llamar a los metodos especializados de GestorData que posee filtros para cada UnidadOperativa y Entidades colaboradoras
 *
 * Integra en esta versión la creación de objetos de UnidadOperativa usando polimorfismo y sobrecarga sobre los metodos de información entregados
 *
 * @author Javier Calabrano
 * @version 1.0
 */

// Importacion de clases necesarias para esta versión
import org.example.data.GestorUnidades;
import org.example.model.UnidadOperativa;
import java.util.List;


public class Main {
    static void main (String[] args) {

        //Creacion de objetos y listados en main para interactuar con ellos aqui
        List<UnidadOperativa> centroCultivos = GestorUnidades.listarUnidadesOperativas();


        // Impresion de UnidadesOperativas una a una aplicando la sobrecarga a los objetos de la lista
        System.out.println("=== UNIDADES OPERATIVAS ===");
        for (UnidadOperativa centroCultivo : centroCultivos) {
            System.out.println(centroCultivo.toString());
            System.out.println("---------------------------");
        }
    }
}
