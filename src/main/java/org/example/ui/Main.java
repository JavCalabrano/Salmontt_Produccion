package org.example.ui;

/**
 * Clase principal y de ejecucion de Salmontt App
 * Llama a los metodos especializados de las clases GestorUnidades y GestorEntidades
 * También puede llamar a los metodos especializados de GestorData que posee filtros para cada UnidadOperativa y Entidades colaboradoras
 *
 * Integra en esta versión la creación de objetos de UnidadOperativa usando polimorfismo y sobrecarga sobre los metodos de información entregados
 *
 * @author Javier Calabrano
 * @version 1.1
 */

// Importacion de clases necesarias para esta versión
import org.example.gui.PantallaSalmonttApp;

public class Main {
    static void main(String[] args) {

        // === INICIO DE GUI ===
        // Logica del GUI y "principal" se haya en clase PantallaSalmontt

        PantallaSalmonttApp screen = new PantallaSalmonttApp();
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);


    }
}
