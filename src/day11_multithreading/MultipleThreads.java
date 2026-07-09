package day11_multithreading;

class Worker extends Thread {

    public Worker(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + " : " + i);

        }
    }
}

public class MultipleThreads {

    public static void main(String[] args) {

        Worker t1 = new Worker("Download Thread");

        Worker t2 = new Worker("Music Thread");

        t1.start();

        t2.start();

    }
}