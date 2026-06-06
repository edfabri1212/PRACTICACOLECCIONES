package Ejemplos;

public class Equipo {

    // Atributos privados
    private String nombre;
    private String pais;
    private int copas;

    // Constructor vacío
    public Equipo() {
    }

    // Constructor con parámetros
    public Equipo(String nombre, String pais, int copas) {
        this.nombre = nombre;
        this.pais = pais;
        this.copas = copas;
    }

    // --- Métodos Getter ---
    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getCopas() {
        return copas;
    }

    // --- Métodos Setter (Opcionales pero recomendados) ---
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }
}