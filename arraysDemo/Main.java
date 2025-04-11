package arraysDemo;

public class Main {
    public static void main(String[] args) {

    String customer1 = "Azad";
    String customer2 = "Savaş";
    String customer3 = "Bahar";
    String customer4 = "Azra";

    System.out.println(customer1);
    System.out.println(customer2);
    System.out.println(customer3);
    System.out.println(customer4);
    System.out.println("-----------------");

    String[] customers = new String[4];
    customers[0] = "Azad";
    customers[1] = "Savaş";
    customers[2] = "Bahar";
    customers[3] = "Azra";

    for(int i = 0; i < customers.length; i++) {
        System.out.println(customers[i]);
    }
    System.out.println("-----------------");


    for (String customer : customers) {
        System.out.println(customer);
    }

}

}