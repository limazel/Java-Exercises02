package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3};
    try {
        System.out.println(numbers[3]);
    } catch (Exception exception){
        System.out.println(exception.getMessage());
    } finally {
        System.out.println("This block always executes.");
    }
  }
}