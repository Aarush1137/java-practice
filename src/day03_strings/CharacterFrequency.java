package day03_strings;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            // If the character is already in the map, add 1 to its count.
            // getOrDefault returns 0 if the character isn't in the map yet.
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the map
        for (char c : charCountMap.keySet()) {
            System.out.println(c + " : " + charCountMap.get(c));
        }
    }
}

//public class CharacterFrequency {
//    public static void main(String[] args) {
//        String str = "hello";
//
//        // Array to keep track of characters we've already counted
//        boolean[] visited = new boolean[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//            if (visited[i]) continue; // Skip if already counted
//
//            int count = 1;
//            for (int j = i + 1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                    visited[j] = true; // Mark duplicate as visited
//                }
//            }
//            System.out.println(str.charAt(i) + " : " + count);
//        }
//    }
//}