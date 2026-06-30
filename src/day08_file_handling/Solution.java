package day08_file_handling;

import java.util.*;
//Valid Parentheses
//public class Solution {
//
//    public boolean isValid(String s) {
//        // If the string has an odd length, it cannot have valid pairs
//        if (s.length() % 2 != 0) {
//            return false;
//        }
//
//        Stack<Character> stack = new Stack<>();
//
//        // Traverse through each character in the string
//        for (char c : s.toCharArray()) {
//            // If it's an opening bracket, push its corresponding closing bracket onto the stack
//            if (c == '(') {
//                stack.push(')');
//            } else if (c == '{') {
//                stack.push('}');
//            } else if (c == '[') {
//                stack.push(']');
//            }
//            // If it's a closing bracket, check if it matches the top of the stack
//            else {
//                if (stack.isEmpty() || stack.pop() != c) {
//                    return false;
//                }
//            }
//        }
//
//        // If the stack is empty, all brackets were properly matched and closed
//        return stack.isEmpty();
//    }
//
//    // Tester main method for IntelliJ
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        // Test cases from LeetCode and edge cases
//        String[] testCases = {
//                "()",       // Example 1 (True)
//                "()[]{}",   // Example 2 (True)
//                "(]",       // Example 3 (False)
//                "([])",     // Example 4 (True)
//                "([)]",     // Example 5 (False)
//                "{[]}",     // Nested (True)
//                "[",        // Single open (False)
//                "]",        // Single close (False)
//                ""          // Empty string (True/False depending on constraint handling)
//        };
//
//        System.out.println("--- Running Test Cases ---");
//        for (int i = 0; i < testCases.length; i++) {
//            String tc = testCases[i];
//            boolean result = solution.isValid(tc);
//            System.out.printf("Test Case %d: \"%s\" -> Result: %b%n", i + 1, tc, result);
//        }
//    }
//}

//53. Maximum Subarray
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        // Test Case 1
//        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int expected1 = 6;
//        int result1 = solution.maxSubArray(nums1);
//        printResult(1, nums1, expected1, result1);
//
//        // Test Case 2
//        int[] nums2 = {1};
//        int expected2 = 1;
//        int result2 = solution.maxSubArray(nums2);
//        printResult(2, nums2, expected2, result2);
//
//        // Test Case 3
//        int[] nums3 = {5, 4, -1, 7, 8};
//        int expected3 = 23;
//        int result3 = solution.maxSubArray(nums3);
//        printResult(3, nums3, expected3, result3);
//    }
//
//    private static void printResult(int testNum, int[] nums, int expected, int actual) {
//        System.out.println("--- Test Case " + testNum + " ---");
//        System.out.println("Input: " + Arrays.toString(nums));
//        System.out.println("Expected: " + expected);
//        System.out.println("Actual:   " + actual);
//        if (actual == expected) {
//            System.out.println("Result:   ✅ PASSED");
//        } else {
//            System.out.println("Result:   ❌ FAILED");
//        }
//        System.out.println();
//    }
//}
//
//// Paste your LeetCode submission class below:
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int res = nums[0];
//        int maxEnding = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
//            res = Math.max(res, maxEnding);
//        }
//        return res;
//    }
//}