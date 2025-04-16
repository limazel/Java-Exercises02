package workingWithFiles;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/azad/Desktop/examples/java-BTK/workingWithFiles/student.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
