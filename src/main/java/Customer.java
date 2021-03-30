import Vehicles.Car;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Car> ownedVehicles;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getOwnedVehicles() {
        return this.ownedVehicles.size();
    }

    public void buyVehicle(Car car) {
        this.money -= car.getPrice();
        this.ownedVehicles.add(car);
    }
}
