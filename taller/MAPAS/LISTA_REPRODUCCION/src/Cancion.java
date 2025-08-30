public class Cancion {
    private String titulo;
    private String artista;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}
