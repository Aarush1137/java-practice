package day05_inheritance;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Expected output true
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test Case 1: " + solution.containsDuplicate(nums1) + " (Expected: true)");

        // Test Case 2: Expected output false
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test Case 2: " + solution.containsDuplicate(nums2) + " (Expected: false)");

        // Test Case 3: Expected output true
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test Case 3: " + solution.containsDuplicate(nums3) + " (Expected: true)");
    }
}

// Copy ONLY the block below to paste back into LeetCode
class Solution {
    public boolean containsDuplicate(int[] nums) {
//        // Write your O(n) solution here using a HashSet
//        Arrays.sort(nums);
//        boolean a = false;
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i] == nums[i+1]){
//                a = true;
//                break;
//            }
//        }
        //second method
        HashSet<Integer> set = new HashSet<>();
        int a = nums.length;
        for (int i = 0; i < a; i++) {
            set.add(nums[i]);
        }
        int b = set.size();
        if(a>b){
            return true;
        }else {
            return false;
        }

    }
}