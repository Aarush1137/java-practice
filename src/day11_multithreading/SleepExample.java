package day11_multithreading;

class SleepThread extends Thread {

    @Override
    public void run() {

        for (int i = 5; i >= 1; i--) {

            System.out.println(i);

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println(e);

            }

        }

        System.out.println("Blast Off!");

    }
}

public class SleepExample {

    public static void main(String[] args) {

        SleepThread t1 = new SleepThread();

        t1.start();

    }
}