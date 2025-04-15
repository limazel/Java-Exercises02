package composition;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.price = 1000.0;
        productManager.add(product);

        DatabaseHelper.Connection connection = new DatabaseHelper.Connection();
        connection.connect();

        DatabaseHelper.Crud.create();
        DatabaseHelper.Crud.read();
        DatabaseHelper.Crud.update();
        DatabaseHelper.Crud.delete();
    }
}
