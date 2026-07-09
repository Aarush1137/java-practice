package leetcode;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex solver = new FindPivotIndex();

        // Test Case 1
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Test Case 1: " + solver.pivotIndex(nums1)); // Expected output: 3

        // Test Case 2
        int[] nums2 = {1, 2, 3};
        System.out.println("Test Case 2: " + solver.pivotIndex(nums2)); // Expected output: -1

        // Test Case 3
        int[] nums3 = {2, 1, -1};
        System.out.println("Test Case 3: " + solver.pivotIndex(nums3)); // Expected output: 0
    }
}