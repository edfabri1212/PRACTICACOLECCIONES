package Ejercicios;

import java.util.LinkedList;
import java.util.List;

public class EjercicioLinkedList {
    public static void main(String[] args) {
        // Creación de la lista genérica de tipo LinkedList
        List<Alumno> listaAlumnos = new LinkedList<>();

        // Insertar valores en la LinkedList
        listaAlumnos.add(new Alumno("A004", "Sofía Martínez", "SM21045"));
        listaAlumnos.add(new Alumno("A005", "Diego Portillo", "DP23088"));
        listaAlumnos.add(new Alumno("A006", "Elena Rostrán", "ER24112"));

        // Mostrar los datos en pantalla
        System.out.println("=== LISTA DE ALUMNOS (LINKEDLIST) ===");

        // Recorremos la lista mediante un bucle for-each
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}
