package strings;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Hello I'm Azad. Your Developer";
        System.out.println(mesaj);

      /*   System.out.println("Length: " + mesaj.length());
        System.out.println("First character: " + mesaj.startsWith("H"));
        System.out.println("Last character: " + mesaj.charAt(mesaj.length() - 1));
        System.out.println(mesaj.lastIndexOf("z")); 
      */

      String yeniMesaj = mesaj.replace(" ", "-");
      System.out.println(yeniMesaj);
      System.out.println(mesaj.substring(0,3));

      for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
      }

      System.out.println(mesaj.toLowerCase());
      System.out.println(mesaj.toUpperCase());
      System.out.println(mesaj.trim()); // remove spaces from start and end
        System.out.println(mesaj.indexOf("Azad")); // find index of a string
    }
}
