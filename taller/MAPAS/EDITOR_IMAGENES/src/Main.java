import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EditorImagen imagen = new EditorImagen("Editor Original");
        Stack<Operacion> historial = new Stack<>();

        Operacion op1 = new Rotar();
        op1.aplicar(imagen);
        historial.push(op1);

        Operacion op2 = new Recortar();
        op2.aplicar(imagen);
        historial.push(op2);

        Operacion op3 = new Brillo();
        op3.aplicar(imagen);
        historial.push(op3);

        System.out.print("Estado actual: " + imagen.getEstado());

        //para deshacer las 3 operaciones
        for (int i= 0; i<3; i++){
            Operacion ultima = historial.pop();
            ultima.deshacer(imagen);
            System.out.print(" Deshacer" + ultima.getNombre() + " - > " + imagen.getEstado());
        }

    }
}