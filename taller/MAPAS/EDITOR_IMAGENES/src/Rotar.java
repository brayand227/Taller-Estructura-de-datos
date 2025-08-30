public class Rotar implements Operacion{

    @Override
    public void aplicar(EditorImagen editor) {
        editor.setEstado(editor.getEstado() + " Imagen Rotada");
    }

    @Override
    public void deshacer(EditorImagen editor) {
        editor.setEstado(editor.getEstado().replace(" Imagen rotada", ""));
    }

    @Override
    public String getNombre() {
        return "Rotar";
    }
}
