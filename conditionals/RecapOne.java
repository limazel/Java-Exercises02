package conditionals;

public class RecapOne {
    public static void main(String[] args) {
        int sayi1 = 19;
        int sayi2 = 25;
        int sayi3 = 2;   
        int enBuyuk = sayi1; 
        if(enBuyuk<sayi2) {
            enBuyuk = sayi2;
        } 
        if(enBuyuk<sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayi: " + enBuyuk);
    }
}
