//package day06_collections;
//import java.util.*;
//
//public class JewelsandStones {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        // Test Case 1
//        String jewels1 = "aA";
//        String stones1 = "aAAbbbb";
//        int expected1 = 3;
//        int result1 = solution.numJewelsInStones(jewels1, stones1);
//        printResult(1, expected1, result1);
//
//        // Test Case 2
//        String jewels2 = "z";
//        String stones2 = "ZZ";
//        int expected2 = 0;
//        int result2 = solution.numJewelsInStones(jewels2, stones2);
//        printResult(2, expected2, result2);
//    }
//
//    private static void printResult(int testCaseNum, int expected, int actual) {
//        if (expected == actual) {
//            System.out.println("✅ Test Case " + testCaseNum + " PASSED!");
//        } else {
//            System.out.println("❌ Test Case " + testCaseNum + " FAILED! Expected: " + expected + ", but got: " + actual);
//        }
//    }
//}
//
//class Solution {
//    public int numJewelsInStones(String jewels, String stones) {
//        int count = 0;
//        Set<Character> jewelSet = new HashSet<>();
//        for (char j : jewels.toCharArray()) {
//            jewelSet.add(j);
//        }
//
//        for (char s : stones.toCharArray()) {
//            if (jewelSet.contains(s)) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//}