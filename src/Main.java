public class Main {
    public static void main(String[] args) {
        // DO NOT MODIFY THIS FILE!
        // Your job is to build the Car.java file so this code works.

        Car testCar = new Car();
        testCar.make = "Volkswagen";
        testCar.model = "Passat";
        testCar.year = 2016;

        System.out.println("Starting test for: " + testCar.make + " " + testCar.model);
        
        testCar.accelerate(30);
        testCar.accelerate(25);
        testCar.brake();
        
        System.out.println("Final speed is: " + testCar.speed);
    }
}
