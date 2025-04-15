package composition;

public class ProductValidator {

    static {
        System.out.println("ProductValidator class loaded");
        System.out.println("Static block executed");
    }
    public static boolean isValid(Product product) {
        if(product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
