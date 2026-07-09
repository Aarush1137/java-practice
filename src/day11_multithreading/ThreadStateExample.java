package day11_multithreading;

class StateThread extends Thread {

    @Override
    public void run() {

        System.out.println("Running...");

    }
}

public class ThreadStateExample {

    public static void main(String[] args) {

        StateThread t1 = new StateThread();

        System.out.println(t1.getState());

        t1.start();

        System.out.println(t1.getState());

    }
}