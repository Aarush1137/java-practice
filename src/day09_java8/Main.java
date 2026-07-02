//package day09_java8;
//
//import java.util.*;
//
//public int[] sortedSquares(int[] nums) {
//    int[] result = new  int[nums.length];
//    for (int i = 0; i < nums.length; i++) {
//        result[i] = nums[i]*nums[i];
//    }
//    Arrays.sort(result);
//    return result;
//}
//class Solution {
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> counts = new HashMap<>();
//        int n = nums.length;
//
//        for (int num : nums) {
//            counts.put(num, counts.getOrDefault(num, 0) + 1);
//            if (counts.get(num) > n / 2) {
//                return num;
//            }
//        }
//
//        return -1;
//    }
//}
//
//class Solution {
//    public void moveZeroes(int[] nums) {
//        int insertPos = 0;
//
//        for (int num : nums) {
//            if (num != 0) {
//                nums[insertPos++] = num;
//            }
//        }
//
//        while (insertPos < nums.length) {
//            nums[insertPos++] = 0;
//        }
//    }
//}