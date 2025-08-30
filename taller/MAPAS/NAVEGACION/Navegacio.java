package MAPAS.NAVEGACION;

import java.util.ArrayDeque;

public class Navegacio {

    private ArrayDeque<String> pilaAtras;
    private ArrayDeque<String> pilaAdelante;
    private String paginaActual;

    public Navegacio() {
        pilaAtras = new ArrayDeque<>();
        pilaAdelante = new ArrayDeque<>();
        paginaActual = "Inicio";
    }

    // Visitar una nueva página
    public void visitar(String pagina) {
        if (paginaActual != null) {
            pilaAtras.push(paginaActual); // Guardar la actual en "atrás"
        }
        paginaActual = pagina;
        pilaAdelante.clear(); // Se pierde el historial de "adelante"
        System.out.println("🌐 Visitando: " + paginaActual);
    }

    // Ir atrás
    public void atras() {
        if (pilaAtras.isEmpty()) {
            System.out.println("⚠️ No hay páginas anteriores.");
            return;
        }
        pilaAdelante.push(paginaActual); // Guardar la actual en "adelante"
        paginaActual = pilaAtras.pop();
        System.out.println("⬅️ Atrás: " + paginaActual);
    }

    // Ir adelante
    public void adelante() {
        if (pilaAdelante.isEmpty()) {
            System.out.println("⚠️ No hay páginas siguientes.");
            return;
        }
        pilaAtras.push(paginaActual); // Guardar la actual en "atrás"
        paginaActual = pilaAdelante.pop();
        System.out.println("➡️ Adelante: " + paginaActual);
    }

    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("\n📌 Página actual: " + paginaActual);
        System.out.println("⬅️ Pila atrás: " + pilaAtras);
        System.out.println("➡️ Pila adelante: " + pilaAdelante + "\n");
    }

}
