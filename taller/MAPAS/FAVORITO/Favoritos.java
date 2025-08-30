package MAPAS.FAVORITO;

import java.util.LinkedHashSet;



public class Favoritos {
    private LinkedHashSet<Curso> favoritos;

    public Favoritos() {
        favoritos = new LinkedHashSet<>();
    }

    public void marcarFavorito(Curso curso) {
        favoritos.add(curso); // Evita duplicados y mantiene orden
    }

    public void eliminarFavorito(Curso curso) {
        favoritos.remove(curso);
    }

    public void mostrarFavoritos() {
        System.out.println("⭐ Favoritos: " + favoritos);
    }

   
}

