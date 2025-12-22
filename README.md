# 🧠 Evaluación Transversal Final semana 9 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** [Javier Calabrano]
- **Sección:** [002-A]
- **Carrera:** Analista programador computacional
- **Sede:** [Sede Online]

---

## 📘 Descripción general del sistema
El objetivo es diseñar un proyecto estructurado de clases con herencia, interfaces, trabajando con contencion de objetos y recorriendo listas de ellos para trabajarlos

Se implementa para ello herencia en clases relacionadas a entidades que interactuan con Salmontt bajo Personas
Tambien trabajan con metodos de la interfaz Registrable para obtener datos de ellos.

Se implementa  GUI para facilitar la intereccion con los distintos objetos y manipularlos como para crear nuevos que se integren en el programa

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├─ main
├── java/org/example
├──── data/  	# Clases que trabajan con los datos creandolos y realizando "calculos" de ellos (GestorData, GestorEntidades, GestorUnidades)
├──── gui/  	# Clases que contienen la logica del programa e inician la vista del GUI
├──── interfaces/  	# Reglas aplicablea a los Regisitrables principalmente para obtencion de datos mediante metodos transversales
├──── model/  	# Clases de dominio (UnidadOpeerativa, PlantaProceso, CentroCultivo, Producto, Direccion)
├────── persona/ # Contiene Clases relacionadas a entidades que interactuan con Salmontt (Persona, Empresa, Empleado, CLiente)
├──── ui/      # main donde se ejecutan los metodos, se ocupa principalmente en este caso para invocar la logica del GUI
├──── validaciones/  	# Clase creada para realizar validaciones de formato con datos, se usa ahora para validar Rut, queda pendiente formato para telefonos y email
├── resources  # Contiene los archivos de datos que lee Clase GestorDatos
````

---

##⚙️ Instrucciones para ejecutar el proyecto

1. Abre el proyecto en IntelliJ IDEA.

2. Ejecuta el archivo `Main.java` desde el paquete `ui`.

3. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).

---

**Repositorio GitHub:** (https://github.com/JavCalabrano/Salmontt_Produccion)
**Fecha de entrega:** \[21/12/2025]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Semana 9 POO - I
