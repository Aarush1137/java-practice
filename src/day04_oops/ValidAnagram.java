package day04_oops;
import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        boolean a = false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            return false;
        }else{
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==arr2[i]){
                a = true;
                }else{
                a = false;
                break;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}

//optimized

//if (s.length() != t.length())
//        return false;
//
//char[] arr1 = s.toCharArray();
//char[] arr2 = t.toCharArray();
//
//Arrays.sort(arr1);
//Arrays.sort(arr2);
//
//return Arrays.equals(arr1, arr2);