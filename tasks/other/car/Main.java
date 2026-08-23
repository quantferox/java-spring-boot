package tasks.other.car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", 15000));
        cars.add(new Car("Car2", 18900.50));
        cars.add(new Car("Car3", 28700.99));
        cars.add(new Car("Car4", 36451));
        cars.add(new Car("Car5", 479854));
        cars.add(new Car("Car6", 995004.47));
        cars.sort(new CarPriceComparator());
        System.out.println(cars);
    }
}
