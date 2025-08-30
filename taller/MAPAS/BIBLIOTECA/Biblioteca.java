package MAPAS.BIBLIOTECA;


public class Biblioteca {
    public static void main(String[] args) {
        Libreria catalogo = new Libreria();

    
        catalogo.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "1234"));
        catalogo.agregarLibro(new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985, "5678"));
        catalogo.agregarLibro(new Libro("Rayuela", "Julio Cortázar", 1963, "9012"));
        catalogo.agregarLibro(new Libro("1984", "George Orwell", 1949, "3456"));
        catalogo.agregarLibro(new Libro("El nombre del viento", "Patrick Rothfuss", 2007, "7890"));
        catalogo.agregarLibro(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001, "2468"));

        System.out.println("📚 Todos los libros:");
        catalogo.mostrarLibros();

        System.out.println("\n🔎 Buscar libros por autor (Gabriel García Márquez):");
        catalogo.buscarPorAutor("Gabriel García Márquez").forEach(System.out::println);

        System.out.println("\n📅 Libros ordenados por año ascendente:");
        catalogo.listarPorAnioAsc().forEach(System.out::println);

        System.out.println("\n🔥 Los 5 más recientes:");
        catalogo.obtener5MasRecientes().forEach(System.out::println);

        System.out.println("\n🗑️ Eliminar libro con ISBN 9012 (Rayuela)...");
        catalogo.eliminarPorISBN("9012");

        System.out.println("\n📚 Catálogo actualizado:");
        catalogo.mostrarLibros();
    }
}