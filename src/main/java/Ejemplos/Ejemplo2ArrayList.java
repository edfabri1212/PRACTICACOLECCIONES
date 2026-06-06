package Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo2ArrayList {
    public static void main(String[] args) {
        //crear una colección de un solo tipo
        ArrayList<String> lista = new ArrayList<String>();
        int i = 1;

        //asignamos valores a la colección
        while(i <= 50)
        {
            lista.add("Cadena número " + i);
            i++;
        }

        lista.add(25, "3.1416"); //agregamos elemento en una posición específica

        //recorremos la colección para mostrar los elementos
        for(String item:lista)
        {
            System.out.println(item);
        }

        //aplicación del método remove()
        lista.remove("Cadena número 25");
        lista.remove(40);

        System.out.println("\n");
        Iterator<String> it = lista.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}