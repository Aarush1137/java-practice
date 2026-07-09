package day11_multithreading;

class FastThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Fast : " + i);

        }

    }
}

class SlowThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Slow : " + i);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                System.out.println(e);

            }

        }

    }
}

public class DifferentSpeedExample {

    public static void main(String[] args) {

        FastThread fast = new FastThread();

        SlowThread slow = new SlowThread();

        fast.start();

        slow.start();

    }
}