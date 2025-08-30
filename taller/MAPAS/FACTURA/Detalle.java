// Clase para representar cada producto en la factura
class Detalle {
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    public Detalle(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public void agregarCantidad(int c) {
        this.cantidad += c;
    }

    public double getSubtotal() {
        return precioUnitario * cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
}
