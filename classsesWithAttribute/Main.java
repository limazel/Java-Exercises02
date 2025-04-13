package classsesWithAttribute;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("Iphone 15 Pro Max");
        product.setDescription("Apple's latest phone");
        product.setPrice(79000);
        product.setStockAmount(100);
        product.setColor("Black");
        product.getCode();

         
        System.out.println(product.getCode());   
    }

}
