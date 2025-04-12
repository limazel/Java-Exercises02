package projects;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;

        if (number < 2) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        for ( int i = 2; i <=number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


    }
}
