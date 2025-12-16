package org.example.data;

/**
 * Clase dedicada a generar filtros para los datos miscelaneos relacionados a Entidades y UnidadesOperativas
 */

import org.example.model.CentroCultivo;
import org.example.model.Direccion;
import org.example.model.PlantaProceso;
import org.example.model.UnidadOperativa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

        /**
         * Metodo que crea objetos de UnidadesOperativas para devolver una lista informativa aplicando un filtro
         * y polimorfismo en la creacion de la lista
         *
         * @return una lista con la lista de los UnidadesOperativas totales que tiene Salmontt
         */
        public static List<UnidadOperativa>  listarUnidadesOperativas() {
            // Asignación de la ruta especifica para uso del método
            String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\listaUnidades.cvs";

            List<UnidadOperativa> centroCultivos = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
                String linea;
                br.readLine(); //salta la primera linea de cabecera del documento

                //ciclo de lectura para la creacion de objetos para la lista centroCultivos
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(","); //divide los datos de la linea que lee del archivo

                    //Asignacion de valores a las variables para despues pasarlas a los atributos del objeto
                    String nombre = partes[0];
                    int nro = Integer.parseInt(partes[2]);
                    Direccion direccion = new Direccion(partes[1], nro, partes[3]);

                    //metodo que suma los registros de produccion para incluir el total en el informe
                    double produccion = GestorData.produccionCentro(nombre);

                    //metodo que suma los empleados registrados en el mismo centro de cultivo que se esta consultando
                    int cantidadEmpleados = GestorData.empleadosCantidadCentro(nombre);


                    //validacion para asignar el tipo correcto de objeto antes de ingresar a la lista centroCultivos
                    if (partes[4].equalsIgnoreCase("centro")) {
                        centroCultivos.add(new CentroCultivo(nombre, direccion, cantidadEmpleados, produccion));
                    } else if (partes[4].equalsIgnoreCase("planta")) {
                        centroCultivos.add(new PlantaProceso(nombre, direccion, cantidadEmpleados, produccion));
                    }
                }
            }catch (IOException e) {
                System.out.println("Error en leer documento");
            }
            return centroCultivos;
        }


}
