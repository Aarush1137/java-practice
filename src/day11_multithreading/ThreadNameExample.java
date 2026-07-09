package day11_multithreading;

class MyThreadName extends Thread {

    @Override
    public void run() {

        System.out.println("Current Thread : " + Thread.currentThread().getName());

    }
}

public class ThreadNameExample {

    public static void main(String[] args) {

        MyThreadName t1 = new MyThreadName();

        MyThreadName t2 = new MyThreadName();

        t1.setName("Download Thread");

        t2.setName("Music Thread");

        t1.start();

        t2.start();

    }
}