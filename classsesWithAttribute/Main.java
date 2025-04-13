package classsesWithAttribute;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        Product product2 = new Product(2, "Iphone 15 Plus", "Apple's Plus phone", 49000, 50, "White");
        product.setId(1);
        product.setName("Iphone 15 Pro Max");
        product.setDescription("Apple's latest phone");
        product.setPrice(79000);
        product.setStockAmount(100);
        product.setColor("Black");
        product.getCode();

         
        System.out.println(product.getCode());   
        System.out.println(product2.getCode());
    }

}
