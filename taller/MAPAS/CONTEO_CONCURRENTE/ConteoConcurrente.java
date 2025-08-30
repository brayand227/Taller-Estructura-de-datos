import java.util.*;

public class ConteoConcurrente {
    private static Hashtable<String, Integer> accesos = new Hashtable<>();

    // Método para registrar un acceso de un usuario
    public static synchronized void registrarAcceso(String usuario) {
        accesos.put(usuario, accesos.getOrDefault(usuario, 0) + 1);
    }

    // Mostrar top 3 usuarios con más accesos
    public static void mostrarTop3() {
        accesos.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // ordenar descendente por contador
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue() + " accesos"));
    }

    public static void main(String[] args) {
        // Simulación de accesos
        registrarAcceso("Ana");
        registrarAcceso("Pedro");
        registrarAcceso("Ana");
        registrarAcceso("Luis");
        registrarAcceso("Ana");
        registrarAcceso("Pedro");
        registrarAcceso("Maria");
        registrarAcceso("Luis");
        registrarAcceso("Luis");
        registrarAcceso("Maria");

        System.out.println("=== Top 3 usuarios ===");
        mostrarTop3();
    }
}

