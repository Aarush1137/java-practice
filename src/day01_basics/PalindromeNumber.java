package day01_basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number to Check : ");
        int num = sc.nextInt();
        int orignal =num;
        int rev =0;
        if(num<0){
            System.out.println("invalid number");
        }
        while(num!=0){
            int temp = num%10;
            rev = (rev*10)+temp;
            num = num/10;
        }
        if(orignal == rev){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
