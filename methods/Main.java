package methods;

public class Main {
    public static void main(String[] args) {
        int total = sum(10, 20);
        System.out.println("Total: " + total);
        int total2 = sum2(1,2,3,4,5,6,7,8,9);
        System.out.println("Total2: " + total2);
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

    public static int sum2(int... numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
