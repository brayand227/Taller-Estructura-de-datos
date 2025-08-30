public class Trabajo {
    private String nombre;
    private int paginas;       // tamaño del trabajo
    private long timestamp;    // momento en que llegó

    public Trabajo(String nombre, int paginas, long timestamp) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.timestamp = timestamp;
    }

    public int getPaginas() {
        return paginas;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return nombre + " (" + paginas + " pág., t=" + timestamp + ")";
    }
}
