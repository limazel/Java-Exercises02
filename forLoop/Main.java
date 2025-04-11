public class Main {
    public static void main(String[] args) {
        //for
        for(int i = 1; i<10; i++) {
            System.out.println(i);
        }
        System.out.println("End of for loop");

        int i = 1;
        while(i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("End of while loop");

        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while (j < 100);
    }


}