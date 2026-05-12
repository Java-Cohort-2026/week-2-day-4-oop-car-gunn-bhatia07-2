public class Car {
    // TODO: Define the 3 attributes requested in Main.java
    // (make, model, year)
    String make;
    String model;
    int year;

    // TODO: Define an integer attribute for 'speed', set to 0 initially
    int speed = 0;
    
    // TODO: Write an 'accelerate' method that takes an integer amount and adds it to speed
    void accelerate (int amount) {
        speed = speed + amount;
    }

    // TODO: Write a 'brake' method that resets speed to 0
    void brake() {
        speed = 0;
    }
}
