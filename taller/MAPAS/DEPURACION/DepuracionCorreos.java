
import java.util.*;

public class DepuracionCorreos {
    public static void main(String[] args) {
        // Conjunto inicial de correos
        Set<String> correos = new HashSet<>(Arrays.asList(
                "ana@gmail.com",
                "luis@yahoo.com",
                "pedro@outlook.com",
                "maria@hotmail.com",
                "juan@gmail.com",
                "sofia@empresa.com"
        ));

        // Lista de dominios vetados
        Set<String> vetados = new HashSet<>(Arrays.asList("gmail.com", "hotmail.com"));

        System.out.println("Tamaño inicial: " + correos.size());
        System.out.println("Correos antes: " + correos);

        // Iterar con Iterator y eliminar
        Iterator<String> it = correos.iterator();
        while (it.hasNext()) {
            String correo = it.next();
            String dominio = correo.substring(correo.indexOf("@") + 1);
            if (vetados.contains(dominio)) {
                it.remove(); // eliminación segura
            }
        }

        System.out.println("\nTamaño final: " + correos.size());
        System.out.println("Correos después: " + correos);
    }
}
