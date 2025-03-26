import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List<Producto> leerProductosCSV(String filePath) {
        List<Producto> productos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip header line
            br.readLine();
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] valores = line.split(",");
                
                // Ensure we have enough columns
                if (valores.length >= 19) {
                    String category = valores[0];
                    String sku = valores[6];
                    String priceRetail = valores[9];
                    String priceCurrent = valores[10];
                    String productName = valores[18];
                    
                    Producto producto = new Producto(sku, priceRetail, priceCurrent, productName, category);
                    productos.add(producto);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return productos;
    }
}