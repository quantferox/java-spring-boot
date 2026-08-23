package tasks.other.car;

public class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.model + "-" + this.price;
    }
}
