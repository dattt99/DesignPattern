package Thread;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
//        System.out.println("start");
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0 ; i<100 ;i++){
//                    System.out.println("Thread 1 >" + i);
//                }
//            }
//        });
//        t.start();
//
//        ThreadOne threadOne = new ThreadOne();
//        threadOne.start();
//
//        ThreadTwo threadTwo = new ThreadTwo();
//        new Thread(threadTwo).start();
//
//        System.out.println("Ends");
    }
}
