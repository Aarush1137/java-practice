package day01_basics;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number to Check : ");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num <=1){
            isprime = false;
        }else{
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if(isprime == true){
            System.out.printf(num+ " is prime");
        }
        else{
            System.out.printf(num +" is not prime");
        }
    }
}
