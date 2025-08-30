package MAPAS.AGENDA;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.NavigableSet;
import java.util.TreeSet;

public class AgendaReuniones {
    public static void main(String[] args) {
        TreeSet<Reunion> agenda = new TreeSet<>();

        // Añadimos reuniones
        agenda.add(new Reunion(LocalDateTime.of(2025, Month.AUGUST, 29, 9, 0), "Plan estratégico"));
        agenda.add(new Reunion(LocalDateTime.of(2025, Month.AUGUST, 30, 11, 0), "Revisión ventas"));
        agenda.add(new Reunion(LocalDateTime.of(2025, Month.AUGUST, 29, 14, 0), "Presentación proyecto"));
        agenda.add(new Reunion(LocalDateTime.of(2025, Month.SEPTEMBER, 2, 10, 30), "Seguimiento"));

        // Mostrar todas en orden cronológico
        System.out.println("📅 Agenda completa:");
        for (Reunion r : agenda) {
            System.out.println(r);
        }

        // Primera y última reunión
        System.out.println("\nPrimera reunión: " + agenda.first());
        System.out.println("Última reunión: " + agenda.last());

        // Subrango: reuniones desde hoy hasta fin de agosto
        LocalDateTime hoy = LocalDateTime.of(2025, Month.AUGUST, 29, 0, 0);
        LocalDateTime finDeMes = LocalDateTime.of(2025, Month.AUGUST, 31, 23, 59);

        NavigableSet<Reunion> reunionesAgosto = agenda.subSet(new Reunion(hoy, ""), true,
                new Reunion(finDeMes, ""), true);

        System.out.println("\n📆 Reuniones entre hoy y fin de mes:");
        for (Reunion r : reunionesAgosto) {
            System.out.println(r);
        }
    }
}