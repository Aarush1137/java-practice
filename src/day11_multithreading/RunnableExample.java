package day11_multithreading;

class PrintTask implements Runnable {

    @Override
    public void run() {

        System.out.println("Runnable Started");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Value : " + i);

        }

        System.out.println("Runnable Finished");
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        PrintTask task = new PrintTask();

        Thread t1 = new Thread(task);

        t1.start();

    }
}