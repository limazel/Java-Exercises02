package readFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) /* throws FileNotFoundException */  {
       // BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
       try {
        
           BufferedReader reader = new BufferedReader(new FileReader("/Users/azad/Desktop/examples/java-BTK/readFileDemo/example.txt"));
       } catch (FileNotFoundException e) {
            e.printStackTrace();
       }
    }
}
