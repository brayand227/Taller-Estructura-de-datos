package CACHE;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacidad;

    public LRUCache(int capacidad) {
        // accessOrder=true hace que el orden sea por acceso (lectura/escritura)
        super(capacidad, 0.75f, true);
        this.capacidad = capacidad;
    }

    // Cuando el tamaño supere la capacidad, elimina el más viejo
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacidad;
    }
}
