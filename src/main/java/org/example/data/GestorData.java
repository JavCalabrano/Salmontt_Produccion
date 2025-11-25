package org.example.data;

import org.example.model.CentroCultivo;
import org.example.model.Direccion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorData {

    /**
     * Este metodo realiza una busqueda para sumar las producciones ingresadas para el Centro de cultivo que se consulta
     * @param centro es el nombre correspondiente al Centro de Cultivo por el que se consulta, debe ingresarse con Mayuscula inicial: Llanquihue
     * @return el total de la produccion que se registra para el Centro de cultivo que se consulta
     */
    public static int produccionCentro(String centro) {
        String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\produccion.cvs";

        int total = 0; //asignacion de variable para realizar el conteo
        try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); //divide los datos de la linea que lee del archivo

                //Asignacion de valores a las variables para despues pasarlas a los atributos del objeto
                String nombre = partes[0];
                int cantidad = Integer.parseInt(partes[1]);

                // Validacion de ingreso para la consulta realizada
                if (nombre.equals(centro)) {
                    total += cantidad;
                }
            }

            // Validación de total, si no se encontraron coincidencias hubo un problema de ingreso
            if (total == 0){
                System.out.println("No existe el centro o se ingreso de forma incorrecta");
                System.out.println("Ejemplo: LLanquihue (mal), llanquihue (mal), Llanquihue (perfecto)");
            }
        } catch (
                IOException e) {
            System.out.println("Error en leer documento");
        }
        return total;
    }

    /**
     * Metodo que relaiza una busqueda y cuenta la cantidad de empleados que tiene un Centro de cultivos
     * @param centro es el nombre del Centro de Cultivo, debe ser ingresado con primera letra Mayuscula: Llanquihue (bien), llanquihue (mal)
     * @return un valor de la suma de todas las coincidencias
     */
    public static int empleadosCantidadCentro(String centro) {

        //se pasa el String con la ruta del documento que se debe consultar
        String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\empleados.cvs";

        int total = 0; //variable que almacenará el conteo de empleados

        try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
            String linea;
            br.readLine(); //salta la primera linea de cabecera del documento

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); //divide los datos de la linea que lee del archivo

                //Asignacion de valores a las variables para despues pasarlas a los atributos del objeto
                String nombreCentro = partes[10];

                // Validacion de ingreso para la consulta realizada
                if (nombreCentro.equals(centro)) {
                    total++;
                }
            }

            // Validación de total, si no se encontraron coincidencias hubo un problema de ingreso
            if (total == 0){
                System.out.println("No existe el centro o se ingreso de forma incorrecta");
                System.out.println("Ejemplo: LLanquihue (mal), llanquihue (mal), Llanquihue (perfecto)");
            }
        } catch (
                IOException e) {
            System.out.println("Error en leer documento");
        }
        return total;
    }

    /**
     * Metodo que suma todas las cantidades ingresadas en el archivo correspondiente
     * @return el total que se ha producido en las diferentes plantas de Centro Cultivo
     */
    public static int produccionTotal() {
        String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\produccion.cvs";

        int total = 0; //asignacion de variable para realizar el conteo
        try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); //divide los datos de la linea que lee del archivo

                //Asignacion de valores a las variables para despues pasarlas a los atributos del objeto
                String nombre = partes[0];
                int cantidad = Integer.parseInt(partes[1]);

                total += cantidad;
            }

            // Validación de total, si no se encontraron coincidencias hubo un problema de ingreso
            if (total == 0){
                System.out.println("No existe el centro o se ingreso de forma incorrecta");
                System.out.println("Ejemplo: LLanquihue (mal), llanquihue (mal), Llanquihue (perfecto)");
            }
        } catch (
                IOException e) {
            System.out.println("Error en leer documento");
        }
        return total;
    }

    public static int salariosCentro(String centro) {

        //se pasa el String con la ruta del documento que se debe consultar
        String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\empleados.cvs";

        int total = 0; //variable que almacenará el conteo de empleados

        try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
            String linea;
            br.readLine(); //salta la primera linea de cabecera del documento

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); //divide los datos de la linea que lee del archivo

                //Asignacion de valores a las variables para despues pasarlas a los atributos del objeto
                int salario = Integer.parseInt(partes[9]);
                String nombreCentro = partes[10];

                // Validacion de ingreso para la consulta realizada
                if (nombreCentro.equals(centro)) {
                    total += salario;
                }
            }

            // Validación de total, si no se encontraron coincidencias hubo un problema de ingreso
            if (total == 0){
                System.out.println("No existe el centro o se ingreso de forma incorrecta");
                System.out.println("Ejemplo: LLanquihue (mal), llanquihue (mal), Llanquihue (perfecto)");
            }
        } catch (
                IOException e) {
            System.out.println("Error en leer documento");
        }
        return total;
    }


}
