package MAPAS.BIBLIOTECA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Libreria {

    private ArrayList<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {

        libros.add(libro);

    }

    public boolean eliminarPorISBN(String isbn) {
        return libros.removeIf(libro -> libro.getIsbn().equals(isbn));
    }

    public List<Libro> buscarPorAutor(String autor) {
        return libros.stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public List<Libro> listarPorAnioAsc() {
        return libros.stream()
                .sorted(Comparator.comparingInt(Libro::getAno))
                .collect(Collectors.toList());
    }

    public List<Libro> obtener5MasRecientes() {
        return libros.stream()
                .sorted(Comparator.comparingInt(Libro::getAno).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    public void mostrarLibros() {
        libros.forEach(System.out::println);
    }
}
