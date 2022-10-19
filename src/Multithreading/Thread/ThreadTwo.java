package Thread;

public class ThreadTwo implements Runnable{
    ThreadOne t1;
    public ThreadTwo(ThreadOne t1) {
        this.t1 = t1;
    }

    public ThreadTwo() {

    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10; i++){
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ThreadTwo > " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
