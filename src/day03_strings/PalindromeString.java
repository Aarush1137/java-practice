package day03_strings;

public class PalindromeString {
    public static void main(String[] args) {
        String word = "racecar";
        boolean isPalindrome = true;

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break; // Stop checking, it's not a palindrome
            }
            left++;
            right--;
        }

        System.out.println(word + " is a palindrome? " + isPalindrome);
    }
}