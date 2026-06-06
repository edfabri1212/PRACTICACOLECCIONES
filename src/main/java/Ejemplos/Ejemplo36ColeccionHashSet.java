package Ejemplos;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ejemplo36ColeccionHashSet {

public static void main(String[] args) {

    //declarar la coleccion
    Set lista = new HashSet();
    lista.add("Hola");
    lista.add(2525);
    lista.add(3.1416);
    lista.add(true);
    lista.add(2525);//Este elemento no sera agregado

    //recorrer la lista para mostrar el contenido
    Iterator it = lista.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }

// declarar segunda ,lista
    HashSet<String> lista1 = new HashSet<>();
    lista1.add("hola");
    lista1.add("333");
    lista1.add("Programadores");
    lista1.add("que tal");
    lista1.add("333");// esta elemento no se agregara
    lista1.add("saludos");

    System.out.println(" ");
    System.out.println("///////////////lista 2 //////////////////////");
    for (String el : lista1) ;{
    System.out.println();

}
System.out.println("///////////////lista 3 //////////////////////");
 HashSet<Persona> personas =  new HashSet<>();
 personas.add(new Persona(1,"Juan Perez","7852-9658"));
 personas.add(new Persona (2,"Juan Martinez","7852-9658"));
 personas.add(new Persona(3,"Juan Salgado","7852-9658"));
 personas.add(new Persona(4,"Juan Sosa","7852-9658"));
 personas.add(new Persona(1,"Juan Aguilera", "7852-9658"));

 System.out.println(" ");
 for (Persona per : personas) {
System.out.println(per.getId() + " " + per.getNombre() + " " + per.getTelefono() );
 }
    }
}





