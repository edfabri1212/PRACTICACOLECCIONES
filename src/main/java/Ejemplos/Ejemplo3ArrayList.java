package Ejemplos;

import org.example.Equipo;

import java.util.ArrayList;
import java.util.Iterator;
public class Ejemplo3ArrayList {

    public static void main(String[] args) {

        ArrayList<Equipo> ListEquipos = new ArrayList();

        Equipo eq1 = new Equipo("Sonsonate, FC", "El salvador,","0");
        Equipo eq2 = new Equipo("Santa, Tecla, FC," ,"El salvador,","4");
        Equipo eq3 = new Equipo("Aguila, FC, ", "El salvador," ,"14");
        Equipo eq4 = new Equipo("Cs Fas FC", "El salvador," ,"16");

        ListEquipos.add(eq1);
        ListEquipos.add(eq2);
        ListEquipos.add(eq3);
        ListEquipos.add(eq4);

        for ( Equipo eq : ListEquipos){
       System.out.println(eq.getNombre() + " " + eq.GetPais() + " " + eq.getCopa());

        }

    }
}