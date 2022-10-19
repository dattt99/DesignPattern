package ThreadHello;

public class HelloThread extends Thread{

    @Override
    public void run(){
        int index = 1;

        for(int i = 0; i<10; i++){
            System.out.println("HelloThread Running" + index++);

            try {
                Thread.sleep(1030);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(" -==> HelloThread stopped");
    }
}
