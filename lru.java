import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1); // Get the value or return -1 if not found
    }

    public void put(int key, int value) {
        cache.put(key, value); // Add or update key-value pair
        if (cache.size() > capacity) { // Remove the least recently used item
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
    }

    public void display() {
        System.out.println(cache);
    }
}

public class LRU {
    public static void main(String[] args) {
        LRUCache lru = new LRUCache(3);
        lru.put(1, 10);
        lru.put(2, 20);
        lru.put(3, 30);
        lru.display(); 

        lru.get(1);
        lru.put(4, 40); 
        lru.display(); 
    }
}
