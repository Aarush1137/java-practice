package day10_streams;

import java.util.HashMap;
import java.util.Map;

class Roman {
    public int romanToInt(String s) {
        if(s==null||s.length()==0){
            return -1;
        }
        HashMap<Character,Integer> roamn = new HashMap<>();
        roamn.put('I',1);
        roamn.put('V',5);
        roamn.put('X',10);
        roamn.put('L',50);
        roamn.put('C',100);
        roamn.put('D',500);
        roamn.put('M',1000);

        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int currval = roamn.get(s.charAt(i));

            if (i < len - 1 && currval < roamn.get(s.charAt(i + 1))) {
                ans -= currval;
            } else {
                ans += currval;
            }
        }
        return ans;
    }

    // Main method to test your code locally in IntelliJ
    public static void main(String[] args) {
        Roman solver = new Roman();

        // Test Case 1: "III" -> 3
        String test1 = "III";
        System.out.println("Input: " + test1 + " -> Output: " + solver.romanToInt(test1) + " (Expected: 3)");

        // Test Case 2: "LVIII" -> 58
        String test2 = "LVIII";
        System.out.println("Input: " + test2 + " -> Output: " + solver.romanToInt(test2) + " (Expected: 58)");

        // Test Case 3: "MCMXCIV" -> 1994
        String test3 = "MCMXCIV";
        System.out.println("Input: " + test3 + " -> Output: " + solver.romanToInt(test3) + " (Expected: 1994)");
    }
}

//public class Solution {
//    public int romanToInt(String s) {
//        int total = 0;
//        int prevValue = 0; // Keeps track of the value to the right
//
//        // 1. Right-to-Left Traversal
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int currentValue = getValue(s.charAt(i));
//
//            // 2. Simplified Conditional Logic
//            // If the current numeral is smaller than the one to its right, subtract it.
//            if (currentValue < prevValue) {
//                total -= currentValue;
//            } else {
//                // Otherwise, add it.
//                total += currentValue;
//            }
//
//            // Update prevValue for the next iteration
//            prevValue = currentValue;
//        }
//
//        return total;
//    }
//
//    // 3. Switch Statement for O(1) lookups without object overhead
//    private int getValue(char c) {
//        switch (c) {
//            case 'I': return 1;
//            case 'V': return 5;
//            case 'X': return 10;
//            case 'L': return 50;
//            case 'C': return 100;
//            case 'D': return 500;
//            case 'M': return 1000;
//            default: return 0;
//        }
//    }
//
//    // Main method to test locally
//    public static void main(String[] args) {
//        Solution solver = new Solution();
//
//        System.out.println("Input: III -> Output: " + solver.romanToInt("III") + " (Expected: 3)");
//        System.out.println("Input: LVIII -> Output: " + solver.romanToInt("LVIII") + " (Expected: 58)");
//        System.out.println("Input: MCMXCIV -> Output: " + solver.romanToInt("MCMXCIV") + " (Expected: 1994)");
//    }
//}