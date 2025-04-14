package polymorphism;

public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger() };
//        for (BaseLogger logger : loggers) {
//            logger.log("Hello World");
//        }

        CustomerManage customerManage = new CustomerManage(new DatabaseLogger());
        customerManage.add();
    }
}
