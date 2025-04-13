package classes;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(); //classes are referance types
        customerManager.addCustomer();
        customerManager.removeCustomer();
        customerManager.updateCustomer();


        FourOperations fourOperations = new FourOperations();
        int result = fourOperations.add(5, 3);
        System.out.println("Addition Result: " + result);
    }   
}
