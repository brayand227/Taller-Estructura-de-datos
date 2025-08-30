import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Definimos los tramos con la clave = peso mínimo del tramo
        TreeMap<Integer, BigDecimal> tarifas = new TreeMap<>();

        tarifas.put(0, new BigDecimal("5000"));    // hasta 1000 kg
        tarifas.put(1001, new BigDecimal("10000")); // de 1001 a 2000 kg
        tarifas.put(2001, new BigDecimal("15000")); // de 2001 a 3000 kg
        tarifas.put(3001, new BigDecimal("20000")); // de 3001 kg en adelante

        // Ejemplos de consulta
        int pesoVehiculo1 = 850;
        int pesoVehiculo2 = 1500;
        int pesoVehiculo3 = 2700;
        int pesoVehiculo4 = 5000;

        System.out.println("Vehículo de " + pesoVehiculo1 + " kg -> Tarifa: "
                + obtenerTarifa(tarifas, pesoVehiculo1));
        System.out.println("Vehículo de " + pesoVehiculo2 + " kg -> Tarifa: "
                + obtenerTarifa(tarifas, pesoVehiculo2));
        System.out.println("Vehículo de " + pesoVehiculo3 + " kg -> Tarifa: "
                + obtenerTarifa(tarifas, pesoVehiculo3));
        System.out.println("Vehículo de " + pesoVehiculo4 + " kg -> Tarifa: "
                + obtenerTarifa(tarifas, pesoVehiculo4));
    }

    public static BigDecimal obtenerTarifa(TreeMap<Integer, BigDecimal> tarifas, int peso) {
        // Busca el tramo que corresponde al peso
        Map.Entry<Integer, BigDecimal> tramo = tarifas.floorEntry(peso);

        if (tramo == null) {
            // Si no existe un tramo inferior, usamos el más bajo (ceilingEntry)
            tramo = tarifas.ceilingEntry(peso);
        }

        return tramo.getValue();
    }
}
