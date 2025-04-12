package projects;

public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 20;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + target + " is found in the array.");
        } else {
            System.out.println("Number " + target + " is not found in the array.");
        }
    }
}
