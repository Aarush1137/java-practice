package day02_arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] rev = new int[arr.length];
        int j = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            rev[j] = arr[i];
            j--;
        }
        for (int i = 0; i < rev.length; i++) {
            System.out.println(rev[i]);
        }
    }
}
