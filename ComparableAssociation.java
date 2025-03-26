public class ComparableAssociation<K, V> implements Comparable<ComparableAssociation<K, V>> {
    K key;
    V value;

    // compara 2 objetos basandose en su key y valor 
    public ComparableAssociation(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(ComparableAssociation<K, V> other) {
        return ((Comparable<K>) this.key).compareTo(other.key);
    }
}