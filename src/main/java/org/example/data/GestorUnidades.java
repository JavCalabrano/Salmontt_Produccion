package org.example.data;

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
         * Metodo que crea objetos de CentroCultivos para devolver una lista informativa
         * @return una lista con la lista de los Centros de Cultivo totales que tiene Salmontt
         */
        public static List<CentroCultivo>  listarCentroCultivos() {
            String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\listaUnidades.cvs";

            List<CentroCultivo> centroCultivos = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
                String linea;
                br.readLine(); //salta la primera linea de cabecera del documento

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


                    //validacion para reutilizar metodo al llamar desde el main
                    if (partes[4].equals("centro")) {
                        centroCultivos.add(new CentroCultivo(nombre, direccion, cantidadEmpleados, produccion));
                    }
                }
            }catch (IOException e) {
                System.out.println("Error en leer documento");
            }
            return centroCultivos;
        }

    /**
     * Metodo que crea objetos de CentroCultivos para devolver una lista informativa
     * @return una lista con la lista de los Centros de Cultivo totales que tiene Salmontt
     */
    public static List<PlantaProceso>  listarPlantas() {
        String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\listaUnidades.cvs";

        List<PlantaProceso>  centroProceso = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
            String linea;
            br.readLine(); //salta la primera linea de cabecera del documento

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


                //validacion para reutilizar metodo al llamar desde el main
                if (partes[4].equals("planta")) {
                    centroProceso.add(new PlantaProceso(nombre, direccion, cantidadEmpleados, produccion));
                }
            }
        }catch (IOException e) {
            System.out.println("Error en leer documento");
        }
        return centroProceso;
    }

}
