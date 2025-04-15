package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3};
    try {
        System.out.println(numbers[3]);
    } catch(StringIndexOutOfBoundsException exception) {
        System.out.println("String index out of bounds: " + exception.getMessage());
    } catch (ArrayStoreException exception) {
        System.out.println("Array store exception: " + exception.getMessage());
    } catch (ArrayIndexOutOfBoundsException exception) {
        System.out.println(exception.getMessage());
    } catch (Exception exception) {
        System.out.println("Array index out of bounds: " + exception.getMessage());
    } finally {
        System.out.println("This block always executes.");
    }
  }
}