package day05_inheritance;

public class Inheritance_Prac {
     static class Vehicle{
         String Brand;
         int Year;

         public Vehicle(String brand, int year) {
             this.Brand = brand;
             this.Year = year;
         }

         void Start(){
            System.out.println("Vehicle Started");
        }
        void Stop(){
            System.out.println("Vehicle Stopped");
        }
        void display(){
            System.out.println("______________________________");
            System.out.println("Brand : " + this.Brand);
            System.out.println("Year  : " + this.Year);
            System.out.println("______________________________");
        }
    }
    static class Car extends Vehicle{
         String Model;

        public Car(String brand, int year, String model) {
            super(brand, year);
            this.Model = model;
        }

        void PlayMusic(){
            System.out.println("Music Started");
        }

        @Override
        void display() {
            System.out.println("______________________________");
            super.display();
            System.out.println("Model : " + this.Model);
            System.out.println("______________________________");
        }
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota",2026,"HyCross");
        c.display();

    }
}
