package collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add(2);
        list.add(3.0);
        list.add(3.0);
        list.add(3.0);
        list.add(3.0);

        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        for(Object i: list) {
         //   System.out.println(i);
        }
    }
}
