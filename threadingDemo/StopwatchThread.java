package threadingDemo;

public class StopwatchThread implements Runnable {
   
    private Thread thread;
    private String threadName;

    public StopwatchThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }
   
    @Override
    public void run() {
        System.out.println("Running " + threadName);

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                // Sleep for 1 second
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println(threadName + " interrupted.");
        }
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
