package abstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("MySQL data retrieved");
    }
}
