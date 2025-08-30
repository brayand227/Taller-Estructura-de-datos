package MAPAS.FAVORITO;

public class Prueba {
    public static void main(String[] args) {
        Favoritos f = new Favoritos();

        Curso java = new Curso("Java");
        Curso python = new Curso("Python");
        Curso js = new Curso("JavaScript");
        Curso csharp = new Curso("C#");

        // Agregar cursos
        f.marcarFavorito(java);
        f.marcarFavorito(python);
        f.marcarFavorito(js);
        f.marcarFavorito(csharp);
        f.mostrarFavoritos(); // [Java, Python, JavaScript, C#]

        // Intentar duplicado
        f.marcarFavorito(python);
        f.mostrarFavoritos(); // [Java, Python, JavaScript, C#] (no duplica)

        // Eliminar y volver a insertar
        f.eliminarFavorito(python);
        f.marcarFavorito(python);
        f.mostrarFavoritos(); // [Java, JavaScript, C#, Python]
    }
    
}
