package day01_basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        while(n>0){
            System.out.println(a+" ");
            int temp = a+b;
            a = b;
            b = temp;
            n--;
        }
    }
}
