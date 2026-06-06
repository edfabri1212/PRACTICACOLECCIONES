package Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo1ArrayList {
    public static void main(String[] args) {
        // Declarar la colección
        ArrayList lista = new ArrayList();
        lista.add(3.1416);
        lista.add("hola");
        lista.add(true);
        lista.add(8);
        lista.add(0, "valor forzado");

        int tam = lista.size();
        System.out.println("Tamaño de la colección: " + tam + " elementos");

        Iterator it = lista.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}