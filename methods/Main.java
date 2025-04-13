package methods;

public class Main {
    public static void main(String[] args) {
        int total = sum(10, 20);
        System.out.println("Total: " + total);
    }

    public static void add() {
        System.out.println("Added.");
    }

    public static void update() {
        System.out.println("Updated.");
    }

    public static void delete() {
        System.out.println("Deleted.");
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
}
