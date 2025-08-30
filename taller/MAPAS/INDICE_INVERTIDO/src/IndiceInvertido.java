import java.util.HashMap;
import java.util.TreeSet;

public class IndiceInvertido {
    // Mapa palabra → conjunto de páginas
    private HashMap<String, TreeSet<Integer>> indice;

    public IndiceInvertido() {
        this.indice = new HashMap<>();
    }

    // Agregar una ocurrencia de palabra en cierta página
    public void agregarOcurrencia(String palabra, int pagina) {
        // Si no existe la palabra, se crea su conjunto
        indice.putIfAbsent(palabra, new TreeSet<>());
        // Se agrega la página al conjunto (TreeSet evita duplicados)
        indice.get(palabra).add(pagina);
    }

    // Consultar las páginas en orden creciente
    public TreeSet<Integer> consultar(String palabra) {
        return indice.getOrDefault(palabra, new TreeSet<>());
    }

    // Mostrar todo el índice
    public void imprimirIndice() {
        for (var entrada : indice.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        IndiceInvertido indice = new IndiceInvertido();

        indice.agregarOcurrencia("java", 10);
        indice.agregarOcurrencia("java", 3);
        indice.agregarOcurrencia("java", 10); // duplicado, no se repite
        indice.agregarOcurrencia("estructura", 7);
        indice.agregarOcurrencia("estructura", 15);
        indice.agregarOcurrencia("estructura", 7);

        System.out.println("Páginas de 'java': " + indice.consultar("java"));
        System.out.println("Páginas de 'estructura': " + indice.consultar("estructura"));
        System.out.println("Páginas de 'mapa' (no existe): " + indice.consultar("mapa"));

        System.out.println("\nÍndice completo:");
        indice.imprimirIndice();
    }
}
