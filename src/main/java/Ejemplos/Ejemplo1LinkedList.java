package Ejemplos;

import java.util.Iterator;
import java.util.LinkedList;

public class Ejemplo1LinkedList {
    public static void main(String[] args) {
        // declarar la colección
        LinkedList lista = new LinkedList();
        int i = 1;

        // inserción de elementos a la lista
        while (i <= 20) {
            if (i % 2 == 0) {
                lista.add(i);
            } else {
                lista.add("Elemento " + i);
            }
            i++;
        }

        // mostrar el contenido de la colección
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}