package MAPAS.AGENDA;

import java.time.LocalDateTime;

class Reunion implements Comparable<Reunion> {
    private LocalDateTime fechaHora;
    private String asunto;

    public Reunion(LocalDateTime fechaHora, String asunto) {
        this.fechaHora = fechaHora;
        this.asunto = asunto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getAsunto() {
        return asunto;
    }

    // Ordenamos por fecha-hora
    @Override
    public int compareTo(Reunion otra) {
        return this.fechaHora.compareTo(otra.fechaHora);
    }

    @Override
    public String toString() {
        return fechaHora + " -> " + asunto;
    }
}