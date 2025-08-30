package MAPAS.INVENTARIO;

import java.util.HashMap;
import java.util.Map;

public class Tienda {

    private HashMap<String, Producto> productos;

    public Tienda() {
        productos = new HashMap<>();
    }

    public void agregraProductos(Producto producto) {
        String codigo = producto.getCodigo();
        productos.put(codigo, producto);
    }

    public void actualizar(String codigo, int can) {
        Producto producto = productos.get(codigo);
        if (producto != null) {
            producto.setStock(can);
        }
    }

    public double precio_por_codigo(String codigo) {

        return productos.get(codigo).getPrecio();

    }

    public void productos_faltantes() {
        System.out.println("\nProductos agotados:");
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            if (entry.getValue().getStock() == 0) {
                System.out.println(entry.getValue());
            }
        }
    }
}
