package day11_multithreading;

public class CurrentThreadExample {

    public static void main(String[] args) {

        Thread current = Thread.currentThread();

        System.out.println("Current Thread Name : " + current.getName());

        System.out.println("Thread Priority : " + current.getPriority());

        System.out.println("Thread ID : " + current.getId());

    }
}