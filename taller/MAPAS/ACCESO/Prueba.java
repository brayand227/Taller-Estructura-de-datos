package MAPAS.ACCESO;

public class Prueba {
    public static void main(String[] args) {
        String huella = "223";
        String huella1 = "34";
        String huella2 = "33";
        String huellaR = "223";
        String huellar1 = "33";
        Huella registroH = new Huella();
        registroH.agregar(huellar1);
        registroH.agregar(huellar1);
        registroH.agregar(huella);
        registroH.agregar(huella1);
        registroH.agregar(huella2);
        registroH.agregar(huellaR);

        registroH.mostrar();
        registroH.verificar_existe("223");


    }
}
