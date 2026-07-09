package day11_multithreading;

class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Thread Started");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number : " + i);
        }

        System.out.println("Thread Finished");
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        System.out.println("Main Thread Started");

        MyThread t1 = new MyThread();

        t1.start();

        System.out.println("Main Thread Finished");
    }
}