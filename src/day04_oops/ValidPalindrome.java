package day04_oops;

import java.util.*;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        // TODO: Write your code here and paste it back to LeetCode later!
        String s1 = s.toLowerCase();
        String s2 = s1.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            reversed += s2.charAt(i);
        }
        boolean b =s2.equalsIgnoreCase(reversed) ? true:false;
        return b;
    }

    // --- Test Harness (Run this in IntelliJ to test your code) ---
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Test Case 1
        String s1 = "A man, a plan, a canal: Panama";
        boolean expected1 = true;
        boolean actual1 = solution.isPalindrome(s1);
        printResult(1, s1, expected1, actual1);

        // Test Case 2
        String s2 = "race a car";
        boolean expected2 = false;
        boolean actual2 = solution.isPalindrome(s2);
        printResult(2, s2, expected2, actual2);

        // Test Case 3
        String s3 = " ";
        boolean expected3 = true;
        boolean actual3 = solution.isPalindrome(s3);
        printResult(3, s3, expected3, actual3);

        // Test Case 4 (The famous tricky case mentioned in discussions!)
        String s4 = "0P";
        boolean expected4 = false;
        boolean actual4 = solution.isPalindrome(s4);
        printResult(4, s4, expected4, actual4);
    }

    private static void printResult(int testNum, String input, boolean expected, boolean actual) {
        System.out.println("Test Case " + testNum + ":");
        System.out.println("  Input:    \"" + input + "\"");
        System.out.println("  Expected: " + expected);
        System.out.println("  Actual:   " + actual);
        if (expected == actual) {
            System.out.println("  Result:   ✅ PASSED");
        } else {
            System.out.println("  Result:   ❌ FAILED");
        }
        System.out.println("------------------------------------");
    }
}