import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el árbol binario de búsqueda
        BST<String, Producto> productoBST = new BST<>();
        
        // Leer CSV
        Reader lector = new Reader();
        List<Producto> productos = lector.leerProductosCSV("datos.csv");
        
        // Llenar el árbol
        for (Producto producto : productos) {
            productoBST.insertar(producto.getSku(), producto);
        }
        
        // Búsqueda interactiva
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ingrese el SKU o (salir):");
            String sku = scanner.nextLine();
            
            if ("salir".equalsIgnoreCase(sku)) {
                break;
            }
            
            Producto productoEncontrado = productoBST.buscarPorKey(sku);
            
            if (productoEncontrado != null) {
                System.out.println("Producto solicitado:");
                System.out.println("SKU: " + productoEncontrado.getSku());
                System.out.println("Nombre del producto: " + productoEncontrado.getProductName());
                System.out.println("Categoría perteneciente: " + productoEncontrado.getCategory());
                System.out.println("Precio de venta en dolares: " + productoEncontrado.getPriceRetail());
                System.out.println("Precio actual en dolares: " + productoEncontrado.getPriceCurrent());
            } else {
                System.out.println("El producto no se encontró");
            }
        }
        
        scanner.close();
    }
}