package Practice_05112022;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@Builder
@Data
public class Car {
    private String model;
    private LocalDate productionYear;
    private int price;
    private String color;
    private double engineVolume;

    public static ArrayList<Car> carFactory() {

        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = Car.builder()
                .model("bmw")
                .color("black")
                .price(1000)
                .productionYear(LocalDate.now())
                .engineVolume(2.0)
                .build();

        Car car2 = Car.builder()
                .model("bmw")
                .color("white")
                .price(1500)
                .productionYear(LocalDate.now())
                .engineVolume(1.0)
                .build();

        Car car3 = Car.builder()
                .model("mercedes")
                .color("black")
                .price(1000)
                .productionYear(LocalDate.now())
                .engineVolume(1.0)
                .build();

        Car car4 = Car.builder()
                .model("mercedes")
                .color("white")
                .price(1800)
                .productionYear(LocalDate.now())
                .engineVolume(2.0)
                .build();

        Car car5 = Car.builder()
                .model("nissan")
                .color("red")
                .price(3000)
                .productionYear(LocalDate.now())
                .engineVolume(2.0)
                .build();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }

    @Override
    public String toString() {
        return "Car:" + "\n" +
                "model:" + model + "\n" +
                "productionYear:" + productionYear + "\n" +
                "price:" + price + "\n" +
                "color:" + color + "\n" +
                "engineVolume:" + engineVolume + "\n";
    }
}
