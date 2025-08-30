package MAPAS.IMAGENES;

import java.util.Stack;

public class EditorImagen {
    private Stack<Operacion> historial;

    public EditorImagen() {
        historial = new Stack<>();
    }

    public void aplicarOperacion(String nombre) {
        Operacion op = new Operacion(nombre);
        historial.push(op);
        System.out.println("➕ Operación aplicada: " + nombre);
    }

    // Deshacer la última operación
    public void deshacer() {
        if (historial.isEmpty()) {
            System.out.println("⚠️ No hay operaciones para deshacer.");
        } else {
            Operacion op = historial.pop();
            System.out.println("↩️ Deshacer operación: " + op.getNombre());
        }
    }

    public void mostrarEstado() {
        if (historial.isEmpty()) {
            System.out.println("📷 Estado actual: [Imagen original]");
        } else {
            System.out.println("📷 Estado actual: " + historial);
        }
    }
}
