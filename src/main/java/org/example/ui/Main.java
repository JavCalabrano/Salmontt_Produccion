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
import javax.swing.SwingUtilities;
import org.example.data.GestorData;
import org.example.model.Registrable;
import org.example.model.UnidadOperativa;
import org.example.gui.PantallaSalmontt;

import java.util.List;


public class Main {
    static void main(String[] args) {

        List<Registrable> registrables = GestorData.registrables();
        for (Registrable registrable : registrables) {
            if (registrable instanceof UnidadOperativa) {
                System.out.println(registrable.mostrarResumen());
            }
        }


        /**
        System.out.println("hola");

        SwingUtilities.invokeLater(() -> {
            PantallaSalmontt ventanaMain = new PantallaSalmontt();

            ventanaMain.setVisible(true);

        });
        */
    }
}
