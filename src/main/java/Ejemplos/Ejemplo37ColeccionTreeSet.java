package main.java.Ejemplos;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Ejemplo37ColeccionTreeSet {

    public static void main(String[] args) {
        //crear la colección TreeSet
        Set<String> lista = new TreeSet();
        lista.add("hola");
        lista.add("que tal?");
        lista.add("ya casi es navidad");
        lista.add("programadores");
        lista.add("hola");
        lista.add("el sábado hay clases");

        //recorrer la colección
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("");
        System.out.println("**************** LISTA 2 ****************");
        //declaración de colección de tipo Equipo
        TreeSet<Equipo> equipos = new TreeSet();
        equipos.add(new Equipo(4, "Once Lobos FC", "El Salvador"));
        equipos.add(new Equipo(1, "Sonsonate FC", "El Salvador"));
        equipos.add(new Equipo(3, "CD FAS", "El Salvador"));
        equipos.add(new Equipo(5, "Municipal Limeño", "El Salvador"));
        equipos.add(new Equipo(2, "Águila", "El Salvador"));
        equipos.add(new Equipo(1, "Chalatenango FC", "El Salvador")); //en duda

        //recorrer la colección para mostrar los elementos
        for (Equipo eq : equipos) {
            System.out.println(eq.getId() + " " + eq.getNombre());
        }
    }
}

class Equipo implements Comparable<Equipo> {

    private int id;
    private String nombre;
    private String pais;

    public Equipo() {
    }

    public Equipo(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public int compareTo(Equipo o) {
        return this.id - o.getId();
    }
}
