package MAPAS.LABORATORIO;

import java.util.LinkedList;

public class Turno {
    private LinkedList<String> cola;

    public Turno(){
        cola = new LinkedList<>();
    }
    public void agregarTurno(String estudiante) {
        cola.addLast(estudiante);
        System.out.println("Turno normal agregado: " + estudiante);

    }

    public void agregarTurnoPreferencial(String estudiante) {
        cola.addFirst(estudiante);
        System.out.println("⭐ Turno preferencial agregado: " + estudiante);
    }

    

    
} 
