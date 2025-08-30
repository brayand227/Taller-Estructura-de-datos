import java.time.LocalDate;
import java.util.*;


public class AgendaAcademica {
    private TreeMap<LocalDate, List<Actividad>> agenda = new TreeMap<>();

    // Agregar actividad en una fecha
    public void agregarActividad(LocalDate fecha, Actividad actividad) {
        agenda.computeIfAbsent(fecha, k -> new ArrayList<>()).add(actividad);
    }

    // Obtener la primera actividad a partir de hoy
    public Map.Entry<LocalDate, List<Actividad>> obtenerProximaActividad() {
        LocalDate hoy = LocalDate.now();
        return agenda.ceilingEntry(hoy);
    }

    // Reporte entre dos fechas [inicio, fin]
    public SortedMap<LocalDate, List<Actividad>> generarReporte(LocalDate inicio, LocalDate fin) {
        return agenda.subMap(inicio, true, fin, true);
    }

    // Mostrar la agenda completa
    public void imprimirAgenda() {
        for (Map.Entry<LocalDate, List<Actividad>> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        AgendaAcademica agenda = new AgendaAcademica();

        // Agregamos actividades
        agenda.agregarActividad(LocalDate.of(2025, 9, 1), new Actividad("Parcial Matemáticas", "Algebra Lineal"));
        agenda.agregarActividad(LocalDate.of(2025, 9, 5), new Actividad("Entrega Proyecto", "POO en Java"));
        agenda.agregarActividad(LocalDate.of(2025, 9, 10), new Actividad("Exposición", "Diseño de Software"));
        agenda.agregarActividad(LocalDate.of(2025, 9, 1), new Actividad("Reunión", "Grupo de estudio"));

        // Imprimir agenda
        System.out.println("=== Agenda completa ===");
        agenda.imprimirAgenda();

        // Obtener próxima actividad desde hoy
        System.out.println("\n=== Próxima actividad desde hoy ===");
        Map.Entry<LocalDate, List<Actividad>> proxima = agenda.obtenerProximaActividad();
        if (proxima != null) {
            System.out.println(proxima.getKey() + ": " + proxima.getValue());
        } else {
            System.out.println("No hay actividades pendientes.");
        }

        // Reporte entre dos fechas
        System.out.println("\n=== Reporte del 1 al 6 de septiembre ===");
        SortedMap<LocalDate, List<Actividad>> reporte = agenda.generarReporte(
                LocalDate.of(2025, 9, 1),
                LocalDate.of(2025, 9, 6)
        );
        for (Map.Entry<LocalDate, List<Actividad>> entry : reporte.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
