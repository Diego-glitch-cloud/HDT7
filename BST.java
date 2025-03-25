package HDT7;

public class BST<K extends Comparable<K>, V> {
    private Node<K, V> nodoRaiz;

    public BST() {
        this.nodoRaiz = null;
    }

    // metodo para insertar un nuevo nodo 
    public void insertar(K key, V value) {
        nodoRaiz = agregarNodo(nodoRaiz, new ComparableAssociation<>(key, value));
    }

    private Node<K, V> agregarNodo(Node<K, V> nodoRaiz, ComparableAssociation<K, V> info) {
        if (nodoRaiz == null) {
            return new Node<>(info);
        }
        if (info.compareTo(nodoRaiz.info) < 0) {
            nodoRaiz.hijoIzquierdo = agregarNodo(nodoRaiz.hijoIzquierdo, info);
        } 
        
        else if (info.compareTo(nodoRaiz.info) > 0) {
            nodoRaiz.hijoDerecho = agregarNodo(nodoRaiz.hijoDerecho, info);
        }
        return nodoRaiz;
    }

    // Este metodo busca un elemento por clave
    public V buscarPorKey(K key) {
        return buscarNodoRecursivo(nodoRaiz, key);
    }

    private V buscarNodoRecursivo(Node<K, V> nodoActual, K claveBuscada) {
        if (nodoActual == null) {
            return null;
        }
    
        K claveNodo = nodoActual.info.key;
    
        if (claveNodo.equals(claveBuscada)) {
            return nodoActual.info.value;
        } 
    
        if (claveBuscada.compareTo(claveNodo) < 0) {
            return buscarNodoRecursivo(nodoActual.hijoIzquierdo, claveBuscada);
        } 
        
        else {
            return buscarNodoRecursivo(nodoActual.hijoDerecho, claveBuscada);
        }
    }    
}
