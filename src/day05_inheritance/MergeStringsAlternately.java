//package day05_inheritance;
//
//public class MergeStringsAlternately {
//    public static void main(String[] args) {
//        Solution solution1 = new Solution();
//
//        // Test Case 1
//        String word1_1 = "abc";
//        String word2_1 = "pqr";
//        System.out.println("Test Case 1:");
//        System.out.println("Input: word1 = \"abc\", word2 = \"pqr\"");
//        System.out.println("Output:   \"" + solution.mergeAlternately(word1_1, word2_1) + "\"");
//        System.out.println("Expected: \"apbqcr\"");
//        System.out.println();
//
//        // Test Case 2
//        String word1_2 = "ab";
//        String word2_2 = "pqrs";
//        System.out.println("Test Case 2:");
//        System.out.println("Input: word1 = \"ab\", word2 = \"pqrs\"");
//        System.out.println("Output:   \"" + solution.mergeAlternately(word1_2, word2_2) + "\"");
//        System.out.println("Expected: \"apbqrs\"");
//        System.out.println();
//
//        // Test Case 3
//        String word1_3 = "abcd";
//        String word2_3 = "pq";
//        System.out.println("Test Case 3:");
//        System.out.println("Input: word1 = \"abcd\", word2 = \"pq\"");
//        System.out.println("Output:   \"" + solution.mergeAlternately(word1_3, word2_3) + "\"");
//        System.out.println("Expected: \"apbqcd\"");
//    }
//}
//
//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//        // TODO: Write your code here
//        int a= word1.length();
//        char[] a1 = word1.toCharArray();
//        int b=word2.length();
//        char[] b1 = word2.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        if(a>b){
//            for (int i = 0; i < b; i++) {
//             sb.append(a1[i]);
//             sb.append(b1[i]);
//            }
//            for (int i = b; i < a; i++) {
//                sb.append(a1[i]);
//            }
//        }else{
//            for (int i = 0; i < a; i++) {
//                sb.append(a1[i]);
//                sb.append(b1[i]);
//            }
//            for (int i = a; i < b; i++) {
//                sb.append(b1[i]);
//            }
//        }
//        String word3 = sb.toString();
//        return word3;
//    }
//}