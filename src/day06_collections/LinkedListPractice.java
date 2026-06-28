package day06_collections;
import java.util.*;
public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        System.out.println(list);
        list.add(2);
        System.out.println(list);

        list.add(92);
        System.out.println(list);

        list.addFirst(123);
        System.out.println(list);

        list.addLast(2344);
        System.out.println(list);

        list.remove();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.peek();
        System.out.println(list);

        list.poll();
        System.out.println(list);

        list.pop();
        System.out.println(list);

    }
}
