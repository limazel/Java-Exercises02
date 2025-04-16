package generics;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Hello");

        MyList<Customer> myClass = new MyList<Customer>();
        myClass.add(new Customer());
        myClass.add(new Customer());
    }
}
