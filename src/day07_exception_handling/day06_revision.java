//package day07_exception_handling;
//import java.util.ArrayList;
//
//public class ArrayListRevision {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<>();
//
//        // Common Methods
//        fruits.add("Apple");          // Adds to end
//        fruits.add(0, "Mango");       // Inserts at index
//        String first = fruits.get(0); // Retrieves by index
//        fruits.set(1, "Banana");      // Updates element at index
//        fruits.remove("Apple");       // Removes by object
//        int size = fruits.size();     // Returns total elements
//        boolean hasMango = fruits.contains("Mango"); // Checks existence
//    }
//}
//
//import java.util.LinkedList;
//
//public class LinkedListRevision {
//    public static void main(String[] args) {
//        LinkedList<String> tasks = new LinkedList<>();
//
//        // Common Methods
//        tasks.add("Task 2");
//        tasks.addFirst("Task 1");      // Adds to the beginning
//        tasks.addLast("Task 3");       // Adds to the end
//
//        String head = tasks.getFirst(); // Retrieves first
//        String tail = tasks.getLast();  // Retrieves last
//
//        tasks.removeFirst();           // Removes from beginning
//        tasks.removeLast();            // Removes from end
//    }
//}
//
//
//import java.util.HashSet;
//
//public class HashSetRevision {
//    public static void main(String[] args) {
//        HashSet<Integer> ids = new HashSet<>();
//
//        // Common Methods
//        ids.add(101);
//        ids.add(102);
//        ids.add(101); // Ignored, no duplicates allowed
//
//        boolean exists = ids.contains(102); // O(1) constant time lookup
//        ids.remove(101);                    // Removes element
//        boolean isEmpty = ids.isEmpty();    // Checks if set is empty
//        ids.clear();                        // Empties the entire set
//    }
//}
//
//
//import java.util.HashMap;
//
//public class HashMapRevision {
//    public static void main(String[] args) {
//        HashMap<String, Integer> scores = new HashMap<>();
//
//        // Common Methods
//        scores.put("Alice", 95);            // Adds key-value pair
//        scores.put("Bob", 88);
//        scores.put("Alice", 99);            // Overwrites value for "Alice"
//
//        int aliceScore = scores.get("Alice"); // Retrieves value by key
//        boolean hasAlice = scores.containsKey("Alice"); // Checks for key
//        boolean has99 = scores.containsValue(99);       // Checks for value
//
//        scores.remove("Bob");               // Removes pair by key
//
//        // Iterating (keys, values, or entries)
//        var allKeys = scores.keySet();      // Returns Set of keys
//        var allValues = scores.values();    // Returns Collection of values
//    }
//}