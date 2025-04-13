package classsesWithAttribute;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.id = 1;
        product.name = "Phone";
        product.description = "Apple Phone";
        product.price = 1000;
        product.stockAmount = 10;

        ProductManager productManager = new ProductManager();
        productManager.add(product);        
    }

}
