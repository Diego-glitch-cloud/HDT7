package HDT7;

public class ComparableAssociation<K, V> implements Comparable<ComparableAssociation<K, V>> {
    K key;
    V value;

    public ComparableAssociation(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(ComparableAssociation<K, V> other) {
        return ((Comparable<K>) this.key).compareTo(other.key);
    }
}