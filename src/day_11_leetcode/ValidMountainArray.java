package day_11_leetcode;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }

        int left = 0;
        int right = arr.length - 1;

        // Left person climbs up from the start
        while (left + 1 < arr.length && arr[left] < arr[left + 1]) {
            left++;
        }

        // Right person climbs up from the end
        while (right - 1 >= 0 && arr[right] < arr[right - 1]) {
            right--;
        }

        // Check if they met at the exact same valid peak
        // 1. They must meet at the same index (left == right)
        // 2. The peak cannot be at the very start (left == 0)
        // 3. The peak cannot be at the very end (right == arr.length - 1)
        return left == right && left > 0 && right < arr.length - 1;
    }

    // Main method to run and test your logic locally
    public static void main(String[] args) {
        ValidMountainArray solver = new ValidMountainArray();

        // Test Case 1: Too short
        int[] test1 = {2, 1};
        System.out.println("Test 1 [2, 1]: " + solver.validMountainArray(test1) + " (Expected: false)");

        // Test Case 2: Flat peak / duplicate elements
        int[] test2 = {3, 5, 5};
        System.out.println("Test 2 [3, 5, 5]: " + solver.validMountainArray(test2) + " (Expected: false)");

        // Test Case 3: Valid mountain array
        int[] test3 = {0, 3, 2, 1};
        System.out.println("Test 3 [0, 3, 2, 1]: " + solver.validMountainArray(test3) + " (Expected: true)");

        // Test Case 4: Strictly increasing (No descent)
        int[] test4 = {0, 1, 2, 3, 4, 5};
        System.out.println("Test 4 [0, 1, 2, 3, 4, 5]: " + solver.validMountainArray(test4) + " (Expected: false)");

        // Test Case 5: Strictly decreasing (No ascent)
        int[] test5 = {5, 4, 3, 2, 1, 0};
        System.out.println("Test 5 [5, 4, 3, 2, 1, 0]: " + solver.validMountainArray(test5) + " (Expected: false)");

        // Test Case 6: Multiple peaks / dips
        int[] test6 = {3, 6, 5, 6, 7, 6, 5, 3, 0};
        System.out.println("Test 6 [3, 6, 5, 6, 7, 6, 5, 3, 0]: " + solver.validMountainArray(test6) + " (Expected: false)");
    }
}