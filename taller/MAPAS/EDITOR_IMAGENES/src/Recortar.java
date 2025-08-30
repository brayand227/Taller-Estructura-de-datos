public class Recortar implements Operacion{

    @Override
    public void aplicar(EditorImagen editor){
        editor.setEstado(editor.getEstado() + " Imagen recortada");
    }

    @Override
    public void deshacer(EditorImagen editor){
        editor.setEstado(editor.getEstado().replace(" Imagen recortada",""));
    }

    @Override
    public String getNombre() {
        return "Imagen recortada";
    }
}
