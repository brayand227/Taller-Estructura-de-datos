public interface Operacion {
    void aplicar(EditorImagen editor);
    void deshacer(EditorImagen editor);
    String getNombre();

}
