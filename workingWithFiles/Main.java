package workingWithFiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        writeFile();
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

    public static void readFile() {
        File file = new File("/Users/azad/Desktop/examples/java-BTK/workingWithFiles/student.txt");
        try {
            Scanner reader = new Scanner(file);
            while( reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
            try {
            BufferedWriter writer = new BufferedWriter( new FileWriter("/Users/azad/Desktop/examples/java-BTK/workingWithFiles/student.txt", true));
                writer.newLine();
                writer.write("Bahar");
                System.out.println("File written.");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
