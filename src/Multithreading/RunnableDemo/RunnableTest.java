package RunnableDemo;

public class RunnableTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread running");

        Thread thread = new Thread(new RunnableDemo());

        thread.start();

        thread.sleep(5000);
        System.out.println("Main thread stopped");
    }
}
