package day11_multithreading;

class ChildThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Child : " + i);

        }

    }
}

public class JoinExample {

    public static void main(String[] args) {

        ChildThread t1 = new ChildThread();

        t1.start();

        try {

            t1.join();

        } catch (InterruptedException e) {

            System.out.println(e);

        }

        System.out.println("Main Thread Finished");

    }
}