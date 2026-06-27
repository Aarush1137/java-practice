package day05_inheritance;

import java.util.Arrays;
public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    // Tester code for IntelliJ
    public static void main(String[] args) {
        BestTimetoBuyandSellStock solution = new BestTimetoBuyandSellStock();

        // Test Case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 5;
        int result1 = solution.maxProfit(prices1);
        printResult(1, prices1, expected1, result1);

        // Test Case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        int expected2 = 0;
        int result2 = solution.maxProfit(prices2);
        printResult(2, prices2, expected2, result2);

        // Test Case 3 (Edge Case: Single day)
        int[] prices3 = {1};
        int expected3 = 0;
        int result3 = solution.maxProfit(prices3);
        printResult(3, prices3, expected3, result3);
    }

    private static void printResult(int testCaseNum, int[] prices, int expected, int result) {
        System.out.println("Test Case " + testCaseNum + ": " + Arrays.toString(prices));
        System.out.println("Expected: " + expected);
        System.out.println("Result:   " + result);
        if (result == expected) {
            System.out.println("Status:   PASSED ✅");
        } else {
            System.out.println("Status:   FAILED ❌");
        }
        System.out.println("-----------------------------------------");
    }
}