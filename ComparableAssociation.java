public class ComparableAssociation<K extends Comparable<K>, V> implements Comparable<ComparableAssociation<K, V>> {
    K key;
    V value;

    // Constructor 
    public ComparableAssociation(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(ComparableAssociation<K, V> other) {
        return this.key.compareTo(other.key); 
    }
}
