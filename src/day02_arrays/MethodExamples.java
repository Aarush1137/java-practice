package day02_arrays;

import java.util.Scanner;

public class MethodExamples {
    static int add(int a,int b){
        return a+b;
    }
    static int max(int a,int b){

        return (a>b) ? a : b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 nums : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("sum of two nums is "+add(a,b));
        System.out.println("sum of two nums is "+add(a,b,c));//method overload
        System.out.println("max of two num is "+max(a,b));
        System.out.println(isEven(a));
    }
}
