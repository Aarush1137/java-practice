package day06_collections;
import java.util.*;
public class HashSetPractice {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("aarush");
        names.add("rahul");
        names.add("adi");
        System.out.println(names.add("akshat"));
        System.out.println(names);
        names.remove("adi");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("aarush"));
        System.out.println(names.isEmpty());
//        names.clear();
//        System.out.println(names);
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("__________________________");
        names.forEach(System.out::println);
        System.out.println("__________________________");
    Iterator<String> nameite = names.iterator();
    while(nameite.hasNext()){
        System.out.println(nameite.next());
        }


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(3);
        list1.add(3);
        System.out.println(list1);

        System.out.println("_______________________");

        HashSet<Integer> list2 = new HashSet<>(list1);
        //or list2.addAll(list1);
        System.out.println(list2);
    }
}
