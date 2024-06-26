package edu.sdccd.cisc191;

public class Vehicle {
    private final String manufacturerName;
    private final int milesOnVehicle;
    private final int price;
    private final int numberOfSeats;
    private final Option[] options;

    public Vehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options) {
        this.manufacturerName = manufacturerName;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.options = options;

    }

    public Object getManufacturerName() {
        return manufacturerName;
    }

    public Object getMilesOnVehicle() {
        return milesOnVehicle;
    }

    public Object getPrice() {
        return price;
    }

    public Object getNumberOfSeats() {
        return numberOfSeats;
    }

    public Option[] getOptions() {
        return options;
    }
}
