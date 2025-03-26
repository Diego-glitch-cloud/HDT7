import org.junit.Test;
import static org.junit.Assert.*;

public class BSTTest {
    @Test
    public void testInsertar() {
        BST<String, Producto> bst = new BST<>();
        
        Producto product1 = new Producto("5001252387", "999.00", "999.00", 
                "Hisense Refrigerator", "Refrigerators");
        
        bst.insertar("5001252387", product1);
        
        Producto retrievedProduct = bst.buscarPorKey("5001252387");
        
        assertNotNull("El producto debería insertarse", retrievedProduct);
        assertEquals("Los detalles del producto deberían coincidir", product1, retrievedProduct);
    }
    
    @Test
    public void testBuscarPorKey() {
        BST<String, Producto> bst = new BST<>();
        
        Producto product1 = new Producto("5001252387", "999.00", "999.00", 
                "Hisense Refrigerator", "Refrigerators");
                Producto product2 = new Producto("1002543648", "1799.00", "1599.00", 
                "LG Refrigerator", "Refrigerators");
        
        bst.insertar("5001252387", product1);
        bst.insertar("1002543648", product2);
        
        Producto encontrado = bst.buscarPorKey("1002543648");
        
        assertNotNull("El producto debió ser encontrado", encontrado);
        assertEquals("El producto encontrado debería coincidir con el encontrado", 
                     product2.getProductName(), encontrado.getProductName());
    }
}