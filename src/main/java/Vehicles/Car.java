package Vehicles;

public abstract class Car {

    private String color;
    private double price;

    public Car(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

