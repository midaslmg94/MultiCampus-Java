package generic;

public class Entry<K,V> { // 데이터 타입을 미리 정해놓지 않음
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return this.key;
    }
    public V getValue() {
        return this.value;
    }
}
