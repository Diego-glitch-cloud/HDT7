public class Node<K, V> {
    ComparableAssociation<K, V> info;
    Node<K, V> hijoIzquierdo, hijoDerecho;

    public Node(ComparableAssociation<K, V> info) {
        if (info == null) {
            throw new IllegalArgumentException("El nodo no tiene datos");
        }
        this.info = info;
        this.hijoIzquierdo = this.hijoDerecho = null;
    }
    

    @Override
    public String toString() {
        return "[Clave: " + info.key + ", Valor: " + info.value + "]";
    }

}