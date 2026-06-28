package day06_collections;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<String> list2 = new ArrayList<>();
        //ArrayList<Boolean> list3 = new ArrayList<>();

        //add elements
        list.add(1);
        list.add(12);
        list.add(3);
        System.out.println(list);

        //get
        int a = list.get(2);
        System.out.println(a);

        //ADD elements in between
        list.add(2,45);
        System.out.println(list);


        //set element
        list.set(1,424);
        System.out.println(list);

        //delete
        list.remove(2);
        System.out.println(list);
        //size
        int b = list.size();
        System.out.println(b);

        ///loops

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sort
        Collections.sort(list); //collections not collection
        System.out.println(list);

        list.addFirst(12);
        System.out.println(list);

        list.addLast(133);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);


    }
}
