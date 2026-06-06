package org.example;

public class Equipo {

    private String Nombre;
    private String Pais;
    private String Copas;

    public Equipo() {
    }

public Equipo(String nombre,String Pais, String Copas) {

    this.Nombre = nombre;
    this.Pais = Pais;
    this.Copas = Copas;
}
public String getNombre(){
        return Nombre;

    }
 public String GetPais(){
        return Pais;
 }

 public String getCopa(){
        return Copas;
 }
}
