import java.util.PriorityQueue;
import java.util.Comparator;

public class PlanificadorImpresion {
    public static void main(String[] args) {
        // Comparator: primero menor número de páginas, luego más antiguo
        Comparator<Trabajo> comparador = Comparator
                .comparingInt(Trabajo::getPaginas)
                .thenComparingLong(Trabajo::getTimestamp);

        PriorityQueue<Trabajo> cola = new PriorityQueue<>(comparador);

        long t = 0; // simulamos el tiempo de llegada (contador simple)

        // Se agregan trabajos con distintos tamaños
        cola.add(new Trabajo("Informe Finanzas", 15, t++));
        cola.add(new Trabajo("Contrato", 3, t++));
        cola.add(new Trabajo("Manual Usuario", 40, t++));
        cola.add(new Trabajo("Factura", 3, t++));  // mismo tamaño que otro
        cola.add(new Trabajo("Presentación", 10, t++));

        // Simulación de atención
        System.out.println("Orden de impresión:");
        while (!cola.isEmpty()) {
            Trabajo j = cola.poll();
            System.out.println("🖨️ Imprimiendo: " + j);
        }
    }
}
