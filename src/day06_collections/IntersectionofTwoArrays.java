//package day06_collections;
//import java.util.*;
//
//public class IntersectionofTwoArrays {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        // Test Case 1
//        int[] nums1_ex1 = {1, 2, 2, 1};
//        int[] nums2_ex1 = {2, 2};
//        int[] result1 = solution.intersection(nums1_ex1, nums2_ex1);
//        System.out.println("Test Case 1 Result: " + Arrays.toString(result1)); // Expected: [2]
//
//        // Test Case 2
//        int[] nums1_ex2 = {4, 9, 5};
//        int[] nums2_ex2 = {9, 4, 9, 8, 4};
//        int[] result2 = solution.intersection(nums1_ex2, nums2_ex2);
//        System.out.println("Test Case 2 Result: " + Arrays.toString(result2)); // Expected: [4, 9] or [9, 4]
//    }
//}
//
//class Solution {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        // Write your logic here
//        HashSet<Integer> list = new HashSet<>();
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if(nums1[i] == nums2[j]){
//                    list.add(nums1[i]);
//                }
//            }
//        }
//        int[] result = new int[list.size()];
//        int idx = 0;
//        for (int num : list) {
//            result[idx++] = num;
//        }
//        return result; // Placeholder return
//    }
//}
//
////class Solution {
////    public int[] intersection(int[] nums1,int[] nums2) {
////        Set<Integer> set = new HashSet<>();
////        List<Integer> ans = new ArrayList<>();
////        for (int num : nums1) {
////
////            set.add(num);
////        }
////        for (int num : nums2) {
////            if (set.contains(num)) {
////
////                ans.add(num);
////                set.remove(num);
////            }
////        }
////        int[] result = new int[ans.size()];
////        for (int i = 0; i < ans.size(); i++) {
////
////            result[i] = ans.get(i);
////        }
////        return result;
////    }
////}