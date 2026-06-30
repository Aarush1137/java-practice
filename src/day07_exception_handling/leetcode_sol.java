//package day07_exception_handling;
////704. Binary Search
//class Solution {
//    public int search(int[] nums, int target) {
//        int low =0;
//        int high = nums.length-1;
//        while(low <= high){
//            int mid = low + (high - low) / 2;
//            if(nums[mid] == target){
//                return mid;
//            }else if(nums[mid]<target){
//                low = mid+1;
//            }else{
//                high =mid-1;
//            }
//        }
//        return -1;
//    }
//}

//26. Remove Duplicates from Sorted Array

//package day08_leetcode;
//
//import java.util.*;
//class Solution {
//
//    public int removeDuplicates(int[] nums) {
//        if (nums.length == 0)
//            return 0;
//        int write = 1;
//        for (int read = 1; read < nums.length; read++) {
//            if (nums[read] != nums[read - 1]) {
//                nums[write] = nums[read];
//                write++;
//            }
//        }
//        return write;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        // --- Test Case 1 ---
//        int[] nums1 = {1, 1, 2};
//        int[] expectedNums1 = {1, 2};
//        System.out.println("--- Test Case 1 ---");
//        System.out.println("Input:    " + Arrays.toString(nums1));
//
//        int k1 = solution.removeDuplicates(nums1);
//
//        System.out.println("Returned k: " + k1);
//        System.out.println("Modified:   " + Arrays.toString(Arrays.copyOf(nums1, k1)));
//        System.out.println("Expected:   " + Arrays.toString(expectedNums1));
//        System.out.println("Result:     " + (checkResult(nums1, expectedNums1, k1) ? "PASS ✅" : "FAIL ❌"));
//        System.out.println();
//
//        // --- Test Case 2 ---
//        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] expectedNums2 = {0, 1, 2, 3, 4};
//        System.out.println("--- Test Case 2 ---");
//        System.out.println("Input:    " + Arrays.toString(nums2));
//
//        int k2 = solution.removeDuplicates(nums2);
//
//        System.out.println("Returned k: " + k2);
//        System.out.println("Modified:   " + Arrays.toString(Arrays.copyOf(nums2, k2)));
//        System.out.println("Expected:   " + Arrays.toString(expectedNums2));
//        System.out.println("Result:     " + (checkResult(nums2, expectedNums2, k2) ? "PASS ✅" : "FAIL ❌"));
//    }
//
//    private static boolean checkResult(int[] nums, int[] expectedNums, int k) {
//        if (k != expectedNums.length) {
//            return false;
//        }
//        for (int i = 0; i < k; i++) {
//            if (nums[i] != expectedNums[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//}