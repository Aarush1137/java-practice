package day04_oops;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("New Employee Onboarded.");
        System.out.println("ID : " + this.id);
        System.out.println("Name    : " + this.name);
        System.out.println("Salary  : $" + this.salary);
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Aarush",13214.11);
        Employee e2 = new Employee(2,"Rish",2346.121);
        e1.display();
        e2.display();
    }
}
