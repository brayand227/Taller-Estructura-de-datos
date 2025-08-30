package MAPAS.NAVEGACION;

public class Main {

    public static void main(String[] args) {
        Navegacio nav = new Navegacio();

        nav.mostrarEstado();

        nav.visitar("google.com");
        nav.visitar("wikipedia.org");
        nav.visitar("openai.com");
        nav.mostrarEstado();

        nav.atras();
        nav.atras();
        nav.mostrarEstado();

        nav.adelante();
        nav.mostrarEstado();

        nav.visitar("github.com"); // Nueva página → se limpia "adelante"
        nav.mostrarEstado();
    }
    
}
