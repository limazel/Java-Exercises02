package workingWithFiles;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       getFileInfo();
    }

    public static void createFile() {
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

    public static void getFileInfo() {
        File file = new File("/Users/azad/Desktop/examples/java-BTK/workingWithFiles/student.txt");
        if(file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File writable: " + file.canWrite());
            System.out.println("File readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        } else {

        }
    }
}
