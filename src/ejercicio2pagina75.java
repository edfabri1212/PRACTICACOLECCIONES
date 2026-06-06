import java.util.LinkedHashSet;

class Libro {
    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Título: " + titulo +
                ", Edición: " + edicion +
                ", Autor: " + autor;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Libro otroLibro = (Libro) obj;
        return this.id == otroLibro.id;
    }
}

public class ejercicio2pagina75 {
    public static void main(String[] args) {

        LinkedHashSet<Libro> libros = new LinkedHashSet<>();

        libros.add(new Libro(1, "Java Básico", "Primera", "Juan Pérez"));
        libros.add(new Libro(2, "Programación Orientada a Objetos", "Segunda", "Ana López"));
        libros.add(new Libro(3, "Estructuras de Datos", "Tercera", "Carlos Gómez"));
        libros.add(new Libro(1, "Java Básico", "Primera", "Juan Pérez")); // Duplicado

        System.out.println("Lista de libros:");

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}