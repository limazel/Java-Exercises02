package conditionals;

public class Main{
    public static void main(String[] args) {
        int sayi = 19;
        if(sayi<20) {
            System.out.println("Sayi 20'den küçüktür.");
        } else if(sayi > 20) {
            System.out.println("Sayi 20'den büyüktür.");
        } else {
            System.out.println("Sayi 20'ye eşittir.");
        }
    }
}