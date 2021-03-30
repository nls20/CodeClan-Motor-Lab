import Vehicles.Car;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> stock;

    public Dealership (double till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }
}
