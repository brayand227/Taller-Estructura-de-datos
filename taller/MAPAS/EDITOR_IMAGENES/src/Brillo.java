public class Brillo implements Operacion{

    @Override
    public void aplicar(EditorImagen editor){
        editor.setEstado(editor.getEstado() + " Brillo +");
    }

    @Override
    public void deshacer(EditorImagen editor){
        editor.setEstado(editor.getEstado().replace(" Brillo +",""));
    }

    @Override
    public String getNombre() {
        return "Brillo";
    }
}
