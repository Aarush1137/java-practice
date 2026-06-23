package day02_arrays;

import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num to find in the array {10,20,30,40,50}");
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
               index = i;
            }
        }
        if(index == -1 ){
            System.out.println("num is not in the array ");
        }else{
        System.out.println("the num is at "+index+" index of the array");
        }
    }
}
