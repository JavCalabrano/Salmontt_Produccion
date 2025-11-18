package org.example.data;

import org.example.model.CentroCultivo;
import org.example.model.Producto;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se dedica a leer los datos de los diferentes archivos para crear los objetos correspondientes.
 * Ademas contiene los metodos para realizar algunas operaciones para consultar los datos de los archivos
 */

public class GestorData {

    /**
     * Metodo que crea los Centros de cultivo desde el archivo centroCultivos.cvs
     * @return una lista con los Centros de cultivo que se crearon
     */
    public static List<CentroCultivo> creadorCentroCultivo() {
        /**
         * variable rutaDatos se refiere al archivo que se leerá para la creación de objetos CentroCultivo
         */
        File rutaCentros = Paths.get("C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\centroCultivo.cvs").toFile();

        System.out.println("===CREANDO CENTROS DE CULTIVO===\n");

        List <CentroCultivo> listaCentroCultivo = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(rutaCentros))) {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null ) {

                String[] partes = linea.split(";");
                String nombre = partes[0];
                String comuna = partes[1];
                int produccion = Integer.parseInt(partes[2]);

                listaCentroCultivo.add(new CentroCultivo(nombre, comuna, produccion));
            }

        }catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        return listaCentroCultivo;
    }

    /**
     * Metodo que crea los Productos desde el archivo productos.cvs
     * @return una lista con los Productos que se crearon
     */
    public static List<Producto>  creadorProducto() {
        /**
         * variable rutaDatos se refiere al archivo que se leerá para la creación de objetos CentroCultivo
         */
        File rutaDatos = Paths.get("C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\producto.cvs").toFile();

        System.out.println("===CREANDO PRODUCTOS===\n");

        List <Producto> listaProducto = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(rutaDatos))) {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null ) {
                String[] partes = linea.split(";");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String tipo = partes[2];

                listaProducto.add(new Producto(id, nombre, tipo));
            }

        }catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        return listaProducto;
    }

    /**
     * Lanza una consulta por un Producto especifico de un CentroCultivo especifico para sumar las producciones en archivo
     * @param sede variable que equivale al nombre del Centro cultivo para realizar la consulta
     * @param idProducto variable equivalente al id del Producto del que se quiere hacer la consulta
     * @return total con el valor sumado de la producción encontrada en el archivo produccion.cvs
     */
    public static int produccionEspecificoID(String sede, int idProducto) {
        /**
         * variable rutaDatos se refiere al archivo que se leerá para la creación de objetos CentroCultivo
         */
        File rutaDatos = Paths.get("C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\produccion.cvs").toFile();

        int total = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(rutaDatos))) {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null ) {
                String[] partes = linea.split(";");
                String nombre = partes[0];
                int id = Integer.parseInt(partes[1]);
                int cantidad = Integer.parseInt(partes[2]);

                if (nombre.equals(sede) && id == idProducto){
                    total = total + cantidad;
                }
            }

        }catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        return total;
    }

    public static String mayorproduccion() {
        /**
         * Metodo que busca la mayor produccion y retorna un String con el informe
         */
        File rutaDatos = Paths.get("C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\produccion.cvs").toFile();

        //inicio variables para almacenar datos
        int total = 0;
        String sede = "placeHolder";

        try(BufferedReader br = new BufferedReader(new FileReader(rutaDatos))) {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null ) {
                String[] partes = linea.split(";");
                String nombre = partes[0];
                String id = partes[1];
                int cantidad = Integer.parseInt(partes[2]);

                if (cantidad > total){
                    total = cantidad;
                    sede = nombre + ", ID " + id;
                }
            }
            sede = "Mayor produccion en " + sede + ", cantidad: " + total;

        }catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        return sede;
    }

}
