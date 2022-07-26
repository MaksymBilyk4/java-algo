package HashMap;

import java.util.Map;

public class HashMap {
    private final static int INITIAL_CAPACITY = 16;
    private Entry<String, Integer>[] buckets = new Entry[INITIAL_CAPACITY];

    public void put(String key, Integer value) {
        int hash = hash(key);
        int index = bucketIndex(hash);
        if (buckets[index] != null) {
            Entry<String, Integer> current = buckets[index];
            for (; current != null; current = current.next) {
                if (hash(current.getKey()) == hash) {
                    if (current.getKey() == key || current.getKey().equals(key)) {
                        current.setValue(value);
                        return;
                    }
                }
            }
            Entry<String, Integer> newHeadEntry = new Entry<>(key, value, buckets[index]);
            buckets[index] = newHeadEntry;
        } else {
            buckets[index] = new Entry<>(key, value, null);
        }
    }

    public Integer get(String key) {
        int hash = hash(key);
        int index = bucketIndex(hash);

        if (buckets[index] != null) {
            Entry<String, Integer> current = buckets[index];
            for (; current != null; current = current.next) {
                if (hash(current.getKey()) == hash) {
                    if (current.getKey() == key || current.getKey().equals(key)) {
                        return current.getValue();
                    }
                }
            }
        }

        return null;
    }

    private int hash(String key) {
        return key == null ? 0 : key.hashCode();
    }

    private int bucketIndex(int hash) {
        return hash % buckets.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < buckets.length; i++) {
            sb.append("[" + i + "]").append(" -> ");
            Entry<String, Integer> current = buckets[i];
            for (; current != null; current = current.next) {
                sb.append(current.getValue());
                if (current.next != null) {
                    sb.append(",");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    private static class Entry<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return value;
        }
    }
}
