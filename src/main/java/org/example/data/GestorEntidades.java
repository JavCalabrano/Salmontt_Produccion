package org.example.data;

import org.example.model.UnidadOperativa;
import org.example.model.Direccion;
import org.example.model.entidad.Cliente;
import org.example.model.entidad.Empleado;
import org.example.model.entidad.Empresa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Esta clase se dedica a leer los datos de los diferentes archivos para crear los objetos correspondientes.
 */

public class GestorEntidades {

    /**
     * Metodo que crea objetos de Empleado para devolver una lista informativa
     * @return una lista con la lista de empleados totales que tiene Salmontt
     */
    public static List<Empleado> listarEmpleados() {

        String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\empleados.cvs";

        List<Empleado> empleados = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
            String linea;
            br.readLine(); //salta la primera linea de cabecera del documento

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); //divide los datos de la linea que lee del archivo

                //Asignacion de valores a las variables para despues pasarlas a los atributos del objeto
                String nombre = partes[0];
                String apellido = partes[1];
                String rutId = partes[2];
                int nro = Integer.parseInt(partes[4]);
                Direccion direccion = new Direccion(partes[3], nro, partes[5]);
                int  telefono = Integer.parseInt(partes[6]);
                String email = partes[7];
                String cargo = partes[8];
                int salario = Integer.parseInt(partes[9]);
                String nombreCentro = partes[10];

                //Asigancion de los atributos y creación del objeto dentro de una lista
                empleados.add(new Empleado(nombre, apellido, rutId, direccion, telefono, email, cargo, salario, nombreCentro));
            }
        }catch (IOException e) {
            System.out.println("Error en leer documento");
        }
        return empleados;

    }

    /**
     * Metodo que crea objetos de Cliente para devolver una lista informativa
     * @return una lista con la lista de clientes registrados en la platafomra de Salmontt
     */
    public static List<Cliente> listarCLientes(){
        String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\clientes.cvs";

        List<Cliente> clientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
            String linea;
            br.readLine(); //salta la primera linea de cabecera del documento

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");//divide los datos de la linea que lee del archivo

                //Asignacion de valores a las variables para despues pasarlas a los atributos del objeto
                String nombre = partes[0];
                String apellido = partes[1];
                String rutId = partes[2];
                int nro = Integer.parseInt(partes[4]);
                Direccion direccion = new Direccion(partes[3], nro, partes[5]);
                int  telefono = Integer.parseInt(partes[6]);
                String email = partes[7];

                //Asigancion de los atributos y creación del objeto dentro de una lista
                clientes.add(new Cliente(nombre, apellido, rutId, direccion, telefono, email));
            }
        }catch (IOException e) {
            System.out.println("Error en leer documento");
        }
        return clientes;
    }

    /**
     * Metodo que crea objetos de Empresa para devolver una lista informativa
     * @return una lista con la lista de Empresas colaboradoras que trabajan con Salmontt
     */
    public static List<Empresa> listarEmpresas(){
        String rutaCvs = "C:\\Users\\danie\\IdeaProjects\\Salmontt_Produccion\\src\\main\\resources\\empresa.cvs";

        List<Empresa> empresas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaCvs))) {
            String linea;
            br.readLine(); //salta la primera linea de cabecera del documento

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); //divide los datos de la linea que lee del archivo

                //Asignacion de valores a las variables para despues pasarlas a los atributos del objeto
                String nombre = partes[0];
                String rutId = partes[1];
                int nro = Integer.parseInt(partes[3]);
                Direccion direccion = new Direccion(partes[2], nro, partes[4]);
                int  telefono = Integer.parseInt(partes[5]);
                String email = partes[6];
                String descripcion = partes[7];

                //Asigancion de los atributos y creación del objeto dentro de una lista
                empresas.add(new Empresa(nombre, rutId, direccion, telefono, email, descripcion));
            }
        }catch (IOException e) {
            System.out.println("Error en leer documento");
        }
        return empresas;
    }

}
