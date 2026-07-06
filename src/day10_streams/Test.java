package day10_streams;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        String s1 = "abcd";
        String t1 = "abcde";
        char result1 = solution.findTheDifference(s1, t1);
        System.out.println("Test 1 - Expected: e, Got: " + result1);

        // Test Case 2
        String s2 = "";
        String t2 = "y";
        char result2 = solution.findTheDifference(s2, t2);
        System.out.println("Test 2 - Expected: y, Got: " + result2);

        // Test Case 3 (Edge Case: Duplicate characters)
        String s3 = "a";
        String t3 = "aa";
        char result3 = solution.findTheDifference(s3, t3);
        System.out.println("Test 3 - Expected: a, Got: " + result3);
    }
}

//class Solution {
//    public char findTheDifference(String s, String t) {
//        char[] a1 = s.toCharArray();
//        char[] a2 = t.toCharArray();
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//        for (int i = 0; i < a1.length; i++) {
//            if(a1[i] != a2[i]){
//                return a2[i];
//            }
//        }
//
//        return a2[a2.length-1];
//    }
//}

//or
//class Solution {
//    public char findTheDifference(String s, String t) {
//        int sumS = 0;
//        int sumT = 0;
//
//        // Add up all the ASCII values of string s
//        for (char c : s.toCharArray()) {
//            sumS += c;
//        }
//
//        // Add up all the ASCII values of string t
//        for (char c : t.toCharArray()) {
//            sumT += c;
//        }
//
//        // The difference is the extra character's ASCII value
//        // We cast it back to a char before returning
//        return (char) (sumT - sumS);
//    }
//}

//or

//class Solution {
//    public char findTheDifference(String s, String t) {
//        int sum = 0;
//
//        // Add all characters from t
//        for (char c : t.toCharArray()) sum += c;
//
//        // Subtract all characters from s
//        for (char c : s.toCharArray()) sum -= c;
//
//        return (char) sum;
//    }
//}

class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) result ^= c;
        for (char c : t.toCharArray()) result ^= c;
        return result;
    }
}