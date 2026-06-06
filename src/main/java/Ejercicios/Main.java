package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación de la lista genérica de tipo Alumno
        List<Alumno> listaAlumnos = new ArrayList<>();

        // Insertar valores utilizando el constructor con parámetros
        listaAlumnos.add(new Alumno("A001", "Carlos Mendoza", "CM23001"));
        listaAlumnos.add(new Alumno("A002", "Ana Flores", "AF24015"));
        listaAlumnos.add(new Alumno("A003", "Luis Gerardo", "LG22109"));

        // Mostrar los datos en pantalla
        System.out.println("=== LISTA DE ALUMNOS REGISTRADOS ===");

        // Uso de un bucle for-each para recorrer la lista
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}