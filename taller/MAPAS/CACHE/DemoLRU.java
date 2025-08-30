package CACHE;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLRU {

    // LRUCache como clase interna: un solo archivo, sin problemas de símbolos
    static class LRUCache<K, V> extends LinkedHashMap<K, V> {
        private final int capacidad;

        public LRUCache(int capacidad) {
            // accessOrder=true => orden por acceso (get/put/putIfAbsent)
            super(capacidad, 0.75f, true);
            if (capacidad <= 0) throw new IllegalArgumentException("Capacidad debe ser > 0");
            this.capacidad = capacidad;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacidad; // expulsa el más antiguo cuando excede
        }
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println("Inicial: " + cache); // {1=A, 2=B, 3=C}

        cache.get(1);                // 1 se promueve
        cache.put(4, "D");           // expulsa 2
        System.out.println("Tras get(1) y put(4): " + cache); // {3=C, 1=A, 4=D}

        cache.get(3);                // 3 se promueve
        cache.put(5, "E");           // expulsa 1
        System.out.println("Final: " + cache); // {4=D, 3=C, 5=E}
    }
}