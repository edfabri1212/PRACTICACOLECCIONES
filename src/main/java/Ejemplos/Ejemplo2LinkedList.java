package Ejemplos;

import java.util.LinkedList;

public class Ejemplo2LinkedList {

    public static void main(String[] args) {
        //declarar la lista
        LinkedList<Equipo> equipos = new LinkedList();
        Equipo eq;

        //agregamos elementos a la lista
        for (int i = 1; i <= 10; i++) {
            eq = new Equipo("Equipo " + i, "País " + i, i);
            equipos.add(eq);
        }

        //mostrar los elementos de la lista
        for (Equipo e : equipos) {
            System.out.println(e.getNombre() + " " + e.getPais() + " "
                    + e.getCopas());
        }
    }
}
