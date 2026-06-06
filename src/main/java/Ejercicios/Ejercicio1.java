package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double sumaTotal = 0;
        int contadorNumeros = 0;
        int cantidadPositivos = 0;
        String decision;

        System.out.println("=== PROGRAMA DE ALMACENAMIENTO NUMÉRICO ===");

        do {
            System.out.print("Introduce un número: ");
            double numero = teclado.nextDouble();

            // Acumular y contar para el promedio
            sumaTotal += numero;
            contadorNumeros++;

            // Verificar si el número es positivo (mayor que cero)
            if (numero > 0) {
                cantidadPositivos++;
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Deseas introducir otro número? (si/no): ");
            decision = teclado.next();
            System.out.println(); // Salto de línea para ordenar la consola

        } while (decision.equalsIgnoreCase("si") || decision.equalsIgnoreCase("s"));

        // Verificar que se haya introducido al menos un número para evitar división por cero
        if (contadorNumeros > 0) {
            double promedio = sumaTotal / contadorNumeros;

            System.out.println("=======================================");
            System.out.println("           RESULTADOS FINALES          ");
            System.out.println("=======================================");
            System.out.println("Cantidad total de números: " + contadorNumeros);
            System.out.println("Cantidad de números positivos: " + cantidadPositivos);
            System.out.printf("El promedio de los números es: %.2f\n", promedio);
            System.out.println("=======================================");
        } else {
            System.out.println("No se introdujeron números para calcular estadísticas.");
        }

        teclado.close();
    }
}