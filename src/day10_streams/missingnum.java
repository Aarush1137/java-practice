//package day10_streams;
//import java.util.*;
//public class missingnum {
//}
////sol 1
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i) {
//                return i;
//            }
//        }
//        return nums.length;
//    }
//}
//
////sol 2
//class Solution {
//    public int missingNumber(int[] nums) {
//        int n = nums.length;
//        int expected = (n*(n+1))/2;
//        int actual=0;
//        for(int num:nums){
//            actual += num;
//        }
//        return expected-actual;
//    }
//}