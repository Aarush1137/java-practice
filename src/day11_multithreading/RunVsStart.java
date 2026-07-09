package day11_multithreading;

class DemoThread extends Thread {

    @Override
    public void run() {

        System.out.println("Current Thread : " + Thread.currentThread().getName());

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class RunVsStart {

    public static void main(String[] args) {

        DemoThread t1 = new DemoThread();

        System.out.println("Calling run()");

        t1.run();

        System.out.println("----------------");

        DemoThread t2 = new DemoThread();

        System.out.println("Calling start()");

        t2.start();
    }
}