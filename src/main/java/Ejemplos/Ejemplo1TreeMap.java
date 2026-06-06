package Ejemplos;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class Ejemplo1TreeMap {

    public static void main(String[] args) {
        //declarar el map
        Map<String, String> tree = new TreeMap();
        tree.put("Maria", "7851-9654");
        tree.put("Juana", "2536-9654");
        tree.put("Teresa", "7951-9654");
        tree.put("Amanda", "6051-9654");
        tree.put("Jaime", "2451-9654");
        tree.put("Jaime", "7548-9654"); // no será agregado

        //mostrar el mapa
        Iterator it = tree.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next().toString();
            System.out.println("Clave: " + key + " -> Valor: " + tree.get(key));
        }
    }
}
