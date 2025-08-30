import java.util.LinkedHashMap;
import java.util.Map;

public class FacturaSupermercado {
    public static void main(String[] args) {
        // Usamos LinkedHashMap para mantener el orden de escaneo
        LinkedHashMap<String, Detalle> factura = new LinkedHashMap<>();

        // Simulamos el escaneo de productos
        escanearProducto(factura, "Leche", 4000, 1);
        escanearProducto(factura, "Pan", 2500, 2);
        escanearProducto(factura, "Huevos", 15000, 1);
        escanearProducto(factura, "Pan", 2500, 1); // Se escanea otra vez "Pan"
        escanearProducto(factura, "Arroz", 8000, 2);

        // Imprimir la factura final
        imprimirFactura(factura);
    }

    private static void escanearProducto(LinkedHashMap<String, Detalle> factura,
            String nombre, double precio, int cantidad) {
        if (factura.containsKey(nombre)) {
            factura.get(nombre).agregarCantidad(cantidad);
        } else {
            factura.put(nombre, new Detalle(nombre, precio, cantidad));
        }
    }

    private static void imprimirFactura(LinkedHashMap<String, Detalle> factura) {
        double subtotal = 0;
        double iva;
        double total;

        System.out.println("===== FACTURA SUPERMERCADO =====");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Producto", "Cant.", "P.Unit", "Subtotal");
        System.out.println("------------------------------------------");

        for (Map.Entry<String, Detalle> entry : factura.entrySet()) {
            Detalle d = entry.getValue();
            double sub = d.getSubtotal();
            subtotal += sub;
            System.out.printf("%-10s %-10d %-10.2f %-10.2f\n",
                    d.getNombre(), d.getCantidad(), d.getPrecioUnitario(), sub);
        }

        iva = subtotal * 0.19; // IVA 19%
        total = subtotal + iva;

        System.out.println("------------------------------------------");
        System.out.printf("%-25s %-10.2f\n", "SUBTOTAL:", subtotal);
        System.out.printf("%-25s %-10.2f\n", "IVA (19%):", iva);
        System.out.printf("%-25s %-10.2f\n", "TOTAL:", total);
    }
}
