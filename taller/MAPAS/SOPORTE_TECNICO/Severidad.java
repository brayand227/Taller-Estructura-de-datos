package MAPAS.SOPORTE_TECNICO;



enum Severidad {
    CRITICA(4), ALTA(3), MEDIA(2), BAJA(1);

    private int prioridad;

    Severidad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}

