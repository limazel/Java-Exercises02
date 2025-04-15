package composition;

public class DatabaseHelper {
    public static class Connection {
        public void connect() {
            System.out.println("Connecting to the database...");
        }
    }

    public static class Crud {
        public static void create() {
            System.out.println("Creating a record in the database...");
        }

        public static void read() {
            System.out.println("Reading a record from the database...");
        }

        public static void update() {
            System.out.println("Updating a record in the database...");
        }

        public static void delete() {
            System.out.println("Deleting a record from the database...");
        }
    }
}
