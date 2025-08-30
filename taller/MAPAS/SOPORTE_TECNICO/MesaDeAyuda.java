package MAPAS.SOPORTE_TECNICO;

import java.time.LocalDateTime;
import java.util.PriorityQueue;

public class MesaDeAyuda {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Ticket> cola = new PriorityQueue<>();

        // Crear tickets (con pausas para simular diferentes tiempos)
        cola.add(new Ticket("Servidor caído", Severidad.CRITICA, LocalDateTime.now()));
        Thread.sleep(1000);
        cola.add(new Ticket("Falla en login", Severidad.ALTA, LocalDateTime.now()));
        Thread.sleep(1000);
        cola.add(new Ticket("Solicitud de cambio de clave", Severidad.MEDIA, LocalDateTime.now()));
        Thread.sleep(1000);
        cola.add(new Ticket("Consulta general", Severidad.BAJA, LocalDateTime.now()));
        Thread.sleep(1000);
        cola.add(new Ticket("Error en facturación", Severidad.ALTA, LocalDateTime.now()));

        System.out.println("📋 Tickets en cola:");
        cola.forEach(System.out::println);

        System.out.println("\n✅ Atendiendo tickets en orden de prioridad:");
        while (!cola.isEmpty()) {
            System.out.println("→ Atendiendo: " + cola.poll());
        }
    }
}