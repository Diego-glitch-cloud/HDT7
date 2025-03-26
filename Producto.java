public class Producto {
    private String sku;
    private String priceRetail;
    private String priceCurrent;
    private String productName;
    private String category;

    public Producto(String sku, String priceRetail, String priceCurrent, 
                   String productName, String category) {
        this.sku = sku;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
        this.category = category;
    }

    // Getters
    public String getSku() { return sku; }
    public String getPriceRetail() { return priceRetail; }
    public String getPriceCurrent() { return priceCurrent; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Producto{" +
               "SKU='" + sku + '\'' +
               ", Retail Price='" + priceRetail + '\'' +
               ", Current Price='" + priceCurrent + '\'' +
               ", Name='" + productName + '\'' +
               ", Category='" + category + '\'' +
               '}';
    }
}