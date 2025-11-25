package org.example.ui;

import org.example.data.FabricaObjetos;
import org.example.data.GestorData;

import java.sql.SQLOutput;


public class Main {
    static void main (String[] args) {

        //== INSTRUCCIONES DE USO  ==
        // Descomentar el CODIGO del trabajo que se quiere realizar con los datos de Salmontt

        //===== SECCION LISTAS DE OBJETOS =======

        //  1. Devuelve una lista con los Centros de Cultivo registrados en el documento listaCentroCultivos.cvs
        //System.out.println(FabricaObjetos.listarCentroCultivos());

        //  2. Devuelve una lista con los Empleados totales de Salmontt registrados en el documento empleados.cvs
        //System.out.println(FabricaObjetos.listarEmpleados());

        //  3. Devuelve una lista con los CLientes de Salmontt registrados en el documento clientes.cvs
        //System.out.println(FabricaObjetos.listarCLientes());

        //  4. Devuelve una lista con los Empresas colaboradoras de Salmontt registrados en el documento empresa.cvs
        //System.out.println(FabricaObjetos.listarEmpresas());


        //=== CONSULTAS VARIAS ===

        //Consulta especifica de la produccion de un Centro Cultivo; ingrese el nombre entre las " ". Formato ejemplo: Ranco, Aguas Buenas
        //System.out.println(GestorData.produccionCentro("nombreCentro"));

        //Consulta por la suma de la producción de los centros de cultivo existentes
        //System.out.println(GestorData.produccionTotal());

        //Consulta por los salarios que paga el Centro de cultivo por el que se consulta; ingrese el nombre entre las " ". Formato ejemplo: Ranco, Aguas Buenas
        //System.out.println(GestorData.salariosCentro("nombreCentro"));

    }
}
