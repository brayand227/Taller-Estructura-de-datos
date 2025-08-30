import java.util.*;

public class RankingDeportistas {
    public static void main(String[] args) {
        // Comparator: puntaje desc, apellido asc, nombre asc
        Comparator<Deportista> comparador = Comparator
                .comparingInt(Deportista::getPuntaje).reversed()
                .thenComparing(Deportista::getApellido)
                .thenComparing(Deportista::getNombre);

        TreeSet<Deportista> ranking = new TreeSet<>(comparador);

        // Insertamos deportistas (con empates en puntaje y apellido)
        ranking.add(new Deportista("Ana", "Gomez", 95));
        ranking.add(new Deportista("Luis", "Martinez", 100));
        ranking.add(new Deportista("Pedro", "Gomez", 95)); // empate en puntaje con Ana
        ranking.add(new Deportista("Maria", "Lopez", 100)); // empate en puntaje con Luis
        ranking.add(new Deportista("Sofia", "Alvarez", 80));
        ranking.add(new Deportista("Carlos", "Martinez", 100)); // empate en puntaje y apellido
        ranking.add(new Deportista("Jorge", "Perez", 70));
        ranking.add(new Deportista("Lucia", "Diaz", 95));
        ranking.add(new Deportista("Diego", "Gomez", 85));
        ranking.add(new Deportista("Paula", "Ramos", 60));
        ranking.add(new Deportista("Esteban", "Gomez", 95));

        // Listar top 10
        System.out.println("=== TOP 10 DEPORTISTAS ===");
        int contador = 0;
        for (Deportista d : ranking) {
            System.out.println((++contador) + ". " + d);
            if (contador == 10) break;
        }
    }
}