package collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John", "Doe"));
        customers.add(new Customer(2, "Jane", "Smith"));
        customers.add(new Customer(3, "Alice", "Johnson"));

        for (Customer customer : customers) {
            System.out.println("ID: " + customer.id + ", Name: " + customer.name + ", Last Name: " + customer.lastName);
        }
    }
}
