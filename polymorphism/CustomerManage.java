package polymorphism;

public class CustomerManage {
    private BaseLogger logger;
    public CustomerManage(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Customer added");
        logger.log("Log message");
    }
}
