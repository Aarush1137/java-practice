package day01_basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number to Check : ");
        int num = sc.nextInt();
        long fac =1;
        for(int i=1;i<=num;i++){
            fac = fac*i;
        }

        System.out.println("Factorial of " + num + " is: " + fac);
    }
}
