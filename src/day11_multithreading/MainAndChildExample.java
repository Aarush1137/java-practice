package day11_multithreading;

class Child extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Child Thread : " + i);

        }

    }
}

public class MainAndChildExample {

    public static void main(String[] args) {

        Child t1 = new Child();

        t1.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Main Thread : " + i);

        }

    }
}