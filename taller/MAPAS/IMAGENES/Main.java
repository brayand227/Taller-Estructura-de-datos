package MAPAS.IMAGENES;

public class Main {
    public static void main(String[] args) {
        EditorImagen editor = new EditorImagen();

        // Aplicar operaciones
        editor.aplicarOperacion("Rotar 90°");
        editor.aplicarOperacion("Recortar");
        editor.aplicarOperacion("Aumentar brillo");
        editor.aplicarOperacion("Aplicar filtro sepia");

        editor.mostrarEstado();

        // Deshacer 3 operaciones
        System.out.println("\n--- Deshacer 3 veces ---");
        editor.deshacer();
        editor.mostrarEstado();

        editor.deshacer();
        editor.mostrarEstado();

        editor.deshacer();
        editor.mostrarEstado();
    }
}

