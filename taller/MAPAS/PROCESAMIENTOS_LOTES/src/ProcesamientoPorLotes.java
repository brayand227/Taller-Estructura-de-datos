import java.util.ArrayDeque;

public class ProcesamientoPorLotes {
    public static void main(String[] args) {
        ArrayDeque<Lote> cola = new ArrayDeque<>();

        // Se encolan lotes normales al final
        cola.addLast(new Lote("Lote A"));
        cola.addLast(new Lote("Lote B"));
        cola.addLast(new Lote("Lote C"));

        // Se inyecta un lote urgente al inicio
        cola.addFirst(new Lote("Lote URGENTE 1"));

        // Otro lote normal
        cola.addLast(new Lote("Lote D"));

        // Otro urgente
        cola.addFirst(new Lote("Lote URGENTE 2"));

        // Mostrar orden de ejecución
        System.out.println("Orden de ejecución de lotes:");
        while (!cola.isEmpty()) {
            Lote lote = cola.pollFirst(); // siempre se procesa por el frente
            System.out.println("Procesando: " + lote);
        }
    }
}
