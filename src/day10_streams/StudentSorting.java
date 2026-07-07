//package day10_streams;
//import  java.util.*;
//class Student{
//    int id;
//    String name;
//    int age;
//
//    public Student(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//public class StudentSorting {
//    static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(101, "Rahul", 24));
//        students.add(new Student(102, "Ankit", 21));
//        students.add(new Student(103, "Priya", 23));
//        students.add(new Student(104, "Sneha", 20));
//
//        System.out.println("Original List");
//        students.forEach(System.out::println);
//
//        students.sort((s1,s2) -> s1.age-s2.age);
//        System.out.println("\nSorted by Age");
//        students.forEach(System.out::println);
//
//        // Sort by name
//        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
//        System.out.println("\nSorted by Name");
//        students.forEach(System.out::println);
//    }
//}
