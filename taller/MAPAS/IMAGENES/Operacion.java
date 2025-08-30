package MAPAS.IMAGENES;

public class Operacion {

    private String nombre;

    public Operacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
