public class Main {
    public static void main(String[] args) {
        ListaReproduccion lista = new ListaReproduccion();

        lista.agregarCancion(new Cancion("Song 1", "Artista A"));
        lista.agregarCancion(new Cancion("Song 2", "Artista B"));
        lista.agregarCancion(new Cancion("Song 3", "Artista C"));
        lista.agregarCancion(new Cancion("Song 4", "Artista D"));

        lista.imprimirLista();
        System.out.println("\n▶ Reproduciendo: " + lista.getActual());

        lista.siguiente();
        lista.siguiente();
        System.out.println("\n▶ Reproduciendo: " + lista.getActual());

        lista.anterior();
        System.out.println("\n▶ Reproduciendo: " + lista.getActual());

        System.out.println("\n🔄 Moviendo 'Song 4' a la posición 1...");
        lista.moverCancion(3, 1);

        lista.imprimirLista();
    }
}
