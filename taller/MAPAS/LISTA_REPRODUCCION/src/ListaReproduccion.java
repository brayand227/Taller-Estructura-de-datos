import java.util.LinkedList;
import java.util.ListIterator;

public class ListaReproduccion {
    private LinkedList<Cancion> canciones;
    private ListIterator<Cancion> cursor;
    private Cancion actual;

    public ListaReproduccion() {
        this.canciones = new LinkedList<>();
        this.cursor = canciones.listIterator();
    }

    // Agregar canción al final
    public void agregarCancion(Cancion c) {
        canciones.add(c);
        if (actual == null) {
            cursor = canciones.listIterator();
            if (cursor.hasNext()) {
                actual = cursor.next();
            }
        }
    }

    // Avanzar una canción
    public Cancion siguiente() {
        if (cursor.hasNext()) {
            actual = cursor.next();
        } else {
            System.out.println("⚠ Ya estás en la última canción.");
        }
        return actual;
    }

    // Retroceder una canción
    public Cancion anterior() {
        if (cursor.hasPrevious()) {
            actual = cursor.previous();
        } else {
            System.out.println("⚠ Ya estás en la primera canción.");
        }
        return actual;
    }

    // Mover canción de una posición a otra
    public void moverCancion(int origen, int destino) {
        if (origen < 0 || origen >= canciones.size() || destino < 0 || destino >= canciones.size()) {
            System.out.println("❌ Índices fuera de rango.");
            return;
        }
        Cancion c = canciones.remove(origen);
        canciones.add(destino, c);

        // resetear el cursor para no perder coherencia
        cursor = canciones.listIterator();
        while (cursor.hasNext()) {
            Cancion temp = cursor.next();
            if (temp.equals(actual)) break;
        }
    }

    // Ver la canción actual
    public Cancion getActual() {
        return actual;
    }

    // Mostrar toda la lista
    public void imprimirLista() {
        int i = 0;
        for (Cancion c : canciones) {
            String marca = (c.equals(actual)) ? " <- actual" : "";
            System.out.println(i + ". " + c + marca);
            i++;
        }
    }
}
