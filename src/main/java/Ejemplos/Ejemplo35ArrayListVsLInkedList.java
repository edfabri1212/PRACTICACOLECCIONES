package Ejemplos;

import java.util.List;
import java.util.ArrayList;
import java. util.LinkedList;
import java.util.Objects;

public class Ejemplo35ArrayListVsLInkedList{

    public static void main(String[] args) {
//declarar dos colecciones
        List<Persona> listaArray = new ArrayList<>();
        List<Persona> listaLinked = new LinkedList<>();
        long Antes;

        //llenar las listas con elementos
        for (int i = 1; i <= 10000; i++) {
            listaArray.add(new Persona(i, "Persona" + i, "Tel." + i));
            listaLinked.add(new Persona(i, "Persona" + i, "Tel." + i));


        }
        System.out.println("tiempo en insertar  una persona en ArrayList");
        Antes = System.nanoTime();
        listaArray.add(0, new Persona( 10001, "prueba inicio" , "0000"));
        System.out.println(System.nanoTime()- Antes);

        System.out.println();
        System.out.println("Tiempo en insertar una persona en LinkedList");
        Antes = System.nanoTime();
        listaArray.add(0, new Persona( 10001, "prueba inicio" , "0000"));
        System.out.println(System.nanoTime()- Antes);

        System.out.println();
        System.out.println("Tiempo en insertar en ArrayList al centro");
        Antes = System.nanoTime();
        listaArray.add(5000, new Persona( 10002, "prueba inicio" , "0000"));
        System.out.println(System.nanoTime()- Antes);

        System.out.println();
        System.out.println("Tiempo en insertar en linkedList al centro");
        Antes = System.nanoTime();
        listaArray.add(5000, new Persona( 10002, "prueba inicio" , "0000"));
        System.out.println(System.nanoTime()- Antes);
    }
}

class Persona {

    private int id;
    private String nombre;
    private String telefono;

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    @Override
    public String toString() {
        return id + " " + nombre + " " + telefono;

    }
    @Override
    public int hashCode() {
        int hash = 7 ;
        hash = 19 * hash  + this.id;
        return hash;
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()){
            return false;
        }

        final Persona other =(Persona) obj;
        if (this.id !=other.id && !Objects.equals(this.nombre, other.nombre)) {
            return false;

        }
        return true;
    }
}
