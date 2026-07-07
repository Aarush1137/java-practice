package day10_streams;

public class ComparatorVsComparable {

    public static void main(String[] args) {

        System.out.println("Comparable");
        System.out.println("---------------------");
        System.out.println("Inside the class");
        System.out.println("Natural ordering");
        System.out.println("compareTo() method");
        System.out.println("Only one default sorting");

        System.out.println();

        System.out.println("Comparator");
        System.out.println("---------------------");
        System.out.println("Outside the class");
        System.out.println("Custom ordering");
        System.out.println("compare() method");
        System.out.println("Can have multiple sorting logic");
        System.out.println("Works very well with Lambda Expressions");
    }
}