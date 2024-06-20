package edu.sdccd.cisc191;

//new Car("BMW", 190000, 5995, 4, null, 2);
public class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
