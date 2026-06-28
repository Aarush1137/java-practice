package day06_collections;
import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds = new HashMap<>(); //name to ids

        empIds.put("Aarush",1);
        empIds.put("adi",2);
        empIds.put("jerry",3);
        empIds.put("akshat",4);
        System.out.println(empIds);
        System.out.println(empIds.get("akshat"));
        System.out.println(empIds.containsKey("jerry"));
        System.out.println(empIds.containsValue(4));
        empIds.put("Aarush",12);
        System.out.println(empIds);
        empIds.replace("Aarush",122);
        System.out.println(empIds);
        empIds.replace("Aarushqq",122);
        System.out.println(empIds);



    }
}
