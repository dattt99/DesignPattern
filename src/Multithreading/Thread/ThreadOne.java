package Thread;

public class ThreadOne extends Thread{
    @Override
    public void run() {
        for(int i =0 ; i<10 ; i++){
            System.out.println("ThreadOne" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
