package day04_oops;

public class Student {
    int rollno;
    String name;
    String branch;
    public Student(int rollno, String name, String branch){
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
    }
    public void display() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("New Student enrolled.");
        System.out.println("Roll No : " + this.rollno);
        System.out.println("Name    : " + this.name);
        System.out.println("Branch  : " + this.branch);
        System.out.println("--------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Student s1 = new Student(101,"Aarush","CSE");
        s1.display();
        Student s2 = new Student(102, "Ananya", "IT");
        s2.display();
    }
}
