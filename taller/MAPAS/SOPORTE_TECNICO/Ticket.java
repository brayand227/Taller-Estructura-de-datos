package MAPAS.SOPORTE_TECNICO;

import java.time.LocalDateTime;

class Ticket implements Comparable<Ticket> {
    private String descripcion;
    private Severidad severidad;
    private LocalDateTime fechaCreacion;

    public Ticket(String descripcion, Severidad severidad, LocalDateTime fechaCreacion) {
        this.descripcion = descripcion;
        this.severidad = severidad;
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() { return descripcion; }
    public Severidad getSeveridad() { return severidad; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }

    // Criterio de prioridad
    @Override
    public int compareTo(Ticket otro) {
        // Primero comparar severidad (mayor prioridad primero)
        int cmp = Integer.compare(otro.severidad.getPrioridad(), this.severidad.getPrioridad());
        if (cmp != 0) return cmp;
        // Si empatan, comparar fecha (más antigua primero)
        return this.fechaCreacion.compareTo(otro.fechaCreacion);
    }

    @Override
    public String toString() {
        return "[" + severidad + "] " + descripcion + " (" + fechaCreacion + ")";
    }
}