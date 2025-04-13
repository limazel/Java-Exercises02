package methodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.sum(5, 10);
        int sum2 = calculator.sum(5, 10, 15);
        System.out.println("Sum of 5 and 10: " + sum1);
        System.out.println("Sum of 5, 10 and 15: " + sum2);
    }
}
