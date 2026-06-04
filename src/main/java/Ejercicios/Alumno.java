package Ejercicios;

public class Alumno {
    // Propiedades encapsuladas (privadas)
    private String codigo;
    private String nombre;
    private String carnet;

    // Constructor vacío (por defecto)
    public Alumno() {
    }

    // Constructor con todos los parámetros
    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    // Métodos Getter y Setter (Encapsulamiento)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    // Método alternativo para facilitar la impresión en pantalla
    @Override
    public String toString() {
        return "Código: " + codigo + " | Nombre: " + nombre + " | Carnet: " + carnet;
    }
}
